package com.strange.jay.tea.springcloudfunction;

import java.util.function.Function;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionCatalog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFunctionApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
        return args -> {
            FunctionCatalog functionCatalog = applicationContext.getBean(FunctionCatalog.class);

            Function<String, String> upperCaseFunction = functionCatalog.lookup("upperCase");
            System.out.println("UpperCase function: " +upperCaseFunction.apply("demo app"));

            Function<String, Integer> getLengthFunction = functionCatalog.lookup("getLength");
            System.out.println("GetLength function: " +getLengthFunction.apply("really long function"));

            Function<String, String> concatFunction = functionCatalog.lookup("concatFunction");
            System.out.println("ConcatFunction function: " +concatFunction.apply("concat this"));
        };
    }
}
