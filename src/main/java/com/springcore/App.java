package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Student;
import com.springcore.collections.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_config.xml");
        
        Student std1=  (Student) applicationContext.getBean("student1");
        System.out.println(std1);
        
        Student std2=  (Student) applicationContext.getBean("student2");
        System.out.println(std2);
        
        Student std3=  (Student) applicationContext.getBean("student3");
        System.out.println(std3);
        
        Employee emp1= (Employee) applicationContext.getBean("emp1");
        System.out.println(emp1);
    }
}
