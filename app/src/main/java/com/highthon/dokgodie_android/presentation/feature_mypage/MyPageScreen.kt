package com.highthon.dokgodie_android.presentation.feature_mypage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.highthon.dokgodie_android.presentation.component.TopBar
import com.highthon.dokgodie_android.presentation.feature_mypage.componenet.MyInfoSection
import com.highthon.dokgodie_android.presentation.ui.theme.White500

@Composable
fun MyPageScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(White500)) {
        TopBar(text = "마이 페이지", isNeedBackPressButton = false)
        MyInfoSection()
    }
}

@Preview
@Composable
fun MyPageScreenPreview() {
    MyPageScreen()
}