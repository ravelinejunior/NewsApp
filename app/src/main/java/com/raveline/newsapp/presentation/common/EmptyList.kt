package com.raveline.newsapp.presentation.common

import android.net.http.NetworkException
import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.wear.compose.material3.ContentAlpha
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionResult
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.raveline.newsapp.R
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.ui.theme.Dimens.SmallPadding
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun EmptyScreen(
    error: LoadState.Error? = null,
    articles: LazyPagingItems<ArticleModel>? = null
) {
    var message by remember {
        mutableStateOf("Empty News Here")
    }

    var resRaw by remember {
        mutableIntStateOf(R.raw.searching_data)
    }

    if (error != null) {
        message = parseErrorMessage(error)
        resRaw = R.raw.no_data
    }

    var startAnimation by remember {
        mutableStateOf(false)
    }
    val alphaAnim by animateFloatAsState(
        targetValue = if (startAnimation) ContentAlpha.disabled else 0f, animationSpec = tween(
            durationMillis = 1000
        ), label = ""
    )

    LaunchedEffect(key1 = true) {
        startAnimation = true
    }

    EmptyContent(
        alphaAnim = alphaAnim,
        message = message,
        resRaw = resRaw,
        articles = articles,
        error = error
    )

}

@Composable
fun EmptyContent(
    alphaAnim: Float,
    message: String,
    resRaw: Int,
    articles: LazyPagingItems<ArticleModel>? = null,
    error: LoadState.Error? = null,
) {

    var isRefreshing by remember {
        mutableStateOf(false)
    }

    SwipeRefresh(
        swipeEnabled = error != null,
        state = rememberSwipeRefreshState(isRefreshing = isRefreshing),
        onRefresh = {
            isRefreshing = !isRefreshing
            articles?.refresh()
            isRefreshing = !isRefreshing
        }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            val composition: LottieCompositionResult = rememberLottieComposition(
                spec = LottieCompositionSpec.RawRes(resRaw)
            )

            val progress by animateLottieCompositionAsState(
                composition = composition.value,
                isPlaying = true,
                speed = 1f,
                iterations = LottieConstants.IterateForever,
            )

            LottieAnimation(
                modifier = Modifier
                    .fillMaxHeight(0.68f)
                    .fillMaxWidth(0.9f),
                composition = composition.value,
                maintainOriginalImageBounds = true,
                progress = progress
            )

            Text(
                modifier = Modifier
                    .padding(top = SmallPadding, bottom = SmallPadding)
                    .alpha(alphaAnim),
                text = message,
                color = if (isSystemInDarkTheme()) LightGray else DarkGray,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.bodyMedium.fontSize
            )
            Spacer(Modifier)
        }
    }
}

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
fun parseErrorMessage(mError: LoadState.Error?): String {
    return when (mError?.error) {
        is SocketTimeoutException -> {
            "Server Unavailable!"
        }

        is ConnectException -> {
            "Internet Unavailable!"
        }

        is UnknownHostException -> {
            "${mError.error.message!!}\nVerify your internet connection."
        }

        is NetworkException -> {
            "Internet Unavailable!"
        }

        else -> {
            "Verify your internet connection."
        }

    }
}

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Preview(showBackground = true)
@Composable
fun EmptyScreenPreview() {
    EmptyScreen(error = LoadState.Error(SocketTimeoutException()))
}