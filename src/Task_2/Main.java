package Task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static boolean flag = true;

    public static void main(String[] args) {
        int number_1 = 0;
        do {
            number_1 = validateAndEnter();
        } while (!flag);

        int number_2 = 0;
        do {
            number_2 = validateAndEnter();
        } while (!flag);

        System.out.println("GCD = " + gcd(number_1, number_2));
        System.out.println("LCM = " + lcm(number_1, number_2));
    }

    private static int validateAndEnter()
    {
        Scanner scanner = new Scanner(System.in);
        float n = 0;
        try {
            do {
                n = scanner.nextFloat();
                if (!isInteger(n)) {
                    System.out.println("Wrong enter!");
                }
                flag = true;
            } while (!isInteger(n));
        } catch (InputMismatchException e) {
            System.out.println("Wrong enter!");
            flag = false;
            return 0;
        }
        return (int) n;
    }

    private static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static boolean isInteger(float number) {
        int result = (int) number;
        return result == number;
    }
}
