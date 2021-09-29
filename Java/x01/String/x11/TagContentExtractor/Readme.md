# Tag Content Extractor

In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like &lt;tag>contents&lt;/tag>. Note that the corresponding end tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

1. The name of the start and end tags must be same. The HTML code &lt;h1>Hello World&lt;/h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.

2. Tags can be nested, but content between nested tags is considered not valid. For example, in &lt;h1>&lt;a>contents&lt;/a>invalid&lt;/h1>, contents is valid but invalid is not valid.

3. Tags can consist of any printable characters.

___


#### HackerRank Challenge

&nbsp;&nbsp;&nbsp;&nbsp;Tag Content Extractor | [https://www.hackerrank.com/challenges/tag-content-extractor/problem](https://www.hackerrank.com/challenges/tag-content-extractor/problem)
