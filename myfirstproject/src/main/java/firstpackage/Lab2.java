package firstpackage;

import firstpackage.SquareDoubleIncrement;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        SquareDoubleIncrement sdi = new SquareDoubleIncrement();
        int result = sdi.square(input);
        System.out.println("***squaring ("+ result + ")");
        result = sdi.increment(result);
        System.out.println("***Incrementing ("+ result + ")");
        result = sdi.doubling(result);
        System.out.println("***Doubling ("+ result + ")");
    }
}
