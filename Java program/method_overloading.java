package com.company;
import java.util.Scanner;

public class method_overloading{
    //by changing the number of parameter or no of arguments
    static int multi(int a,int b){
        return a*b;
    }
    static int multi(int a,int b,int c){
        return a*b*c;
    }
    //by changing the datatype(return type)
    static void multi(){
        System.out.println("I have no arguments");

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(multi(a,b));
        System.out.println(multi(a,b,c));
        multi();
    }
}
