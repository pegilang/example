package com.github.pegilang.example.es.javastore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookStoreDomainTest {
    @Test
    public void parseTest() {
        Assertions.assertEquals(new BookStoreDomain().parse().title(), "Google.com");
    }
}
