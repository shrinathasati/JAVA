package com.company;
import java.util.Scanner;
public class Gpa_calculator {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of your first subject : ");
        a=sc.nextInt();
        System.out.println("enter marks of your second subject : ");
        b=sc.nextInt();
        System.out.println("enter marks of your third subject : ");
        c=sc.nextInt();
        float gpa=(a+b+c)/30f;
        System.out.println("your Gpa is "+gpa);
    }
}
