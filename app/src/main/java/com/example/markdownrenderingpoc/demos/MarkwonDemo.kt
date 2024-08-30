package com.example.markdownrenderingpoc.demos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.markdownrenderingpoc.components.MarkwonMarkdownText
import com.example.markdownrenderingpoc.sampledata.SampleData

@Composable
fun MarkwonDemo(){
    val sampleData = SampleData()

    LazyColumn(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize()) {
        item {
            Text(text = "All Text")
        }
        items(sampleData.allData) { item ->
            MarkwonMarkdownText(content = item)
        }

        item {
            Spacer(modifier = Modifier.height(100.dp))
            Text(text = "Native Markdown Text")
        }
        items(sampleData.pureMarkDown) { item ->
            MarkwonMarkdownText(content = item)
        }

        item {
            Spacer(modifier = Modifier.height(100.dp))
            Text(text = "Native HTML Text")
        }
        items(sampleData.htmlData) { item ->
            MarkwonMarkdownText(content = item)
        }
    }
}

@Preview
@Composable
fun MarkwonDemoPreview(){
    MarkwonDemo()
}