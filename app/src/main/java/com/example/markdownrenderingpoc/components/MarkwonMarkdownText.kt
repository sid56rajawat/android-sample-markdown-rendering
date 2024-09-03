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
import io.noties.markwon.ext.tables.TablePlugin
import io.noties.markwon.html.HtmlPlugin

@Composable
fun MarkwonMarkdownText(content: String) {
    val context = LocalContext.current
    val markwon = Markwon.builder(context)
        .usePlugin(StrikethroughPlugin.create())
        .usePlugin(TablePlugin.create(context))
        .usePlugin(HtmlPlugin.create())
        .build()

    AndroidView(factory = { TextView(context).apply {
        markwon.setMarkdown(this, content)
        movementMethod = LinkMovementMethod.getInstance()
    } })
}

@Preview
@Composable
fun MarkwonMarkdownTextPreview(){
    val sampleData = SampleData()
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()) {
        MarkwonMarkdownText(content = sampleData.backgroundColorText)
    }
}