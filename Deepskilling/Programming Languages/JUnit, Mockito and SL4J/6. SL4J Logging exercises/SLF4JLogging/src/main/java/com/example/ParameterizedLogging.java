package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        String name = "Laahiri";
        int age = 20;
        double cgpa = 8.58;

        logger.info("Student Name: {}", name);
        logger.info("Student Age: {}", age);
        logger.info("Student CGPA: {}", cgpa);

        logger.warn("Student {} has CGPA {}", name, cgpa);

        logger.error("Unable to process student {}", name);
    }
}