package com.raveline.newsapp.presentation.screen.home.components;

/**
 * `HomeEvent` is a sealed class that represents the different events that can occur on the home screen.
 *
 * @property UpdateScrollValue Represents an event where the scroll value is updated.
 * @property UpdateMaxScrollValue Represents an event where the maximum scroll value is updated.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/raveline/newsapp/presentation/screen/home/components/HomeEvent;", "", "()V", "UpdateMaxScrollValue", "UpdateScrollValue", "Lcom/raveline/newsapp/presentation/screen/home/components/HomeEvent$UpdateMaxScrollValue;", "Lcom/raveline/newsapp/presentation/screen/home/components/HomeEvent$UpdateScrollValue;", "app_debug"})
public abstract class HomeEvent {
    
    private HomeEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/raveline/newsapp/presentation/screen/home/components/HomeEvent$UpdateMaxScrollValue;", "Lcom/raveline/newsapp/presentation/screen/home/components/HomeEvent;", "newValue", "", "(I)V", "getNewValue", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class UpdateMaxScrollValue extends com.raveline.newsapp.presentation.screen.home.components.HomeEvent {
        private final int newValue = 0;
        
        public UpdateMaxScrollValue(int newValue) {
        }
        
        public final int getNewValue() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.raveline.newsapp.presentation.screen.home.components.HomeEvent.UpdateMaxScrollValue copy(int newValue) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/raveline/newsapp/presentation/screen/home/components/HomeEvent$UpdateScrollValue;", "Lcom/raveline/newsapp/presentation/screen/home/components/HomeEvent;", "newValue", "", "(I)V", "getNewValue", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class UpdateScrollValue extends com.raveline.newsapp.presentation.screen.home.components.HomeEvent {
        private final int newValue = 0;
        
        public UpdateScrollValue(int newValue) {
        }
        
        public final int getNewValue() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.raveline.newsapp.presentation.screen.home.components.HomeEvent.UpdateScrollValue copy(int newValue) {
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