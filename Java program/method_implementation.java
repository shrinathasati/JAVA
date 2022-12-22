package com.company;

public class method_implementation{
    //we can implement method by making static without making class object
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=(x+y)*2;
        }
        else{
            z=(x+y)/2;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=42;
        int b=3;
        int c=logic(a,b);
        System.out.println(c);
    }
}
