package com.bjpowernode.spring6.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringTest {
    @Test
    public void testBeginInitBean(){
        new ClassPathXmlApplicationContext("spring.xml");
        Logger logger= LoggerFactory.getLogger(FirstSpringTest.class);
        logger.info("我是一条消息");
        logger.debug("我是一条调试信息");
        logger.error("我是一条错误信息");

    }
    @Test
    public  void  testFirstSpringCode(){
    }
}
