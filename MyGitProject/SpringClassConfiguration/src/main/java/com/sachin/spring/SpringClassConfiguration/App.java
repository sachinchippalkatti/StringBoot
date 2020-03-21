package com.sachin.spring.SpringClassConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Samsung s7 = (Samsung)factory.getBean(Samsung.class);
       s7.getConfig();
    }
}
