package com.vinsgusu.sec02;

import com.vinsgusu.models.sec02.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProtoDemo {
    private static final Logger logger = LoggerFactory.getLogger(ProtoDemo.class);
    public static void main(String[] args) {
        var person = Person.newBuilder().setName("Vincent").setAge(20).build();
        logger.info("Person: {}", person);
    }
}
