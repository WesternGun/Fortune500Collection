package io.westerngun.fortune500collection;

import io.westerngun.fortune500collection.parsing.PageParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Assert;

import java.util.List;

public class Main {

    @Value("${app.data}")
    private List<String> dataByYear;

    private PageParser parser;


    public void process() {
        Assert.notEmpty(dataByYear, "Data URL cannot be read correctly, check application.yml key \"app.data\". ");
    }
}
