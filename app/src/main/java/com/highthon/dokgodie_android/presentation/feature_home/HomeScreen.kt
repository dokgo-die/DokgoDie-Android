package com.highthon.dokgodie_android.presentation.feature_home

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.rememberAsyncImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.VerticalPager
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.highthon.dokgodie_android.R
import com.highthon.dokgodie_android.presentation.component.PretendardText
import com.highthon.dokgodie_android.presentation.feature_home.data.PageItemsData
import com.highthon.dokgodie_android.presentation.ui.theme.White500


@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeScreen() {

    val list = listOf(
        PageItemsData(
            itemsName = "심상치 않은 씹덕 티",
            userName = "이현빈",
            grade = 4,
            userId = "l.h__bin",
            theNumberOfGrader = 200,
            mediaUri = "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4",
            profileOfUser = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
            link = "https://github.com/leehyeonbin"
        ),
        PageItemsData(
            itemsName = "보라토끼 팝니다.",
            userName = "김현승",
            grade = 5,
            userId = "gus._.tmd",
            theNumberOfGrader = 100,
            mediaUri = "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4",
            profileOfUser = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
            link = "https://github.com/leehyeonbin"
        ),
        PageItemsData(
            itemsName = "이번에 나온 맥북 팝니다.",
            userName = "강민",
            grade = 4,
            userId = "kangm.in2",
            theNumberOfGrader = 300,
            mediaUri = "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4",
            profileOfUser = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
            link = "https://github.com/leehyeonbin"
        ),
        PageItemsData(
            itemsName = "심상치 않은 씹덕 티",
            userName = "박시원",
            grade = 4,
            userId = "l.h_bin",
            theNumberOfGrader = 500,
            mediaUri = "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4",
            profileOfUser = "https://test-imag-upload-bucket.s3.ap-northeast-2.amazonaws.com/image.png",
            link = "https://github.com/leehyeonbin"
        )
    )
    VerticalPager(modifier = Modifier.fillMaxSize(), count = list.size) {
        Box(modifier = Modifier.fillMaxSize()) {
            val context = LocalContext.current
            val exoPlayer = ExoPlayer.Builder(context)
                .build()
                .also { exoPlayer ->
                    val mediaItem = MediaItem.Builder()
                        .setUri(Uri.parse(list[it].mediaUri))
                        .build()
                    exoPlayer.setMediaItem(mediaItem)
                    exoPlayer.prepare()
                }
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

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .offset(x = 24.dp, y = ((-16).dp))
            ) {
                PretendardText(
                    text = list[it].itemsName,
                    fontSize = 15.sp,
                    fontWeight = FontWeight(600),
                    color = White500,
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row {
                    Image(
                        painter = rememberAsyncImagePainter(
                            model = list[it].profileOfUser,
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(16.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    PretendardText(
                        text = list[it].userName,
                        fontSize = 13.sp,
                        fontWeight = FontWeight(500),
                        color = White500
                    )
                }
            }

            Column(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .offset(x = (-30).dp, y = -(177).dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_link),
                    contentDescription = "link",
                    tint = White500,
                    modifier = Modifier.clickable(
                        indication = null,
                        interactionSource = MutableInteractionSource()
                    ) {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(list[it].link))
                        context.startActivity(intent)
                    }
                )
                Spacer(modifier = Modifier.height(2.dp))
                PretendardText(
                    text = "관련 링크",
                    fontSize = 12.sp,
                    fontWeight = FontWeight(600),
                    color = White500,
                    modifier = Modifier.clickable(
                        indication = null,
                        interactionSource = MutableInteractionSource()
                    ) {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(list[it].link))
                        context.startActivity(intent)
                    })

                Spacer(modifier = Modifier.height(26.dp))


                Icon(
                    painter = painterResource(id = R.drawable.send),
                    contentDescription = "send",
                    tint = White500,
                    modifier = Modifier.clickable(
                        indication = null,
                        interactionSource = MutableInteractionSource()
                    ) {
                        val intent = Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://www.instagram.com/${list[it].userId}/")
                        )
                        context.startActivity(intent)
                    })
                Spacer(modifier = Modifier.height(2.dp))
                PretendardText(
                    text = "채팅 요청",
                    fontSize = 12.sp,
                    fontWeight = FontWeight(600),
                    color = White500,
                    modifier = Modifier.clickable(
                        indication = null,
                        interactionSource = MutableInteractionSource()
                    ) {
                        val intent = Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://www.instagram.com/${list[it].userId}/")
                        )
                        context.startActivity(intent)
                    })
            }
            Row(modifier = Modifier.align(Alignment.BottomEnd).offset(x = -(30.dp), y = (-21).dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_star_rate),
                    contentDescription = "star",
                    tint = White500,
                    modifier = Modifier.size(10.dp).align(CenterVertically)
                )
                Spacer(modifier = Modifier.width(7.dp))
                PretendardText(
                    text = list[it].grade.toString(),
                    fontSize = 12.sp,
                    fontWeight = FontWeight(500),
                    color = White500
                )
                Spacer(modifier = Modifier.width(11.dp))
                Icon(
                    painter = painterResource(id = R.drawable.ic_person),
                    contentDescription = "people",
                    tint = White500,
                    modifier = Modifier.size(10.dp).align(CenterVertically)
                )
                Spacer(modifier = Modifier.width(7.dp))
                PretendardText(
                    text = list[it].theNumberOfGrader.toString(),
                    fontSize = 12.sp,
                    fontWeight = FontWeight(500),
                    color = White500
                )
            }

        }
    }


}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}