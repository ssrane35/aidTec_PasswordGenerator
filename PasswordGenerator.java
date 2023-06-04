/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abhijeet
 */
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    // Define the possible characters for each category
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:,.<>/?";

    public static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase,
                                          boolean includeNumbers, boolean includeSpecialChars) {
        // Create a StringBuilder to build the password
        StringBuilder password = new StringBuilder();
        // Create an empty string to store the characters based on user preferences
        String characters = "";

        // Check user preferences and add the corresponding characters to the character string
        if (includeUppercase) {
            characters += UPPERCASE_CHARS;
        }
        if (includeLowercase) {
            characters += LOWERCASE_CHARS;
        }
        if (includeNumbers) {
            characters += NUMBERS;
        }
        if (includeSpecialChars) {
            characters += SPECIAL_CHARS;
        }

        // Create a Random object to generate random indices
        Random random = new Random();
        // Generate the password by selecting random characters from the character string
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        // Convert the StringBuilder to a string and return the generated password
        return password.toString();
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the password
        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        // Prompt the user to specify the inclusion of uppercase letters
        System.out.print("Include uppercase letters (true/false): ");
        boolean includeUppercase = scanner.nextBoolean();

        // Prompt the user to specify the inclusion of lowercase letters
        System.out.print("Include lowercase letters (true/false): ");
        boolean includeLowercase = scanner.nextBoolean();

        // Prompt the user to specify the inclusion of numbers
        System.out.print("Include numbers (true/false): ");
        boolean includeNumbers = scanner.nextBoolean();

        // Prompt the user to specify the inclusion of special characters
        System.out.print("Include special characters (true/false): ");
        boolean includeSpecialChars = scanner.nextBoolean();

        // Generate the password based on user preferences
        String password = generatePassword(length, includeUppercase, includeLowercase, includeNumbers, includeSpecialChars);
        
        // Display the generated password to the user
        System.out.println("Generated password: " + password);
    }
}
