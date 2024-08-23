package com.example.interactivemap.ui.translations

import android.annotation.SuppressLint
import android.content.Context
import com.example.interactivemap.R

@SuppressLint("StaticFieldLeak")
object Tr {
    private lateinit var context: Context

    fun initialize(context: Context) {
        this.context = context.applicationContext
    }

    val app_name: String
        get() = context.getString(R.string.app_name)
    val un_name: String
        get() = context.getString(R.string.un_name)
    val app_description: String
        get() = context.getString(R.string.app_description)
    val un_site: String
        get() = context.getString(R.string.un_site)
    val navigation: String
        get() = context.getString(R.string.navigation)
    val skip: String
        get() = context.getString(R.string.skip)
    val navigation_description: String
        get() = context.getString(R.string.navigation_description)
    val navigation_description_full: String
        get() = context.getString(R.string.navigation_description_full)
    val go_to_application: String
        get() = context.getString(R.string.go_to_application)
    val distant_description_full: String
        get() = context.getString(R.string.distant_description_full)
    val distant_description: String
        get() = context.getString(R.string.distant_description)
    val distant: String
        get() = context.getString(R.string.distant)
    val schedule_description_full: String
        get() = context.getString(R.string.schedule_description_full)
    val schedule_description: String
        get() = context.getString(R.string.schedule_description)
    val schedule_lessons: String
        get() = context.getString(R.string.schedule_lessons)
    val settings: String
        get() = context.getString(R.string.settings)
    val general: String
        get() = context.getString(R.string.general)
    val language: String
        get() = context.getString(R.string.language)
    val dark_theme: String
        get() = context.getString(R.string.dark_theme)
    val online_education: String
        get() = context.getString(R.string.online_education)
    val view_demo: String
        get() = context.getString(R.string.view_demo)
    val to_main_page: String
        get() = context.getString(R.string.to_main_page)
    val version: String
        get() = context.getString(R.string.version)
    val version_: String
        get() = context.getString(R.string.version_)
    val save: String
        get() = context.getString(R.string.save)
    val load: String
        get() = context.getString(R.string.load)
    val create_schedule: String
        get() = context.getString(R.string.create_schedule)
    val edit_schedule: String
        get() = context.getString(R.string.edit_schedule)
    val change: String
        get() = context.getString(R.string.change)
    val signifier: String
        get() = context.getString(R.string.signifier)
    val save_schedule: String
        get() = context.getString(R.string.save_schedule)
    val save_changes: String
        get() = context.getString(R.string.save_changes)
    val add_read_data: String
        get() = context.getString(R.string.add_read_data)
    val create: String
        get() = context.getString(R.string.create)
    val edit: String
        get() = context.getString(R.string.edit)
    val recover: String
        get() = context.getString(R.string.recover)
    val dismiss: String
        get() = context.getString(R.string.dismiss)
    val lesson_data: String
        get() = context.getString(R.string.lesson_data)
    val place_data: String
        get() = context.getString(R.string.place_data)
    val lesson: String
        get() = context.getString(R.string.lesson)
    val tutor_: String
        get() = context.getString(R.string.tutor_)
    val lider: String
        get() = context.getString(R.string.lider)
    val kab: String
        get() = context.getString(R.string.kab)
    val link: String
        get() = context.getString(R.string.link)
    val specified_lesson: String
        get() = context.getString(R.string.specified_lesson)
    val close_viewer: String
        get() = context.getString(R.string.close_viewer)
    val confirm: String
        get() = context.getString(R.string.confirm)
    val close: String
        get() = context.getString(R.string.close)
    val week: String
        get() = context.getString(R.string.week)
    val onEditDismiss: String
        get() = context.getString(R.string.onEditDismiss)
    val onFindReserveCopy: String
        get() = context.getString(R.string.onFindReserveCopy)
    val onDeleteLesson: String
        get() = context.getString(R.string.onDeleteLesson)
    val confirmation: String
        get() = context.getString(R.string.confirmation)
    val info: String
        get() = context.getString(R.string.info)
    val exit: String
        get() = context.getString(R.string.exit)
    val restore: String
        get() = context.getString(R.string.restore)
    val delete: String
        get() = context.getString(R.string.delete)
    val permission: String
        get() = context.getString(R.string.permission)
    val permission_description: String
        get() = context.getString(R.string.permission_description)
    val permission_grant: String
        get() = context.getString(R.string.permission_grant)
    val permission_denied: String
        get() = context.getString(R.string.permission_denied)
    val permission_check: String
        get() = context.getString(R.string.permission_check)
    val location_not_found: String
        get() = context.getString(R.string.location_not_found)
    val sk: String
        get() = context.getString(R.string.sk)
    val s: String
        get() = context.getString(R.string.s)
    val n: String
        get() = context.getString(R.string.n)
    val save_success: String
        get() = context.getString(R.string.save_success)
    val save_file_error: String
        get() = context.getString(R.string.save_file_error)
    val translation_error: String
        get() = context.getString(R.string.translation_error)
    val schedule: String
        get() = context.getString(R.string.schedule)
    val schedule_not_exist: String
        get() = context.getString(R.string.schedule_not_exist)
    val schedule_not_exist_text: String
        get() = context.getString(R.string.schedule_not_exist_text)
    val schedule_not_exist_description: String
        get() = context.getString(R.string.schedule_not_exist_description)
    val default_language: String
        get() = context.getString(R.string.default_language)
    val search_request: String
        get() = context.getString(R.string.search_request)
    val search_no_result: String
        get() = context.getString(R.string.search_no_result)
    val loading: String
        get() = context.getString(R.string.loading)
    val pleaseWaiting: String
        get() = context.getString(R.string.pleaseWaiting)
    val all_fields_mast_be_filled: String
        get() = context.getString(R.string.all_fields_mast_be_filled)
    val find_road: String
        get() = context.getString(R.string.find_road)
    val start_point: String
        get() = context.getString(R.string.start_point)
    val end_point: String
        get() = context.getString(R.string.end_point)
    val select_point: String
        get() = context.getString(R.string.select_point)
    val your_location: String
        get() = context.getString(R.string.your_location)
    val confirm_it: String
        get() = context.getString(R.string.confirm_it)
    val points_to_create_road_not_selected: String
        get() = context.getString(R.string.points_to_create_road_not_selected)
}