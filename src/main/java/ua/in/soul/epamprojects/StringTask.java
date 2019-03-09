package ua.in.soul.epamprojects;

import java.math.BigInteger;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger number = null;

        while (number == null) {
            try {
                System.out.print("\nВведите целое число -> ");
                String string = scanner.nextLine();
                number = new BigInteger(string);
            } catch (NumberFormatException e) {
                System.out.println("Исключение: " + e);
            }
        }
        System.out.println("Двоичное представление даного числа -> " + convertingToBinary(number));
    }

    public static String convertingToBinary(BigInteger number) {
        return number.toString(2);
    }
}

