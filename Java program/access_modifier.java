package com.company;
import java.util.Scanner;

class student{
    private int id;
    private String name;
    public void setid(int a){
        id=a;
    }
    public void setname(String a){
        name=a;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
}

public class access_modifier {
    public static void main(String[] args){
        student first=new student();
        first.setid(1);
        first.setname("raghu");
        System.out.println(first.getid());
        System.out.println(first.getname());
        System.out.println(2);
    }
}
