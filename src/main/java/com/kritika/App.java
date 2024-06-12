package com.kritika;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates a container
        Alien obj = (Alien) context.getBean("alien"); //get bean will give the object from container -> alien is a object here   which is typecasted as (alien)
        //what we are doing here is:
        //we are not creating object of alien by ourselves but asking spring framework to create it for us.
        obj.code();
    }
}
