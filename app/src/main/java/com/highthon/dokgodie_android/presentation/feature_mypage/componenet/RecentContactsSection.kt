package com.highthon.dokgodie_android.presentation.feature_mypage.componenet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterEnd
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.highthon.dokgodie_android.R
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.feature_mypage.RecentContactsData
import com.highthon.dokgodie_android.presentation.ui.theme.Black100
import com.highthon.dokgodie_android.presentation.ui.theme.Gray400
import com.highthon.dokgodie_android.presentation.ui.theme.PrimaryColor

@Composable
fun RecentContactSection(list: List<RecentContactsData>) {
    LazyColumn {
        items(list.size) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)
            ) {
                Row(modifier = Modifier.align(TopStart)) {
                    Image(
                        painter = rememberAsyncImagePainter(list[it].userProfile),
                        contentDescription = "theProfileImageOfUser",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .height(40.dp)
                            .width(40.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        PretendardText(
                            text = list[it].userName,
                            fontSize = 15.sp,
                            fontWeight = FontWeight(600),
                            color = Black100
                        )
                        Row {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_star_rate),
                                contentDescription = "star",
                                tint = PrimaryColor,
                                modifier = Modifier.align(CenterVertically)
                            )
                            Spacer(modifier = Modifier.width(7.dp))
                            PretendardText(
                                text = list[it].grade.toString(),
                                fontSize = 12.sp,
                                fontWeight = FontWeight(500),
                                color = PrimaryColor
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Icon(
                                painter = painterResource(id = R.drawable.ic_person),
                                contentDescription = "theNumberOfGrader",
                                tint = Gray400,
                                modifier = Modifier.align(CenterVertically)
                            )
                            Spacer(modifier = Modifier.width(7.dp))
                            PretendardText(
                                text = list[it].theNumberOfGrader.toString(),
                                fontSize = 12.sp,
                                fontWeight = FontWeight(500),
                                color = Gray400
                            )
                        }
                    }
                }
                PretendardText(
                    modifier = Modifier.align(CenterEnd),
                    text = "평가하기",
                    fontSize = 15.sp,
                    fontWeight = FontWeight(600),
                    color = PrimaryColor
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
    }

}

@Preview
@Composable
fun RecentContactSectionPreview() {
    RecentContactSection(listOf())
}