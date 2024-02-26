package com.example.interactivemap.logic.util

import org.threeten.bp.LocalDate
import org.threeten.bp.temporal.ChronoUnit

object DateUtil {
    fun getWeeksFromStartOfSchoolYear(): Long { val currentDate = LocalDate.now()
        var startOfSchoolYear = LocalDate.of(LocalDate.now().year, 9, 1)
        var countOfWeeks = ChronoUnit.WEEKS.between(startOfSchoolYear, currentDate)
        if (countOfWeeks < 0) {
            startOfSchoolYear = LocalDate.of(LocalDate.now().year-1, 9, 1)
            countOfWeeks = ChronoUnit.WEEKS.between(startOfSchoolYear, currentDate) }
        return countOfWeeks
    }
}