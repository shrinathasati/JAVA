package com.company;
import java.util.Scanner;

public class reversing_the_exiting_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr1= {1,2,3,4,5,6};
        //for reversing the exiting array
        //method 1-> swapping method
        int l=arr1.length;
        int a= Math.floorDiv(l,2);
        System.out.println("first method is ");
        for(int i=0;i< a;i++){
            int temp=arr1[i];
            arr1[i]=arr1[l-i-1];
            arr1[l-i-1]=temp;
        }
        for(int element:arr1){
            System.out.println("element is : "+element);
        }
        System.out.println("second method is ");
        //method 2-> looping method
        int [] arr2=new int[arr1.length];
        int j=0;
        for(int i=arr1.length-1;i>=0;i--){
            arr2[j]=arr1[i];
            j++;
        }
        for(int i=0;i<arr2.length;i++){
            arr1[i]=arr2[i];
        }
        for(int element:arr1){
            System.out.println("element is : "+element);
        }

    }
}
