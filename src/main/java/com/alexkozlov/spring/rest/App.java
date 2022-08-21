package com.alexkozlov.spring.rest;

import com.alexkozlov.spring.rest.configuration.MyConfig;
import com.alexkozlov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> employeeList = communication.getAllEmployees();

        System.out.println(employeeList);

        Employee employee = communication.getEmployee(2);
        System.out.println(employee);

//        Employee employee1 = new Employee("Sveta", "Sokolova", "HR", 900);
//        communication.saveEmployee(employee1);
//
//        employee1.setSalary(1200);
//        employee1.setDepartment("IT");
//        employee1.setId(10);
//
//        communication.saveEmployee(employee1);

        communication.deleteEmployee(11);
    }
}
