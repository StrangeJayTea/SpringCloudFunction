package com.strange.jay.tea.springcloudfunction.function;

import java.util.function.Function;
import org.springframework.stereotype.Component;

public class Greeter implements Function<String, String> {

    @Override
    public String apply(final String s) {
        return "Hello " + s;
    }
}
