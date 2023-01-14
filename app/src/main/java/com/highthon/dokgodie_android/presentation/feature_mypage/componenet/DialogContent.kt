package com.highthon.dokgodie_android.presentation.feature_mypage.componenet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import coil.compose.rememberAsyncImagePainter
import com.highthon.dokgodie_android.R
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.ui.theme.*

@Composable
fun DialogContent(userName: String, userProfile: String, onClick: () -> Unit) {
    val star1 = remember {
        mutableStateOf(false)
    }
    val star2 = remember {
        mutableStateOf(false)
    }
    val star3 = remember {
        mutableStateOf(false)
    }
    val star4 = remember {
        mutableStateOf(false)
    }
    val star5 = remember {
        mutableStateOf(false)
    }
    Dialog(onDismissRequest = { onClick() }) {
        Column(
            modifier = Modifier
                .height(328.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.size(20.dp))
            Image(
                painter = rememberAsyncImagePainter(userProfile),
                contentDescription = "UserImage",
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.size(16.dp))
            PretendardText(
                text = "$userName 님에게 몇점을 주시겠어요?",
                fontSize = 17.sp,
                fontWeight = FontWeight(700),
                color = Black100
            )
            Spacer(modifier = Modifier.size(4.dp))
            PretendardText(
                text = "다시 거래하고 싶은 만큼 점수를 부여해주세요.",
                fontSize = 15.sp,
                fontWeight = FontWeight(600),
                color = Gray300
            )
            Spacer(modifier = Modifier.size(12.dp))
            Row {
                Image(
                    painter = painterResource(id = if (star1.value) R.drawable.star_rate else R.drawable.star_not_rate),
                    contentDescription = "Star",
                    modifier = Modifier.clickable {
                        if (star1.value) {
                            star5.value = false
                            star4.value = false
                            star3.value = false
                            star2.value = false
                            star1.value = false
                        } else {
                            star1.value = true
                        }
                    }
                )
                Spacer(modifier = Modifier.size(30.dp))
                Image(
                    painter = painterResource(id = if (star2.value) R.drawable.star_rate else R.drawable.star_not_rate),
                    contentDescription = "Star",
                    modifier = Modifier.clickable {
                        if (star2.value) {
                            star5.value = false
                            star4.value = false
                            star3.value = false
                            star2.value = false
                        } else {
                            star1.value = true
                            star2.value = true
                        }
                    }
                )
                Spacer(modifier = Modifier.size(30.dp))
                Image(
                    painter = painterResource(id = if (star3.value) R.drawable.star_rate else R.drawable.star_not_rate),
                    contentDescription = "Star",
                    modifier = Modifier.clickable {
                        if (star3.value) {
                            star5.value = false
                            star4.value = false
                            star3.value = false
                        } else {
                            star1.value = true
                            star2.value = true
                            star3.value = true
                        }
                    }
                )
                Spacer(modifier = Modifier.size(30.dp))
                Image(
                    painter = painterResource(id = if (star4.value) R.drawable.star_rate else R.drawable.star_not_rate),
                    contentDescription = "Star",
                    modifier = Modifier.clickable {
                        if (star4.value) {
                            star5.value = false
                            star4.value = false
                        } else {
                            star1.value = true
                            star2.value = true
                            star3.value = true
                            star4.value = true
                        }
                    }
                )
                Spacer(modifier = Modifier.size(30.dp))
                Image(
                    painter = painterResource(id = if (star5.value) R.drawable.star_rate else R.drawable.star_not_rate),
                    contentDescription = "Star",
                    modifier = Modifier.clickable {
                        if (star5.value) {
                            star5.value = false
                        } else {
                            star1.value = true
                            star2.value = true
                            star3.value = true
                            star4.value = true
                            star5.value = true
                        }
                    }
                )
            }
            Spacer(modifier = Modifier.size(23.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = { onClick() },
                    modifier = Modifier
                        .width(140.dp)
                        .height(46.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = PrimarySub)
                ) {
                    PretendardText(
                        text = "취소",
                        fontSize = 15.sp,
                        fontWeight = FontWeight(600),
                        color = PrimaryColor,
                        modifier = Modifier
                    )
                }
                Spacer(modifier = Modifier.size(8.dp))
                Button(
                    onClick = { onClick() },
                    modifier = Modifier
                        .width(140.dp)
                        .height(46.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = PrimaryColor)
                ) {
                    PretendardText(
                        text = "확인",
                        fontSize = 15.sp,
                        fontWeight = FontWeight(600),
                        color = White600,
                        modifier = Modifier
                    )
                }
            }
        }
    }
}