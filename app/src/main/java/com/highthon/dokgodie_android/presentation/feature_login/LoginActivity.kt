package com.highthon.dokgodie_android.presentation.feature_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.ui.theme.Black100

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Spacer(
                    modifier = Modifier
                        .fillMaxHeight(0.1f)
                        .fillMaxWidth(0.9f)
                )
                PretendardText(
                    text = "다시 만나서 반가워요! \uD83D\uDC4B\n" +
                            "시작하기 전 로그인을 해주세요!",
                    fontSize = 22.sp,
                    fontWeight = FontWeight(700),
                    color = Black100
                )
            }
        }
    }
}