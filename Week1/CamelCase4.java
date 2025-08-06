//Camel Case is a naming style common in many programming languages. In Java, method and variable names typically start with a lowercase letter, with all subsequent words starting with a capital letter (example: startThread). Names of classes follow the same pattern, except that they start with a capital letter (example: BlueCar).
//
//        Your task is to write a program that creates or splits Camel Case variable, method, and class names.
//
//        Input Format
//
//        Each line of the input file will begin with an operation (S or C) followed by a semi-colon followed by M, C, or V followed by a semi-colon followed by the words you'll need to operate on.
//        The operation will either be S (split) or C (combine)
//        M indicates method, C indicates class, and V indicates variable
//        In the case of a split operation, the words will be a camel case method, class or variable name that you need to split into a space-delimited list of words starting with a lowercase letter.
//        In the case of a combine operation, the words will be a space-delimited list of words starting with lowercase letters that you need to combine into the appropriate camel case String. Methods should end with an empty set of parentheses to differentiate them from variable names.
//        Output Format
//
//        For each input line, your program should print either the space-delimited list of words (in the case of a split operation) or the appropriate camel case string (in the case of a combine operation).
//        Sample Input
//
//        S;M;plasticCup()
//
//        C;V;mobile phone
//
//        C;C;coffee machine
//
//        S;C;LargeSoftwareBook
//
//        C;M;white sheet of paper
//
//        S;V;pictureFrame
//
//        Sample Output
//
//        plastic cup
//
//        mobilePhone
//
//        CoffeeMachine
//
//        large software book
//
//        whiteSheetOfPaper()
//
//        picture frame
//
//        Explanation
//
//        Use Scanner to read in all information as if it were coming from the keyboard.
//
//        Print all information to the console using standard output (System.out.print() or System.out.println()).
//
//        Outputs must be exact (exact spaces and casing).


import java.io.*;
import java.util.*;

public class CamelCase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(";");
            String operation = parts[0];
            String type = parts[1];
            String input = parts[2];

            if (operation.equals("S")) {
                System.out.println(splitCamelCase(input, type));
            } else if (operation.equals("C")) {
                System.out.println(combineToCamelCase(input, type));
            }
        }

        scanner.close();
    }

    private static String splitCamelCase(String input, String type) {
        // Remove () for methods
        if (type.equals("M")) {
            input = input.replace("()", "");
        }

        StringBuilder result = new StringBuilder();
        boolean firstChar = true;

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                if (!firstChar) {
                    result.append(" ");
                }
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
            firstChar = false;
        }

        return result.toString();
    }

    private static String combineToCamelCase(String input, String type) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0 && (type.equals("V") || type.equals("M"))) {
                // First word lowercase for variables and methods
                result.append(word);
            } else {
                // Capitalize first letter of each word
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
            }
        }

        // Add () for methods
        if (type.equals("M")) {
            result.append("()");
        }

        return result.toString();
    }
}

