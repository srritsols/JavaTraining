package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        Bar bar = (Bar) context.getBean("bar"); 
         
        
        bar.processFooName();
        
        System.out.println(bar.toString());

        
        Foo foo = (Foo) context.getBean("foo");
        System.out.println(foo.getName());
    }
}
