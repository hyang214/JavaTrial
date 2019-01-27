package com.tal.cd.hyang.javatrial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * launcher
 */
@SpringBootApplication
public class JavaTrialApplication {

    private static Logger logger = LoggerFactory.getLogger(JavaTrialApplication.class);
    
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            SpringApplication.run(JavaTrialApplication.class, args);
            long end = System.currentTimeMillis();
            logger.info("start end, time cost: {}", (end - start));
        } catch (Exception e) {
            logger.error("start fail e:", e);
        }
    }

}

