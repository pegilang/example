package com.github.pegilang.example.es.javastore;

import org.jsoup.nodes.Document;

public class BookStoreDomain {
    public static void main(String[] args) {
        var doc = new Document("https://google.com");
        doc.title("Google.com");
        System.out.println(doc);
    }
}
