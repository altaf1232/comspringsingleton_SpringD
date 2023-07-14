package com.springcores;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("singleton.xml");
        
        TestStudent testStudent=context.getBean("testStudent",TestStudent.class);
        //here is create hashCode this rule for the singleton 
        System.out.println( testStudent.hashCode());
        
        TestStudent testStudent1=context.getBean("testStudent",TestStudent.class);
        //here is create hashCode this rule for the singleton 
            System.out.println(testStudent1.hashCode());
      //singleton wo huta hai ju spring continer eaak hi object refrance ko baar baar deta usko
          //  singleton bolte hai
        
    }
}
