package io.westerngun.fortune500collection;

import io.westerngun.fortune500collection.parsing.PageParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@Slf4j
public class Main {


    private static final String prefix = "app.data";

    @Autowired
    private PageParser parser;

    private Environment env;

    public void process() {

    }
}
