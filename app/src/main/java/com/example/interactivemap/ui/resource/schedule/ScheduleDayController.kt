package com.example.interactivemap.ui.resource.schedule

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.interactivemap.R
import com.example.interactivemap.ThisApplication
import com.example.interactivemap.ui.screens.schedule.DefScheduleViewModel
import com.example.interactivemap.ui.screens.schedule.viewer.ScheduleViewerViewModel
import com.example.interactivemap.ui.theme.InteractiveMapTheme
import com.maxkeppeker.sheets.core.models.base.rememberUseCaseState
import com.maxkeppeler.sheets.calendar.CalendarDialog
import com.maxkeppeler.sheets.calendar.models.CalendarConfig
import com.maxkeppeler.sheets.calendar.models.CalendarSelection
import com.maxkeppeler.sheets.calendar.models.CalendarStyle
import java.time.DayOfWeek
import java.time.LocalDate

@OptIn(ExperimentalMaterial3Api::class)
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ScheduleDayController (viewerViewModel: DefScheduleViewModel) {
    InteractiveMapTheme(darkTheme = ThisApplication.getInstance().darkThemeSelected) {
        val selectedDate = remember { mutableStateOf<LocalDate?>(LocalDate.now()) }

        val selectedDateRange = remember {
            val value = LocalDate.now().with(DayOfWeek.MONDAY)..LocalDate.now().with(DayOfWeek.SUNDAY)
            mutableStateOf(value)
        }

        val calendarState = rememberUseCaseState()

        CalendarDialog(
            state = calendarState, config = CalendarConfig(style = CalendarStyle.WEEK, boundary = selectedDateRange.value),
            selection = CalendarSelection.Date(selectedDate = selectedDate.value){ date -> selectedDate.value = date
                viewerViewModel.onDateSelected(date) }
        )

        Row(
            modifier = Modifier.fillMaxSize().alpha(alpha = 0.7f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Icon(painter = painterResource(id = R.drawable.ic_left), contentDescription = null,
                tint = MaterialTheme.colorScheme.onPrimary.copy(alpha = if (viewerViewModel.scheduleExist.value) 1f else 0.7f),
                modifier = Modifier.size(16.dp).clickable {if (viewerViewModel.scheduleExist.value) viewerViewModel.onClickPrevDay() }
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(text = viewerViewModel.dayOfWeek.value, modifier = Modifier.clickable { calendarState.show() },
                style = MaterialTheme.typography.bodyLarge
                    .copy(color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f), textAlign = TextAlign.Center)
            )

            Spacer(modifier = Modifier.weight(1f))

            Icon(painter = painterResource(id = R.drawable.ic_right), contentDescription = null,
                tint = MaterialTheme.colorScheme.onPrimary.copy(alpha = if (viewerViewModel.scheduleExist.value) 1f else 0.7f),
                modifier = Modifier.size(16.dp).clickable {if (viewerViewModel.scheduleExist.value) viewerViewModel.onClickNextDay() }
            )
        }
    }
}

