package com.example.markdownrenderingpoc.components

import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.markdownrenderingpoc.sampledata.SampleData
import io.noties.markwon.Markwon
import io.noties.markwon.ext.strikethrough.StrikethroughPlugin

@Composable
fun MarkwonMarkdownText(content: String) {
    val context = LocalContext.current
    val markwon = Markwon.builder(context)
        .usePlugin(StrikethroughPlugin.create())
        .build()

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
    val sampleData = SampleData()
    Box(modifier = Modifier.background(Color.White).fillMaxSize()) {
        MarkwonMarkdownText(content = sampleData.strikeThroughText)
    }
}