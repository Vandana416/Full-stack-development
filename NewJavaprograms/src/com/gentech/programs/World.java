package com.gentech.programs;
class Country
{
    String Country_name;
    String language;
    String Independance;

    String Unique;

}
class State
{
    String State_name;
    String capital;
    String Population;
    String Culture;


}
class District
{
    String District_name;
    String  place;
    String Head_quaters;

}
class Village
{
    String village_name;
    String street_no;
    String location;
    int population;

}

public class World {
    public static void main(String args[])
    {
        Country obj1=new Country();
        State obj2=new State();
        District obj3=new District();
        Village obj4=new Village();
        obj1.Country_name="India";
        obj1.Independance="15-07-1947";
        obj1.language="Hindi";
        obj1.Unique="IN";
        obj2.State_name="karnataka";
        obj2.capital="India";
        obj2.Culture="Indian culture";
        obj2.Population="15000000";
        obj3.District_name="Chickkaballapur";
        obj3.Head_quaters="Bangalore";
        obj3.place="in karnataka";
        obj4.village_name="Gudibande";
        obj4.location="near Chickkaballpur";
        obj4.population=1000000;
        obj4.street_no="12";
        System.out.println("The country name:"+obj1.Country_name);
        System.out.println("The Independance we got:"+obj1.Independance);
        System.out.println("The languagre is"+obj1.language);
        System.out.println(" The Unigue is:"+obj1.Unique);
        System.out.println("The state name:"+obj2.State_name);
        System.out.println("The Capital is:"+obj2.capital);
        System.out.println("The Culture is"+obj2.Culture);
        System.out.println(" The population  is:"+obj2.Population);
        System.out.println("The District name:"+obj3.District_name);
        System.out.println("The Place is:"+obj3.place);
        System.out.println("The Head Quarters is"+obj3.Head_quaters);
        System.out.println(" The Village  is:"+obj4.village_name);
        System.out.println("The Street no is:"+obj4.street_no);
        System.out.println("The  Location is"+obj4.location);
        System.out.println(" The Village population is:"+obj4.population);


    }
}
