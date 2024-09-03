/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int id,age,salary;
        String empname,dept;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Id:");
        id=sc.nextInt();
        System.out.println("Enter Employee Name:");
        empname=sc.next();
        System.out.println("Enter Employee Age:");
        age=sc.nextInt();
        System.out.println("Enter Employee Department:");
        dept=sc.next();
        System.out.println("Enter Employee Salary:");
        salary=sc.nextInt();
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Name:"+empname);
        System.out.println("Employee Age:"+age);
        System.out.println("Employee Department:"+dept);
        System.out.println("Employee Salary:"+salary);

        // TODO code application logic here
    }
    
}
