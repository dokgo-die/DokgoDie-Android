package com.highthon.dokgodie_android.presentation.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highthon.dokgodie_android.R
import com.highthon.dokgodie_android.presentation.ui.theme.Black100
import com.highthon.dokgodie_android.presentation.ui.theme.ErrorColor
import com.highthon.dokgodie_android.presentation.ui.theme.Font
import com.highthon.dokgodie_android.presentation.ui.theme.Gray400

@Composable
fun InputField(
    text: String,
    hint: String,
    onValueChange: (String) -> Unit,
    isError: Boolean,
    errorMsg: String,
    isPassword: Boolean
) {
    val passwordVisible = remember {
        mutableStateOf(isPassword)
    }
    Column {
        TextField(
            value = text,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth(0.9f),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Transparent,
                textColor = Black100,
                focusedIndicatorColor = Gray400,
                unfocusedIndicatorColor = Gray400,
                disabledIndicatorColor = Gray400,
                errorIndicatorColor = ErrorColor,
                errorCursorColor = ErrorColor,
                cursorColor = Gray
            ),
            placeholder = {
                PretendardText(
                    fontSize = 15.sp,
                    text = hint,
                    fontWeight = FontWeight.Medium,
                    color = Gray400
                )
            },
            textStyle = TextStyle(
                fontSize = 15.sp,
                fontFamily = Font.pretendard,
                fontWeight = FontWeight(600),
                color = Black100,
            ),
            visualTransformation = if (passwordVisible.value) PasswordVisualTransformation() else VisualTransformation.None,
            keyboardOptions = KeyboardOptions(keyboardType = if (isPassword) KeyboardType.Password else KeyboardType.Text),
            trailingIcon = {
                val image = if (passwordVisible.value)
                    Icons.Outlined.VisibilityOff
                else Icons.Outlined.Visibility
                val description = if (passwordVisible.value) "Hide password" else "Show password"

                if (isPassword) {
                    IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                        Icon(imageVector = image, description, tint = Gray400)
                    }
                }
            },
            maxLines = 1,
            isError = isError
        )
        if (isError) {
            Spacer(modifier = Modifier.size(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.error_ic),
                    contentDescription = "ErrorIcon",
                    tint = ErrorColor
                )
                Spacer(modifier = Modifier.size(5.67.dp))
                PretendardText(
                    text = errorMsg,
                    fontSize = 13.sp,
                    fontWeight = FontWeight(600),
                    color = ErrorColor
                )
            }
        }
    }
}