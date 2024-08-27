package com.gentech.programs;
class Student
{
    String Student_name;
    int age;
    int phone_no;

}
class Library
{
    String L_id;
    String l_name;
    String location;
}
class  Sports
{
    String S_name;
    String no_of_players;
    String  location;
}
class Computer_labs
{
    String class_name;
    int Room_no;
}

public class Student_detailes {
    public static void main(String args[])
    {
        Student obj1=new  Student();
        obj1.Student_name="vandana m";
        obj1.age=21;
        obj1.phone_no=76759756;
        System.out.println("name:"+obj1.Student_name);
        System.out.println("Age:"+obj1.age);
        System.out.println("Phone:"+obj1.phone_no);
        Library obj2=new Library();
        obj2.L_id="l1";
        obj2.l_name="bit stores";
        obj2.location="Bit college";
        System.out.println("Id:"+obj2.L_id);
        System.out.println("location:"+obj2.location);
        System.out.println("L_name:"+obj2.l_name);
        Sports obj3=new Sports();
        obj3.S_name="Cricket";
        obj3.no_of_players="11";
        obj3.location="Bit college";
        System.out.println("Sports name:"+obj3.S_name);
        System.out.println("location:"+obj3.location);
        System.out.println("No_of_players:"+obj3.no_of_players);
        Computer_labs obj4=new Computer_labs();
        obj4.class_name="A section";
        obj4.Room_no=4;

        System.out.println("class name:"+obj4.class_name);
        System.out.println("Room number:"+obj4.Room_no);



    }
}
