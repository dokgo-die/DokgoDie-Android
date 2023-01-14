package com.highthon.dokgodie_android.presentation.feature_mypage.componenet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation

@OptIn(ExperimentalCoilApi::class)
@Composable
fun ProfileThumbNail() {
    Row {
        val painter = rememberImagePainter(
            data = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
            builder = {
                transformations(
                    CircleCropTransformation()
                )
            })
        val imageStage = painter.state
        Image(
            painter = painter,
            contentDescription = "userProfile",
            modifier = Modifier
                .height(60.dp)
                .width(60.dp)
        )
        if(imageStage is ImagePainter.State.Loading) {
            CircularProgressIndicator()
        }
    }
}