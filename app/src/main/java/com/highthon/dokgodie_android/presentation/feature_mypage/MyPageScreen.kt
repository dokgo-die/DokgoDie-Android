package com.highthon.dokgodie_android.presentation.feature_mypage

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.component.TopBar
import com.highthon.dokgodie_android.presentation.feature_mypage.componenet.GradeOfUser
import com.highthon.dokgodie_android.presentation.feature_mypage.componenet.MyInfoSection
import com.highthon.dokgodie_android.presentation.feature_mypage.componenet.RecentContactSection
import com.highthon.dokgodie_android.presentation.ui.theme.Black100
import com.highthon.dokgodie_android.presentation.ui.theme.White500
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
        GradeOfUser()
        Spacer(modifier = Modifier.height(20.dp))
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(16.dp)
                .background(White500), onDraw = {})
        Spacer(modifier = Modifier.height(32.dp))
        PretendardText(
            text = "최근 대화 요청한 상대",
            fontSize = 17.sp,
            fontWeight = FontWeight(700),
            color = Black100,
            modifier = Modifier.padding(start = 24.dp)
        )
        Spacer(modifier = Modifier.height(21.dp))
        RecentContactSection(
            list = listOf(
                RecentContactsData(
                    userName = "이현빈",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 3,
                    theNumberOfGrader = 102
                ),
                RecentContactsData(
                    userName = "강민",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 5,
                    theNumberOfGrader = 5022
                ),
                RecentContactsData(
                    userName = "김시훈",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 4,
                    theNumberOfGrader = 2004
                ),
                RecentContactsData(
                    userName = "김준",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 4,
                    theNumberOfGrader = 4000
                ),
                RecentContactsData(
                    userName = "최민재",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 5,
                    theNumberOfGrader = 69283
                ),
                RecentContactsData(
                    userName = "이용진",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 5,
                    theNumberOfGrader = 7000
                ),
                RecentContactsData(
                    userName = "임세현",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 5,
                    theNumberOfGrader = 83949
                ),
                RecentContactsData(
                    userName = "김성길",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 3,
                    theNumberOfGrader = 3
                ),
                RecentContactsData(
                    userName = "임가람",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 4,
                    theNumberOfGrader = 263
                ),
                RecentContactsData(
                    userName = "전승원",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 2,
                    theNumberOfGrader = 1315
                ),
                RecentContactsData(
                    userName = "심미진",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 5,
                    theNumberOfGrader = 126351
                ),
                RecentContactsData(
                    userName = "지인호",
                    userId = "gun._.tmd",
                    userProfile = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
                    grade = 3,
                    theNumberOfGrader = 12431364
                )
            )
        )
    }
}

@Preview
@Composable
fun MyPageScreenPreview() {
    MyPageScreen()
}