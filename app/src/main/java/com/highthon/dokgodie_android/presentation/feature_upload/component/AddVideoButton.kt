package com.highthon.dokgodie_android.presentation.feature_upload.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.ui.theme.Gray300
import com.highthon.dokgodie_android.presentation.ui.theme.TransparentGray300
import com.highthon.dokgodie_android.presentation.ui.theme.White500

@Composable
fun AddVideoButton(onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .width(200.dp)
            .height(355.dp)
            .background(White500)
            .clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .width(117.dp)
                .height(42.dp)
                .clip(RoundedCornerShape(16.dp))
                .border(
                    width = 1.dp,
                    color = Gray300,
                    shape = RoundedCornerShape(16.dp)
                )
                .background(TransparentGray300)
        ) {
            PretendardText(
                text = "영상 업로드",
                fontSize = 15.sp,
                fontWeight = FontWeight(600),
                color = Color.White,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}