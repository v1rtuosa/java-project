package Dice;
import java.util.Random;

public class dice {

    String name;

    public dice(String name){
        this.name = name;
    }
    
        void roll(){
            int [] rollDice = {1,2,3,4,5,6};
            Random rnd = new Random();
            int randomNumber = rollDice[rnd.nextInt(6)];{

                if (randomNumber == 1){
                    System.out.println("result : 1");
                } else if (randomNumber == 2){
                    System.out.println("result : 2");
                } else if (randomNumber == 3){
                    System.out.println("result : 3");
                } else if (randomNumber == 4){
                    System.out.println("result : 4");
                } else if (randomNumber == 5){
                    System.out.println("result : 5");
                } else if (randomNumber == 6){
                    System.out.println("result : 6");
                } else {
                    System.out.println("result = ....");
                }
                    
                
            }
        }

        
    }
