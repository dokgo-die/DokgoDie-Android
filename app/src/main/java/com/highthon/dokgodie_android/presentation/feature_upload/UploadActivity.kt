package com.highthon.dokgodie_android.presentation.feature_upload

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.presentation.component.InputField
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.component.PrimaryButton
import com.highthon.dokgodie_android.presentation.component.TopBar
import com.highthon.dokgodie_android.presentation.feature_upload.component.AddVideoButton
import com.highthon.dokgodie_android.presentation.feature_upload.component.VideoView
import com.highthon.dokgodie_android.presentation.ui.theme.Black200
import com.highthon.dokgodie_android.presentation.ui.theme.White500

class UploadActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val videoUri = remember {
                mutableStateOf<Uri?>(null)
            }

            val pickMediaActivityResultLauncher = rememberLauncherForActivityResult(
                ActivityResultContracts.GetContent()
            ) { uri ->
                videoUri.value = uri
            }

            val productName = remember {
                mutableStateOf("")
            }
            val relevantLink = remember {
                mutableStateOf("")
            }
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TopBar(text = "상품 업로드", isNeedBackPressButton = true, onClick = {

                })
                Spacer(modifier = Modifier.size(8.dp))
                if (videoUri.value == null) {
                    AddVideoButton {
                        pickMediaActivityResultLauncher.launch("video/*")
                    }
                } else {
                    VideoView(videoUri = videoUri.value!!) {
                        pickMediaActivityResultLauncher.launch("video/*")
                    }
                }
                Spacer(modifier = Modifier.size(24.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(16.dp)
                        .background(White500)
                )
                Spacer(modifier = Modifier.size(24.dp))
                Column {
                    PretendardText(
                        text = "물품 이름",
                        fontSize = 13.sp,
                        fontWeight = FontWeight(600),
                        color = Black200
                    )
                    InputField(
                        text = productName.value,
                        hint = "제품 이름을 입력해 주세요.",
                        onValueChange = {
                            productName.value = it
                        }
                    )
                    Spacer(modifier = Modifier.size(16.dp))
                    PretendardText(
                        text = "관련링크",
                        fontSize = 13.sp,
                        fontWeight = FontWeight(600),
                        color = Black200
                    )
                    InputField(
                        text = relevantLink.value,
                        hint = "관련링크를 작성해 주세요.",
                        onValueChange = {
                            relevantLink.value = it
                        }
                    )
                }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    PrimaryButton(
                        text = "업로드",
                        isClickable = productName.value.isNotEmpty() && relevantLink.value.isNotEmpty()
                    ) {

                    }
                    Spacer(modifier = Modifier.size(20.dp))
                }
            }
        }
    }
}