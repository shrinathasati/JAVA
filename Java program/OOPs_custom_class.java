package com.company;

class employee{
    int id;
    int salary;
    String name;
    public void getinfo(){
        System.out.println(name+" is working as a engineer in Shell india pvt ltd.");
        System.out.println(name+" id is "+id+".");
        System.out.println("the salary of the "+name+" is "+salary+ " Rs. per month. int means 1250000 Rs. per annum. ");
    }


}
public class OOPs_custom_class {
    public static void main(String[] args) {
        employee first=new employee();
        first.name="Nandni Asati";
        first.id = 222002;
        first.salary=125000;
        first.getinfo();
    }
}
