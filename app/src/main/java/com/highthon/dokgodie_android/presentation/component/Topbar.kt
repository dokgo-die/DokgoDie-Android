package com.highthon.dokgodie_android.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIos
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.presentation.ui.theme.Black100
import com.highthon.dokgodie_android.presentation.ui.theme.Gray400
import com.highthon.dokgodie_android.presentation.ui.theme.White600

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    isNeedBackPressButton: Boolean = true,
    onClick: () -> Unit = {},
    text: String
) {
    Box(
        modifier = modifier
            .fillMaxWidth(0.9f)
            .height(44.dp)
            .background(White600)
    ) {
        if(isNeedBackPressButton) {
            Icon(
                imageVector = Icons.Rounded.ArrowBackIos,
                tint = Gray400,
                contentDescription = "backButton",
                modifier = modifier
                    .align(
                        Alignment.CenterStart
                    )
                    .clickable(
                        interactionSource = MutableInteractionSource(),
                        indication = null
                    ) { onClick() }
            )
        }
        PretendardText(
            text = text,
            fontSize = 15.sp,
            fontWeight = FontWeight(600),
            color = Black100,
            modifier = Modifier.align(
                Alignment.Center
            )
        )
    }
}

@Preview
@Composable
fun TopBarPreview() {
    TopBar(text = "?????? ?????????")
}