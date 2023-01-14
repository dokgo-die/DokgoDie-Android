package com.highthon.dokgodie_android.presentation.feature_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.presentation.component.InputField
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.component.PrimaryButton
import com.highthon.dokgodie_android.presentation.ui.theme.Black100
import com.highthon.dokgodie_android.presentation.ui.theme.Black200

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val id = remember {
                mutableStateOf("")
            }
            val password = remember {
                mutableStateOf("")
            }
            val idError = remember {
                mutableStateOf(false)
            }
            val passwordError = remember {
                mutableStateOf(false)
            }
            Box(modifier = Modifier) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.fillMaxHeight(0.1f))
                    PretendardText(
                        text = "다시 만나서 반가워요! \uD83D\uDC4B\n" + "시작하기 전 로그인을 해주세요!",
                        fontSize = 22.sp,
                        fontWeight = FontWeight(700),
                        color = Black100,
                        modifier = Modifier.fillMaxWidth(0.9f)
                    )
                    Spacer(modifier = Modifier.size(15.dp))
                    PretendardText(
                        text = "아이디",
                        fontSize = 13.sp,
                        fontWeight = FontWeight(600),
                        color = Black200,
                        modifier = Modifier.fillMaxWidth(0.9f)
                    )
                    InputField(
                        text = id.value,
                        hint = "아이디를 입력해주세요.",
                        isError = idError.value,
                        onValueChange = {
                            id.value = it
                        },
                        errorMsg = "존재하지 않는 아이디에요.",
                        isPassword = false
                    )
                    Spacer(modifier = Modifier.size(16.dp))
                    PretendardText(
                        text = "비밀번호",
                        fontSize = 13.sp,
                        fontWeight = FontWeight(600),
                        color = Black100,
                        modifier = Modifier.fillMaxWidth(0.9f)
                    )
                    InputField(
                        text = password.value,
                        hint = "비밀번호를 입력해주세요.",
                        isError = passwordError.value,
                        onValueChange = {
                            password.value = it
                        },
                        errorMsg = "잘못 된 비밀번호에요.",
                        isPassword = true
                    )
                }
                PrimaryButton(
                    text = "로그인",
                    isClickable = id.value.isNotEmpty() && password.value.isNotEmpty(),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .offset(y = (-20).dp)
                ) {

                }
            }
        }
    }
}