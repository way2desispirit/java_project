package firstpackage;

import java.util.Scanner;

public class GuessGame {
    public static void GuessGame() {
        int count = 1;
        int computer_generated_number = (int) (Math.random()*100);
        System.out.println("computer_generated_number:" + computer_generated_number);
        System.out.println("Welcome to the Guessing Game. Enter a number between 1 and 100:");
        int mynum = takeinput();
        while (mynum != computer_generated_number){
            if (mynum < computer_generated_number){
                System.out.println("Aim higher!!!");
                count += 1;
                mynum = takeinput();
            }
            else if (mynum > computer_generated_number){
                System.out.println("Aim Lower!!!");
                count +=1;
                mynum = takeinput();
            }
        }
        System.out.println("Bingo!!! You did it in " + count + " attempts.");
    }

    private static int takeinput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
