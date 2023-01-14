package com.highthon.dokgodie_android.presentation.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.highthon.dokgodie_android.R

object Font {
    val pretendard = FontFamily(
        Font(R.font.pretendard_black, FontWeight.Black, FontStyle.Normal),
        Font(R.font.pretendard_bold, FontWeight.Bold, FontStyle.Normal),
        Font(R.font.pretendard_extrabold, FontWeight.ExtraBold, FontStyle.Normal),
        Font(R.font.pretendard_extralight, FontWeight.ExtraLight, FontStyle.Normal),
        Font(R.font.pretendard_light, FontWeight.Light, FontStyle.Normal),
        Font(R.font.pretendard_medium, FontWeight.Medium, FontStyle.Normal),
        Font(R.font.pretendard_regular, FontWeight.Normal, FontStyle.Normal),
        Font(R.font.pretendard_semibold, FontWeight.SemiBold, FontStyle.Normal),
        Font(R.font.pretendard_thin, FontWeight.Thin, FontStyle.Normal),
    )
}