package com.vinsgusu.sec01;

import com.vinsgusu.models.sec01.PersonOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleProtoDemo {
    private static final Logger logger = LoggerFactory.getLogger(SimpleProtoDemo.class);
    public static void main(String[] args) {
        PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder().setName("Vincent").setAge(20).build();
        logger.info("Person: {}", person);
    }
}
