package com.example.mockito;

public class ServiceLogger {

    private Logger logger;

    public ServiceLogger(Logger logger) {
        this.logger = logger;
    }

    public void execute() {

        logger.start();

        logger.log("Running");

        logger.end();
    }
}