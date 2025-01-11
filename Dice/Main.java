package Dice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        dice singleDice = new dice("dice 1");
        int a;
        
    do{
        System.out.println("\nWanna roll the dice?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Choice : ");
        a = sc.nextInt();

            if(a == 1){
                singleDice.roll();
            } else if (a == 2){
                System.out.println("\nprogram closed");
            } else {
                System.out.println("wrong input");
            }
    

        } while (a != 2);

        sc.close();
    }
}
