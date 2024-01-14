package com.raveline.newsapp.presentation.screen.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.raveline.newsapp.domain.model.pages
import com.raveline.newsapp.presentation.common.NewsButton
import com.raveline.newsapp.presentation.common.NewsTextButton
import com.raveline.newsapp.presentation.screen.onboarding.components.OnBoardingEvent
import com.raveline.newsapp.presentation.screen.onboarding.components.OnBoardingPage
import com.raveline.newsapp.presentation.screen.onboarding.components.PageIndicator
import com.raveline.newsapp.ui.theme.Dimens
import com.raveline.newsapp.ui.theme.Dimens.PageIndicatorWidth
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(
    event: (OnBoardingEvent) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        val pagerState = rememberPagerState {
            pages.size
        }

        val buttonState = remember {
            derivedStateOf {
                when (pagerState.currentPage) {
                    0 -> listOf("", "Next")
                    1 -> listOf("Back", "Next")
                    2 -> listOf("Back", "Next")
                    3 -> listOf("Back", "Get Started")
                    else -> listOf("", "")
                }
            }
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            HorizontalPager(state = pagerState) { index ->

                val pageSize = remember {
                    if (index == 3) {
                        mutableStateOf(500.dp)
                    } else {
                        mutableStateOf(400.dp)
                    }
                }
                OnBoardingPage(page = pages[index], pageSize = pageSize.value)
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = Dimens.MediumPadding2)
                .navigationBarsPadding(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PageIndicator(
                modifier = Modifier.width(PageIndicatorWidth),
                pageSize = pages.size,
                selectedPage = pagerState.currentPage
            )

            Row(verticalAlignment = Alignment.CenterVertically) {
                val scope = rememberCoroutineScope()

                if (buttonState.value[0].isNotEmpty()) {
                    NewsTextButton(text = buttonState.value[0]) {
                        scope.launch {
                            pagerState.animateScrollToPage(page = pagerState.currentPage - 1)
                        }
                    }
                }

                NewsButton(text = buttonState.value[1]) {
                    scope.launch {
                        if (pagerState.currentPage == 3) {
                            //Save user entry
                            event(OnBoardingEvent.SaveAppEntry)
                        } else {
                            pagerState.animateScrollToPage(
                                page = pagerState.currentPage + 1
                            )
                        }
                    }
                }
            }
        }
    }
}





















