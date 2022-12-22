package com.company;
import java.util.Scanner;
public class method {
    //method 1
    static int sum(int a,int b){
        return a+b;
    }

    int sum1(int a,int b){
        return a+b;
    }

    int sum1(int a,int b,int c){
        return a+b+c;
    }
    //method 2
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int a=sc.nextInt();
        System.out.println("enter number 2");
        int b=sc.nextInt();
        System.out.println(sum(a,b));
        method obj1=new method();
        System.out.println(obj1.sum1(a,b));
        System.out.println(obj1.sum1(a,b,5));
    }
}
