package io.westerngun.fortune500collection.parsing;

import io.westerngun.fortune500collection.FortuneData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Optional;

@Slf4j
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class PageParser {
    private String url;

    @Autowired
    private FortuneData fortuneData;

    public Optional<Document> connect(String url) {
        try {
            return Optional.of(Jsoup.connect(url)
                            .timeout(3000).get());
        } catch (IOException e) {
            log.error("Cannot connect to {}. ", url, e);
        } catch (IllegalArgumentException e1) {
            log.error("URL has invalid format, make sure to add protocol. URL: {}", url, e1);
        }
        return Optional.empty();
    }


}
