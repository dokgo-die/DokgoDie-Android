package com.highthon.dokgodie_android.presentation.feature_bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.R
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.ui.theme.*

@Composable
fun BottomNavigation(
    isMainPage: Boolean,
    modifier: Modifier = Modifier,
    onClickHomeButton: () -> Unit,
    onClickMainButton: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(if (isMainPage) Black100 else White500)
            .padding(top = 14.dp, bottom = 14.dp)
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .offset(x = 55.dp)
                .clickable(
                    indication = null,
                    interactionSource = MutableInteractionSource()
                ) {
                    onClickHomeButton()
                }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_home),
                contentDescription = "home",
                tint = if (isMainPage) White600 else Gray400,
            )
            Spacer(modifier = Modifier.height(7.5.dp))
            PretendardText(
                text = "홈",
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                color = if (isMainPage) White600 else Gray400,
                modifier = Modifier.align(CenterHorizontally)
            )
        }
        Box(
            modifier = Modifier
                .size(width = 36.dp, height = 36.dp)
                .clip(CircleShape)
                .background(if (isMainPage) White500 else PrimaryColor)
                .align(Center)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.upload),
                contentDescription = "upload button",
                tint = if (isMainPage) Black100 else White500,
                modifier = Modifier.align(Center)
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .offset(x = (-55).dp)
                .clickable(
                    indication = null,
                    interactionSource = MutableInteractionSource()
                ) {
                    onClickMainButton()
                }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_person),
                contentDescription = "myPage",
                tint = if (isMainPage) Gray300 else PrimaryColor,
                modifier = Modifier.align(CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(7.5.dp))
            PretendardText(
                text = "마이페이지",
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                color = if (isMainPage) Gray300 else PrimaryColor,
                modifier = Modifier.align(CenterHorizontally)
            )
        }

    }
}

@Preview
@Composable
fun BottomNavigationPreview() {
    BottomNavigation(isMainPage = false, onClickHomeButton = {}, onClickMainButton = {})
}