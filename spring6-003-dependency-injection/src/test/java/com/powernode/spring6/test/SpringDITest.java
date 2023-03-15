package com.powernode.spring6.test;

import com.powernode.spring6.beans.Clazz;
import com.powernode.spring6.beans.SimpleValueType;
import com.powernode.spring6.beans.Student;
import com.powernode.spring6.jdbc.MyDataSource;
import com.powernode.spring6.service.CustomerService;
import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.PublicKey;

public class SpringDITest {
    @Test
    public  void    testSetDI  (){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.saveUser();
    }
    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = applicationContext.getBean("csBean", CustomerService.class);
        customerService.save();
        CustomerService csBean2 = applicationContext.getBean("csBean3", CustomerService.class);
        csBean2.save();
    }
    @Test
    public  void  testSimpleTypeSet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        SimpleValueType simpleValueType  = applicationContext.getBean("SimpleValueType", SimpleValueType.class);
        System.out.println(simpleValueType);
    }
    @Test
    public  void  testCacade(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("cascade.xml");
        Student student = applicationContext.getBean("studentBean",Student.class);
        Clazz clazz =applicationContext.getBean("clazzBean",Clazz.class);
        System.out.println(student);
        System.out.println(clazz);
    }
    @Test
    public void  testProperties(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource myDataSource =applicationContext.getBean("ds",MyDataSource.class);
        System.out.println(myDataSource);
    }
}
