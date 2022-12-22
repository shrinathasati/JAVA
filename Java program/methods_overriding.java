package com.company;
class A{
    String name;
    String fname;
    public void print(){
        System.out.println("My name is "+name);
        System.out.println("My father's name is MR. "+fname);
    }
}
class B extends A{
    String name1;
    String fname1;
    public void print(){
        System.out.println("My name is "+name1);
        System.out.println("My father's name is MR. "+fname1);
    }
}
// if there are same name is class so the class B method will call.
public class methods_overriding{
    public static void main(String[] args) {
        B detail=new B();
        detail.name="NANDNI ssASATI";
        detail.name1="SHRINATH ASATI";
        detail.fname="NANDKISHOR ASATI";
        detail.fname1="NANDKISHOR ASATI";
        detail.print();
        detail.print();
    }
}
