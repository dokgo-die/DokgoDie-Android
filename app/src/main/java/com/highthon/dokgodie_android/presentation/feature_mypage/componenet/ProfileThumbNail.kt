package com.highthon.dokgodie_android.presentation.feature_mypage.componenet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun ProfileThumbNail() {
    Row {
//        AsyncImage(
//            model = ImageRequest.Builder(LocalContext.current)
//                .data("https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png")
//                .crossfade(true)
//                .build(),
////            placeholder = painterResource(R.drawable.placeholder),
//            contentDescription = "theProfileImageOfUser",
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .clip(CircleShape)
//                .height(60.dp)
//                .width(60.dp)
//        )
        Image(
            painter = rememberAsyncImagePainter("https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png"),
            contentDescription = "theProfileImageOfUser",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .height(60.dp)
                .width(60.dp)
        )
    }
}