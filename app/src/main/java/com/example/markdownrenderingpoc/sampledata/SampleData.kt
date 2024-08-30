package com.example.markdownrenderingpoc.sampledata

data class SampleData(
    val plainText: String = "Plain Text",
    val boldText: String = "**Bold Text**",
    val italicText: String = "*Italic Text*",
    val underlineText: String = "<u>Underline Text</u>",
    val strikeThroughText: String = "~~Strike-through Text~~",
    val hyperlinkText: String = "[Hyperlink Text](https://example.com)",
    val backgroundColorText: String = "<span style=\"background-color: yellow;\">Background Color Text</span>",
    val fontColorText: String = "<span style=\"color: red;\">Font Color Text</span>",
    val lineBreakText: String = "Line 1<br>Line 2",
    val headingsText: String = """
        # Heading 1
        ## Heading 2
        ### Heading 3
        #### Heading 4
    """.trimIndent(),
    val bulletListText: String = """
- Bullet 1
- Bullet 2
- Bullet 3
""",
    val numberedListText: String = """
1. Numbered Item 1
2. Numbered Item 2
3. Numbered Item 3
""",
    val indentText: String = """
    Indented Text
""",
    val tableText: String = """
| Header 1 | Header 2 |
|----------|----------|
| Cell 1   | Cell 2   |
| Cell 3   | Cell 4   |
""",
    val pureMarkDown: List<String> = listOf(plainText, boldText, italicText, strikeThroughText, hyperlinkText, headingsText, bulletListText, numberedListText, indentText, tableText),
    val htmlData: List<String> = listOf(underlineText, backgroundColorText, fontColorText, lineBreakText),
    val allData: List<String> = listOf(plainText, boldText, italicText, underlineText, strikeThroughText, hyperlinkText, backgroundColorText, fontColorText, lineBreakText, headingsText, bulletListText, numberedListText, indentText, tableText)
)
