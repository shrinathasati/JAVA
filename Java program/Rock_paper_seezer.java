package com.company;
import java.util.Random;
import java.util.Scanner;
public class Rock_paper_seezer{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1. Rock\n2. Paper\n3. Seezer");
        System.out.println("enter your choice");
        int user= sc.nextInt();
        Random random=new Random();
        int computer= random.nextInt(3);
        System.out.println("computer has choose "+computer);
        if((user==1 && computer==3) || (user==2 && computer==1) || (user==3 && computer==2)){
            System.out.println("YOU WIN");
        }
        else if (user==computer) {
            System.out.println("DRAW");
        }
        else{
            System.out.println("YOU LOSE");
        }

    }
}
