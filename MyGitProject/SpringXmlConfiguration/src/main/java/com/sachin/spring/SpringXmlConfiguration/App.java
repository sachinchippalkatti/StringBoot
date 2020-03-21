package com.sachin.spring.SpringXmlConfiguration;

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
        System.out.println( "Hello World!" );
        
        Car car= new Car();
        car.drive();
        
        Bike bike = new Bike();
        bike.drive();
        
        //Strongly coupled both Right hand side and left hand side
        
        //Solve left hand side
        System.out.println("Strongly coupled both Right hand side and left hand side");
        System.out.println("Solve left hand side");
        Vehical obj = new Car();
        obj.drive();
        
        
        obj = new Bike();
        obj.drive();
        
        //Solve Right Hand side by injecting the object from external.
        System.out.println("Solve Right Hand side by injecting the object from external.");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Vehical obj3 = (Vehical)context.getBean("vehical");
        obj3.drive();
        
        Tyre tyre = (Tyre)context.getBean("tyre");
        System.out.println("Tyre" + tyre);
        
        
        //Anotation based Engine
        System.out.println("Annotation based Engine");
        Engine eng = (Engine)context.getBean("engine");
        eng.running();
    }
}
