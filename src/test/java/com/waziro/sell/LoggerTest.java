package com.waziro.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);


    @Test
    public void test1(){
        logger.debug("debug...");
        logger.info("info...");
        String name="张无忌";
        String password="123456";
        logger.info("name: {} password: {}",name,password);
        logger.error("error....");
        logger.warn("warn.....");
    }
}
