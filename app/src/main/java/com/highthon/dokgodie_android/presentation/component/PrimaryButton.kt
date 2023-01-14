package com.highthon.dokgodie_android.presentation.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.presentation.ui.theme.Gray300
import com.highthon.dokgodie_android.presentation.ui.theme.Gray400
import com.highthon.dokgodie_android.presentation.ui.theme.PrimaryColor
import com.highthon.dokgodie_android.presentation.ui.theme.White600

@Composable
fun PrimaryButton(
    isClickable: Boolean = true,
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = { if (isClickable) onClick },
        modifier = modifier
            .fillMaxWidth()
            .height(46.dp)
            .clip(RoundedCornerShape(16.dp))
            .padding(start = 24.dp, end = 24.dp), shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = if (isClickable) PrimaryColor else Gray400)
    ) {
        PretendardText(
            text = text,
            fontSize = 15.sp,
            fontWeight = FontWeight(600),
            color = if (isClickable) White600 else Gray300,
            modifier = Modifier
        )
    }
}

@Preview
@Composable
fun Main() {
    PrimaryButton(modifier = Modifier, text = "로그인", onClick = {})
}