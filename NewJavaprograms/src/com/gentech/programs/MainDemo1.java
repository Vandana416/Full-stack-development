package com.gentech.programs;

import java.nio.file.FileSystemNotFoundException;

public class MainDemo1 {
    static class Employee
    {
        String e_name;
        int age;
        String email;
        int ph_no;

    }
    static class Department
    {
        String d_name;
        int dept_no;
        String location;

    }
    static class Insurance
    {
        String policy;
        String start_date;
        String end_date;
        String policy_status;
    }

    public static void main(String args[])
    {
        Employee obj1=new Employee();
        Department obj2=new Department();
        Insurance obj3=new Insurance();
        obj1.e_name="vandana";
        obj1.age=21;
        obj1.email="vandana@gmail.com";
        obj2.d_name="Computer science";
        obj2.dept_no=5;
        obj2.location="5th floor bit";
        obj3.policy="health";
        obj3.start_date="2024-01-12";
        obj3.end_date="20224-12-12";
        obj3.policy_status="active";
        System.out.println("Employee_name is"+obj1.e_name);
        System.out.println("Employee age:"+obj1.age);
        System.out.println("Employee email:"+obj1.email);
        System.out.println("Department_name:"+obj2.d_name);
        System.out.println("Department_no:"+obj2.dept_no);
        System.out.println("Department location:"+obj2.location);
        System.out.println("policy name"+obj3.policy);
        System.out.println("Start date:"+obj3.start_date);
        System.out.println("End dat"+obj3.end_date);
        System.out.println("Policy_status"+obj3.policy_status);

    }
}
