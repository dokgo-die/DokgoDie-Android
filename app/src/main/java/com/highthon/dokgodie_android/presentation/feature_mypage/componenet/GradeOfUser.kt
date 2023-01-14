package com.highthon.dokgodie_android.presentation.feature_mypage.componenet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.R
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.ui.theme.Black100
import com.highthon.dokgodie_android.presentation.ui.theme.PrimaryColor
import com.highthon.dokgodie_android.presentation.ui.theme.White600

@Composable
fun GradeOfUser() {
    val text = "가나다라"
    val grade = "4.4"
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 24.dp)
        .background(White600)) {
        Spacer(modifier = Modifier.width(3.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_campaign),
            contentDescription = "campaign",
            modifier = Modifier.align(CenterVertically)
        )
        Spacer(modifier = Modifier.width(10.dp))
        PretendardText(text = "$text 님의 평점은 ", fontSize = 15.sp, fontWeight = FontWeight(600), color = Black100)
        PretendardText(text = "${grade}점", fontSize = 15.sp, fontWeight = FontWeight(600), color = PrimaryColor)
        PretendardText(text = "이에요. ", fontSize = 15.sp, fontWeight = FontWeight(600), color = Black100)

    }
}

@Preview
@Composable
fun GradeOfUserPreview() {
    GradeOfUser()
}