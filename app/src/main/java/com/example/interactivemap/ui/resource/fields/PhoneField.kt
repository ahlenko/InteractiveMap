package com.example.interactivemap.ui.resource.fields

import android.telephony.PhoneNumberUtils
import android.text.Selection
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun PhoneField(text: MutableState<String>, textStyle: TextStyle) {
    Box(modifier = Modifier.fillMaxSize().border(2.dp, MaterialTheme.colorScheme.onBackground, RoundedCornerShape(10.dp))) {
        BasicTextField(
            modifier = Modifier.align(Alignment.Center).padding(horizontal = 12.dp).fillMaxWidth(),
            value = text.value, onValueChange = { newValue -> text.value = newValue.take(AutoVisualTransformation.inputMaxLength).filter { it.isDigit() } },
            textStyle = textStyle,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ), singleLine = true,
            visualTransformation = AutoVisualTransformation(
                mask = AutoVisualTransformation.MASK,
                maskCharInput = AutoVisualTransformation.MASK_CHAR,
                enableCursorMove = false
            )
        )
    }
}

class AutoVisualTransformation(
    val mask: String,
    val maskCharInput: Char,
    val enableCursorMove: Boolean
) : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val inputText = text.text
        val formattedText = buildAnnotatedString {
            var separatorCount = 0
            var formattedTextLength = 0 // "(11) 1" input = 3, sep = 3, result = 6
            while (formattedTextLength < inputText.length + separatorCount) { // until 6
                if (mask[formattedTextLength++] != maskCharInput) separatorCount++ // '(' != 'X'
            }
            var inputIndex = 0
            mask.take(formattedTextLength).forEach { maskCurrentChar -> // "(XX) XXXXX - XXXX"
                if (maskCurrentChar != maskCharInput) append(maskCurrentChar) // '(', ')', ' '
                else append(inputText[inputIndex++]) // '1','1','1'
            }
        }

        val offsetTranslator = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                // offset = input.count/original at cursor position -- "(11) 1|" offset = 3
                var separatorCount = 0 // "(11) 1" sep = 3
                var transformedCursor = 0 // inputs + separators = formatted.length using offset
                while (transformedCursor < offset + separatorCount) { // "(11) 1" until 6
                    if (mask[transformedCursor++] != maskCharInput) separatorCount++ // '(' != 'X'
                }
                return if (enableCursorMove) transformedCursor // "(11) 1|" offset/input + sep = 6
                else formattedText.length // "(XX) XXXXX - XXXX" return 17
            }

            override fun transformedToOriginal(offset: Int): Int {
                // offset = formatted.count/transformed at cursor position -- "(11) 1|" offset = 6
                return if (enableCursorMove) {
                    val sepCount = mask.take(offset).count { it != maskCharInput } // "() " sep = 3
                    offset - sepCount // originalCursor/inputs "(11) 1|" offset/form.length - sep = 3
                } else inputText.length // "(XX) XXXXX - XXXX" return 11
            }
        }
        return TransformedText(formattedText, offsetTranslator)
    }
    companion object{
        const val MASK = "+38(XXX)XXX-XX-XX"
        const val MASK_CHAR = 'X'
        val inputMaxLength = MASK.count { maskChar -> maskChar == MASK_CHAR }
    }
}


