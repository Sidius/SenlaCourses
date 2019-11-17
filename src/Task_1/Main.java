package Task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static boolean flag = true;

    public static void main(String[] args) {
        int number = 0;
        do {
            number = validateAndEnter();
        } while (!flag);

        StringBuilder numberInform = new StringBuilder();
        if (number % 2 == 0) {
            numberInform.append("The number is even (чётный)\n");
        } else {
            numberInform.append("The number is odd (нечётный)\n");
        }

        if (isSimple(number)) {
            numberInform.append("The number is simple (простое)\n");
        } else {
            numberInform.append("The number is composite (составное)\n");
        }

        System.out.println(numberInform);
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

    private static boolean isSimple(int number) {
        for (int i = 2; i < Math.round(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isInteger(float number) {
        int result = (int) number;
        return result == number;
    }
}
