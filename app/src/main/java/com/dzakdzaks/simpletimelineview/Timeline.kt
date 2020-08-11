package com.dzakdzaks.simpletimelineview

import java.io.Serializable

/**
 * ==================================//==================================
 * ==================================//==================================
 * Created on Tuesday, 11 August 2020 at 7:07 PM.
 * Project Name => Simple Timeline View
 * Package Name => com.dzakdzaks.simpletimelineview
 * ==================================//==================================
 * ==================================//==================================
 */
data class Timeline(
    val time: String,
    val title: String,
    val currentStatus: Boolean
) : Serializable


val timeLineList = listOf(
    Timeline(
        "05 Desember 2020, 13:30",
        "Pesanan telah sampai",
        true
    ),
    Timeline(
        "05 September 2020, 13:15",
        "Pesanan sedang dikirim",
        false
    ),
    Timeline(
        "05 Februari 2020, 13:05",
        "Pesanan telah di konfirmasi",
        false
    ),
    Timeline(
        "05 Januari 2020, 13:00",
        "Menunggu dikonfirmasi",
        false
    )
)