package com.git2;


import org.apache.log4j.Logger;

/**
 * This is the First Sonar Test Project
 * Created by smile24es
 * Created on 4/22/17.
 */
public class Main {

    private Main() {
    }

    static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        //logs a debug message
        if (logger.isDebugEnabled()) {
            logger.debug("This is debug");
        }

        //logs an error message with parameter
        String parameter = "hasitha";
        logger.error("This is error : " + parameter);

        //logs an exception thrown from somewhere
        int x = 10;
        int y = 5;

        try {
            int z = x / y;
            logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> " + z);
        } catch (ArithmeticException exp) {
            logger.error("This is error", exp);
        }

    }
}
