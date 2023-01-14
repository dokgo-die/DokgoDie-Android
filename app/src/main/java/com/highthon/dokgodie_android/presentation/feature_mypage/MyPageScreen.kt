package com.highthon.dokgodie_android.presentation.feature_mypage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.highthon.dokgodie_android.presentation.component.TopBar
import com.highthon.dokgodie_android.presentation.feature_mypage.componenet.MyInfoSection
import com.highthon.dokgodie_android.presentation.ui.theme.White600

@Composable
fun MyPageScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White600)
    ) {
        TopBar(
            text = "마이 페이지",
            isNeedBackPressButton = false,
            modifier = Modifier.align(CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        MyInfoSection()
        Spacer(modifier = Modifier.height(20.dp))

    }
}

@Preview
@Composable
fun MyPageScreenPreview() {
    MyPageScreen()
}