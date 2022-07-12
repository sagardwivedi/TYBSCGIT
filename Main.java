// write simple java program to find the sum of n natural numbers

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the number of natural numbers to be added: ");
            int n = scn.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        }
    }
}
