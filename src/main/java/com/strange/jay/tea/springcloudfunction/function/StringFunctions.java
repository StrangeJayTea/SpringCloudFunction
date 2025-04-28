package com.strange.jay.tea.springcloudfunction.function;

import java.util.function.Function;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringFunctions {

    @Bean
    public Function<String, String> reverseString() {
        return value -> new StringBuilder(value).reverse().toString();
    }

    @Bean
    public Function<String, String> upperCase() {
        return value -> value.toUpperCase();
    }

    @Bean
    public Function<String, Integer> getLength() {
        return value -> value.length();
    }
}
