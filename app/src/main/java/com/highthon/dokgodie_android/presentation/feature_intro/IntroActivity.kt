package com.highthon.dokgodie_android.presentation.feature_intro

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.R
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.component.PrimaryButton
import com.highthon.dokgodie_android.presentation.feature_login.LoginActivity
import com.highthon.dokgodie_android.presentation.ui.theme.Gray400

class IntroActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "AppIcon",
                    modifier = Modifier.align(Alignment.Center)
                )
                PrimaryButton(
                    text = "새로운 계정으로 시작하기",
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .offset(y = (-42).dp)
                ) {

                }
                PretendardText(
                    text = "기존에 사용하던 계정이 있어요!",
                    fontSize = 13.sp,
                    fontWeight = FontWeight(600),
                    color = Gray400,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .offset(y = (-16).dp)
                        .clickable(
                            interactionSource = MutableInteractionSource(),
                            indication = null
                        ) {
                            startActivity(Intent(this@IntroActivity, LoginActivity::class.java))
                            finish()
                        }
                )
            }
        }
    }
}