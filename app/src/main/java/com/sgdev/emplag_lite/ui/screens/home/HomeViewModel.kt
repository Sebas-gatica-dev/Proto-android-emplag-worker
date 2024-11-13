package com.sgdev.emplag_lite.ui.screens.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class HomeUiState(
    val title: String = "Emplag",
    val isLoading: Boolean = false,
    val employeeCount: Int = 150,
    val productivity: Float = 85f,
    val monthlyRevenue: List<Float> = listOf(20f, 35f, 25f, 40f, 45f, 50f),
    val recentActivities: List<Activity> = listOf(
        Activity(
            "Nuevo empleado registrado",
            "Juan Pérez - Departamento IT"
        ),
        Activity(
            "Proyecto completado",
            "Sistema de Inventario v2.0"
        ),
        Activity(
            "Reunión programada",
            "Review trimestral - 15:00"
        )
    )
)

data class Activity(
    val title: String,
    val description: String
)

class HomeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()
}