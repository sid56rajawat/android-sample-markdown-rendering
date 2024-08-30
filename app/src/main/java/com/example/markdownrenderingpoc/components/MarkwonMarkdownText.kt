package com.example.markdownrenderingpoc.components

import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import io.noties.markwon.Markwon

@Composable
fun MarkwonMarkdownText(content: String) {
    val context = LocalContext.current
    val markwon = Markwon.create(context)

    val node = markwon.parse(content)

    val markdown = markwon.render(node)

    AndroidView(factory = { TextView(context).apply {
        text = markdown
        movementMethod = LinkMovementMethod.getInstance()
    } })
}

@Preview
@Composable
fun MarkwonMarkdownTextPreview(){
    MarkwonMarkdownText(content = "# Heading 1")
}