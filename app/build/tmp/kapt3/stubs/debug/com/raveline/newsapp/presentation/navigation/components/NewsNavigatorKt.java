package com.raveline.newsapp.presentation.navigation.components;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"articleModelKey", "", "NewsNavigator", "", "navigateToDetails", "navController", "Landroidx/navigation/NavController;", "articleModel", "Lcom/raveline/newsapp/domain/model/ArticleModel;", "navigateToTab", "route", "app_debug"})
public final class NewsNavigatorKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String articleModelKey = "article";
    
    /**
     * `NewsNavigator` is a composable function that manages the navigation of the news application.
     * It's annotated with `@Composable`, indicating that it's a composable function that describes part of the UI.
     *
     * @property bottomNavigationItems A list of items to be displayed in the bottom navigation bar.
     * @property navController A `NavController` that manages app navigation.
     * @property backStackState The current state of the navigation back stack.
     * @property selectedItem The index of the currently selected item in the bottom navigation bar.
     * @property isBottomBarVisible A boolean value that determines whether the bottom navigation bar should be visible.
     *
     * @method NewsNavigator This function sets up the navigation for the application.
     * @method Scaffold This function provides a framework that materializes the Material Design specification.
     * @method NavHost This function sets up a navigation graph within the application.
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @androidx.annotation.RequiresExtension(extension = android.os.Build.VERSION_CODES.S, version = 7)
    @androidx.compose.runtime.Composable
    public static final void NewsNavigator() {
    }
    
    private static final void navigateToTab(androidx.navigation.NavController navController, java.lang.String route) {
    }
    
    private static final void navigateToDetails(androidx.navigation.NavController navController, com.raveline.newsapp.domain.model.ArticleModel articleModel) {
    }
}