package com.gentech.programs;
class Two_wheeleer
{

    String plate_no;
    String model;
    int VIN;
    String date_of_purchased;
    String make;

}
class Four_wheeler {
    String make;
    String model;
    int VIN;
    String date_purchased;
    String plate_no;

}

public class Vandana {
    public static void main(String args[])
    {
        Two_wheeleer obj1=new Two_wheeleer();
        Four_wheeler obj2=new Four_wheeler();
        obj1.VIN=1234567;
        obj1.make="Royal_enfield";
        obj1.date_of_purchased="2024-10-12";
        obj1.model="classic 500";
        obj1.plate_no="kA_102002";
        obj2.make="car";
        obj2.model="BMW 3series";
        obj2.VIN=1234567;
        obj2.date_purchased="2024-01-09";
        obj2.plate_no="AP_090897";
        System.out.println("The VIN number"+obj1.VIN);
        System.out.println("the make Twowheeler is"+obj1.make);
        System.out.println("The date purchased"+obj1.date_of_purchased);
        System.out.println("The plate_number"+obj1.plate_no);
        System.out.println("The make is"+obj2.make);
        System.out.println("The date_purchased:"+obj2.date_purchased);
        System.out.println("The model is"+obj2.model);
        System.out.println("The  VIN number is :"+obj2.VIN);
        System.out.println("the plateno:"+obj2.plate_no);


    }
}
