package com.highthon.dokgodie_android.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.highthon.dokgodie_android.presentation.feature_bottom_navigation.BottomNavigation
import com.highthon.dokgodie_android.presentation.feature_home.HomeScreen
import com.highthon.dokgodie_android.presentation.feature_mypage.MyPageScreen
import com.highthon.dokgodie_android.presentation.feature_upload.UploadActivity
import com.highthon.dokgodie_android.presentation.ui.theme.DokgoDieAndroidTheme

class MainActivity : ComponentActivity() {
    private var backButtonWait: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val currentActivity = LocalContext.current
            val isMainPage = remember { mutableStateOf(true) }
            DokgoDieAndroidTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        if (isMainPage.value) HomeScreen() else MyPageScreen()
                    }
                    BottomNavigation(
                        isMainPage = isMainPage.value,
                        onClickHomeButton = { isMainPage.value = true },
                        onClickMainButton = { isMainPage.value = false },
                        onClickUploadButton = {
                            startActivity(Intent(currentActivity, UploadActivity::class.java))
                        })
                }
            }
        }
    }

    override fun onBackPressed() {
        if (System.currentTimeMillis() - backButtonWait >= 2000) {
            backButtonWait = System.currentTimeMillis()
            Toast.makeText(this, "뒤로 가기 버튼을 한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show()
        } else {
            super.onBackPressed()
            finish()
        }
    }
}