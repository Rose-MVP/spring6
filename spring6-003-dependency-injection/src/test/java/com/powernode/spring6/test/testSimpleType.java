package com.powernode.spring6.test;

import com.powernode.spring6.beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSimpleType {
    @Test
    public  void testSimpleType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-simple-type.xml") ;
        User user =applicationContext.getBean("userBean",User.class);
        System.out.println(user);
    }
}
