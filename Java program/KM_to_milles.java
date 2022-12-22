package com.company;
import java.util.Scanner;
public class KM_to_milles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter distance in kilometer :");
        float miles;
        float Km=sc.nextFloat();
        miles=0.621371f*Km;
        System.out.println(miles);
    }
}
