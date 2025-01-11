package gradeCheck;
import java.util.Scanner;

public class gradeCheck {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        System.out.print(" Insert your score(number): ");
        int i = in.nextInt();
        in.close();

        MethodNilai(i);
    
    }

    public static void MethodNilai(int n){
        if (n >= 0 && n <= 30) {
            System.out.println("You got E!");
        } else if (n > 30 && n <= 50) {
            System.out.println("You got D!");
        } else if (n > 50 && n <= 70) {
            System.out.println("You got C!");
        } else if (n > 70 && n <= 85) {
            System.out.println("You got B!");
        } else if (n > 80 && n <= 100) {
            System.out.println("You got A!");
        } else {
            System.out.println("Wrong Input!");


    }
    
  }
}
