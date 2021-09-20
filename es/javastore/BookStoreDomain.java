package es.javastore;

import org.jsoup.nodes.Document;

public class BookStoreDomain {
    public static void main(String[] args) {
        System.out.println(new BookStoreDomain().parse());
    }

    public Document parse() {
        Document doc = new Document("https://google.com");
        doc.title("Google.com");
        return doc;
    }
}
