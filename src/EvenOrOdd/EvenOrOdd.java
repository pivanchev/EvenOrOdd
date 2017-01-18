package EvenOrOdd;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Type a number!");
        int num = Integer.parseInt(read.nextLine());
        if (num%2==0) {
            System.out.println("Even.");

        } else {
            System.out.println("Odd.");
        }

    }

}
