package com.highthon.dokgodie_android.presentation.feature_mypage.componenet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.ui.theme.Black100
import com.highthon.dokgodie_android.presentation.ui.theme.Gray300
import com.highthon.dokgodie_android.presentation.ui.theme.White600

@Composable
fun MyInfoSection() {

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 24.dp, end = 24.dp)
        .background(White600)) {
        ProfileThumbNail()
        Spacer(modifier = Modifier.width(16.dp))
        Row {
            Column(Modifier.align(CenterVertically)) {
                PretendardText(text = "김현승", fontSize = 17.sp, fontWeight = FontWeight(700), color = Black100)
                Spacer(modifier = Modifier.height(4.dp))
                PretendardText(text = "@gus._.tmd", fontSize = 15.sp, fontWeight = FontWeight(500), color = Gray300)
            }
        }
    }
}

@Preview
@Composable
fun MyInfoSectionPreview() {
    MyInfoSection()
}