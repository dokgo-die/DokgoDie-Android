package com.highthon.dokgodie_android.presentation

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.highthon.dokgodie_android.presentation.feature_upload.UploadScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val videoUri = remember {
                mutableStateOf<Uri?>(null)
            }

            val pickMediaActivityResultLauncher = rememberLauncherForActivityResult(
                ActivityResultContracts.GetContent()
            ) { uri ->
                videoUri.value = uri
            }
            UploadScreen(videoUri.value) {
                pickMediaActivityResultLauncher.launch("*/*")
            }
        }
    }
}