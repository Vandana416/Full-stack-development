package com.gentech.programs;
class Products
{
    String Product_name;
    String Product_id;
    String Quantity;

}
class Sales
{
    String s_id;
    String s_name;
    String  date;

}
class Oder
{
    String o_id;
    String o_name;
    String o_date;
}
class Inventory
{
    String Inventory_id;
    String DataStore;
    String Sku;
}
public class Bussiness {
    public static void main(String args[])
    {
        Products obj1=new Products();
        obj1.Product_name="water bottle";
        obj1.Product_id="123";
        obj1.Quantity="20ml";
        System.out.println("The product name:"+obj1.Product_name);
        System.out.println("The product_id:"+obj1.Product_id);
        System.out.println(" The Quantity is:"+obj1.Quantity);
        Sales obj2=new Sales();
        obj2.s_name="vishal mart";
        obj2.date="2024-1-02";
        obj2.s_id="123";
        System.out.println("The sales  name:"+obj2.s_name);
        System.out.println("The s_id:"+obj2.s_id);
        System.out.println(" The date is:"+obj2.date);
        Oder obj3=new Oder();
        obj3.o_name="amazon";
        obj3.o_date="2022-01-09";
        obj3.o_id="2020";
        System.out.println("The order name:"+obj3.o_name);
        System.out.println("The date:"+obj3.o_date);
        System.out.println(" The id:"+obj3.o_id);
        Inventory obj4=new Inventory();
        obj4.Sku="1";
        obj4.DataStore="warehouse";
        obj4.Inventory_id="2";
        System.out.println("The dataware name:"+obj4.DataStore);
        System.out.println("The sku_id:"+obj4.Sku);
        System.out.println(" The Inventory is:"+obj4.Inventory_id);
    }
}
