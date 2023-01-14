package com.highthon.dokgodie_android.presentation.feature_upload.component

import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.ui.theme.Gray300
import com.highthon.dokgodie_android.presentation.ui.theme.TransparentGray300
import com.highthon.dokgodie_android.presentation.ui.theme.White500

@Composable
fun VideoView(videoUri: Uri, onClick: () -> Unit) {
    val context = LocalContext.current
    val exoPlayer = ExoPlayer.Builder(context)
        .build()
        .also { exoPlayer ->
            val mediaItem = MediaItem.Builder()
                .setUri(videoUri)
                .build()
            exoPlayer.setMediaItem(mediaItem)
            exoPlayer.prepare()
        }
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .width(200.dp)
            .height(355.dp)
    ) {
        DisposableEffect(
            AndroidView(modifier = Modifier
                .background(White500), factory = {
                StyledPlayerView(context).apply {
                    player = exoPlayer
                    resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FILL
                    useController = false
                    player!!.prepare()
                    player!!.playWhenReady = true
                    player!!.repeatMode = Player.REPEAT_MODE_ALL
                }
            })
        ) {
            onDispose {
                exoPlayer.release()
            }
        }
        Box(
            modifier = Modifier
                .width(117.dp)
                .height(42.dp)
                .clip(RoundedCornerShape(16.dp))
                .align(Alignment.Center)
                .border(
                    width = 1.dp,
                    color = Gray300,
                    shape = RoundedCornerShape(16.dp)
                )
                .background(TransparentGray300)
                .clickable {
                    onClick()
                }
        ) {
            PretendardText(
                text = "영상 재업로드",
                fontSize = 15.sp,
                fontWeight = FontWeight(600),
                color = Color.White,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}