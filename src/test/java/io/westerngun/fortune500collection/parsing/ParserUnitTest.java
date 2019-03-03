package io.westerngun.fortune500collection.parsing;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@RunWith(JUnit4.class)
public class ParserUnitTest {
    @Autowired
    private PageParser parser;

    @Test
    public void givenAValidURL_whenTriesToConnect_shouldReturnDocument() {
        // given
        parser = new PageParser();
        String protocol = "http://";
        String url = "www.google.com";

        // when
        Optional<Document> doc = parser.connect(protocol + url);

        // then
        Assert.assertTrue(doc.isPresent());
    }



}
