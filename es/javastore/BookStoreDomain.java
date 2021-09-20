package com.github.pegilang.example.es.javastore;

import org.jsoup.nodes.Document;

public class BookStoreDomain {
    public Document parse() {
        var doc = new Document("https://google.com");
        doc.title("Google.com");
        return doc;
    }
}
