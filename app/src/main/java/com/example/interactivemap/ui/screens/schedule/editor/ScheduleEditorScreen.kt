package com.example.interactivemap.ui.screens.schedule.editor

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.interactivemap.ui.screens.schedule.viewer.ScheduleViewerViewModel

@Composable
fun ScheduleEditorScreen(navHostController: NavHostController,
    scheduleEditorViewModel: ScheduleEditorViewModel = viewModel(
        factory = ScheduleEditorViewModel.factory)
){
    
}