package com.example.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TestComponent implements CommandLineRunner {
    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        DummyLogger dummyLogger = (DummyLogger) applicationContext.getBean("dummyLogger");
        dummyLogger.sayHi();
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4});
        ListUtil listUtility = (ListUtil) applicationContext.getBean("listUtility");
        System.out.println(listUtility.sumElements(list));
        StringUtil stringUtility = (StringUtil) applicationContext.getBean("stringUtility");
        List<String> stringList = Arrays.asList(new String[]{"string1", "string2", "string3"});
        System.out.println(stringUtility.formSentence(stringList));
    }
}
