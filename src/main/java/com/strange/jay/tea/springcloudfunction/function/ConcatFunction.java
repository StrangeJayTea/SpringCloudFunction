package com.strange.jay.tea.springcloudfunction.function;

import java.util.function.Function;

public class ConcatFunction implements Function<String, String> {

    @Override
    public String apply(String s) {
        return s.concat(" - NEW STR");
    }
}
