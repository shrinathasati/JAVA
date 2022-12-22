package com.company;
class base{
    int a;

    public int get_base() {
        return a;
    }

    public void set_base(int a) {
        this.a = a;
    }
}
//class derived is inherited with the help of class base with using "extends" keyword.
class derived extends base{
    int b;

    public int get_derived() {
        return b;
    }

    public void set_derived(int b) {
        this.b = b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        derived obj=new derived();
        obj.set_base(5);
        System.out.println(obj.get_base());
        obj.set_derived(45);
        System.out.println(obj.get_derived());
    }
}
