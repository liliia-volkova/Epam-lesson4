package ua.in.soul.epamprojects;

import java.util.Scanner;

public class CharTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку -> ");
        String string = scanner.nextLine();
        string = string.toLowerCase();
        String uniqueChars = findUniqueChars(string);
        System.out.println("\nУникальные символы в даной строке -> " + uniqueChars);
    }

    public static String findUniqueChars(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char ith = string.charAt(i);
            boolean duplicate = false;
            for (int j = 0; j < string.length(); j++) {
                if (i != j) {
                    if (ith == string.charAt(j)) {
                        duplicate = true;
                        break;
                    }
                }
            }
            if (!duplicate) {
                result.append(ith);
            }
        }
        return result.toString();
    }
}
