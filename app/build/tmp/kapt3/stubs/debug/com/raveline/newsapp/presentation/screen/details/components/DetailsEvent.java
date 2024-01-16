package com.raveline.newsapp.presentation.screen.details.components;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/raveline/newsapp/presentation/screen/details/components/DetailsEvent;", "", "()V", "RemoveSideEffect", "UpsertArticle", "Lcom/raveline/newsapp/presentation/screen/details/components/DetailsEvent$RemoveSideEffect;", "Lcom/raveline/newsapp/presentation/screen/details/components/DetailsEvent$UpsertArticle;", "app_debug"})
public abstract class DetailsEvent {
    
    private DetailsEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/raveline/newsapp/presentation/screen/details/components/DetailsEvent$RemoveSideEffect;", "Lcom/raveline/newsapp/presentation/screen/details/components/DetailsEvent;", "()V", "app_debug"})
    public static final class RemoveSideEffect extends com.raveline.newsapp.presentation.screen.details.components.DetailsEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.raveline.newsapp.presentation.screen.details.components.DetailsEvent.RemoveSideEffect INSTANCE = null;
        
        private RemoveSideEffect() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/raveline/newsapp/presentation/screen/details/components/DetailsEvent$UpsertArticle;", "Lcom/raveline/newsapp/presentation/screen/details/components/DetailsEvent;", "article", "Lcom/raveline/newsapp/domain/model/ArticleModel;", "(Lcom/raveline/newsapp/domain/model/ArticleModel;)V", "getArticle", "()Lcom/raveline/newsapp/domain/model/ArticleModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class UpsertArticle extends com.raveline.newsapp.presentation.screen.details.components.DetailsEvent {
        @org.jetbrains.annotations.NotNull
        private final com.raveline.newsapp.domain.model.ArticleModel article = null;
        
        public UpsertArticle(@org.jetbrains.annotations.NotNull
        com.raveline.newsapp.domain.model.ArticleModel article) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.raveline.newsapp.domain.model.ArticleModel getArticle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.raveline.newsapp.domain.model.ArticleModel component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.raveline.newsapp.presentation.screen.details.components.DetailsEvent.UpsertArticle copy(@org.jetbrains.annotations.NotNull
        com.raveline.newsapp.domain.model.ArticleModel article) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}