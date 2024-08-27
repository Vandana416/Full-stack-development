package com.gentech.programs;
class Swathik
{
    String name;
    String Gender;
     int ph_no;
    String E_mail;
    String join_date;
    String end_date;
    String Address;
}

public class Swathi {
    public static void main(String args[])
    {
        Swathik obj=new Swathik();
        obj.name="Swathi k";
        obj.Gender="female";
        obj.Address="chikka igalur";
        obj.E_mail="swathiswathik@gmail.com";
        obj.ph_no= 709980888;
        obj.join_date="2021-01-01";
        obj.end_date="2024-07-21";
        System.out.println("Name:"+obj.name);
        System.out.println("Gender:"+obj.Gender);
        System.out.println("Address:"+obj.Address);
        System.out.println("Email:"+obj.E_mail);
        System.out.println("Phone no:"+obj.ph_no);
        System.out.println("Join_date:"+obj.name);
        System.out.println("End_date:"+obj.end_date);

    }
}
