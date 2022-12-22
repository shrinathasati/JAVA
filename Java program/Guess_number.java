package com.company;
import java.util.Random;
import java.util.Scanner;
class game{
    int user;
    int computer;
    public game(){
        Random random=new Random();
        computer=random.nextInt(10);
        //System.out.println(computer);
    }
    public void user_input(int a){
        user=a;
    }
    public boolean isequal() {
            if (user < computer) {
                System.out.println("you have enter less number than computer");
                return false;
            }
            else if (user > computer) {
                System.out.println("you have enter grater than computer");
                return false;
            }

            else{
                System.out.println("Congratulations! you have gussed correctly");
                return true;
            }

    }

}

public class Guess_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        game player1=new game();
        int i=0;
        do{
            System.out.println("enter your choice:-");
            int a=sc.nextInt();
            player1.user_input(a);
            i++;
        }
        while(player1.isequal()!=true);
        System.out.println("you have taken "+i+" number of chances.");
    }
}
