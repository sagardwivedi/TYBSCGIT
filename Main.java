// simple java program to find the sum of n natural numbers

public class Main {
    public static void main(String[] args) {

        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of " + n + " natural numbers is " + sum);

    }
}
