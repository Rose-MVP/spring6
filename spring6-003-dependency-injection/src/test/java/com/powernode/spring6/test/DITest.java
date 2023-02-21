package com.powernode.spring6.test;

import com.powernode.spring6.beans.Goods;
import com.powernode.spring6.beans.MyDataSource;
import com.powernode.spring6.beans.Order;
import com.powernode.spring6.beans.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
    @Test
    public void  testDataSource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-datasource.xml");
        MyDataSource dataSource = applicationContext.getBean("dataSource", MyDataSource.class);
        System.out.println(dataSource);
    }
    @Test
    public void testArraySimple(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-array-simple.xml");
        Person person =applicationContext.getBean("person", Person.class);
        System.out.println(person);

    }
    @Test
    public void testArray(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-array.xml");
        Goods goods=applicationContext.getBean("goods2", Goods.class);
        System.out.println(goods);
    }
}
