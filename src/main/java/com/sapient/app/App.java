package com.sapient.app;
import com.sapient.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Message message=new Message("hello worls");
        System.out.println( message.getGreeting() );
    }
}
