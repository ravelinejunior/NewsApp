package com.raveline.newsapp.presentation.screen.home.components

/**
 * `HomeEvent` is a sealed class that represents the different events that can occur on the home screen.
 *
 * @property UpdateScrollValue Represents an event where the scroll value is updated.
 * @property UpdateMaxScrollValue Represents an event where the maximum scroll value is updated.
 */
sealed class HomeEvent {
    data class UpdateScrollValue(val newValue:Int):HomeEvent()
    data class UpdateMaxScrollValue(val newValue:Int):HomeEvent()
}