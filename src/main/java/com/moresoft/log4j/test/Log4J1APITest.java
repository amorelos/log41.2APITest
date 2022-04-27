package com.moresoft.log4j.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4J1APITest {
    private static final Logger LOGGER = Logger.getLogger(Log4J1APITest.class);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Here!!!");
        LOGGER.info("My Program using Log4J 1.2.17");
        Thread.sleep(1000);
    }
}
