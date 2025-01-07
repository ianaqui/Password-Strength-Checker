// PasswordStrengthChecker.java
import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pass;

        do {
            System.out.println("Enter a password to validate: ");
            if (in.hasNextLine()) {
                pass = in.nextLine();
                break;
            } else {
                System.out.println("Try again!");
                in.nextLine();
            }
        } while (true);

        // Length check
        if (pass.length() < 8 || pass.length() > 32) {
            System.out.println("Password must be between 8 and 32 characters");
            System.exit(1);
        }

        // Check chars
        boolean up = false;
        boolean low = false;
        boolean num = false;
        boolean sym = false;

        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) up = true;
            if (Character.isLowerCase(c)) low = true;
            if (Character.isDigit(c)) num = true;
            if ("!@#$%^&*()_+-=[]{}|;:,.<>?".indexOf(c) != -1) sym = true;
        }

        // Get score
        int pts = 0;
        if (up) pts += 2;
        if (low) pts += 2;
        if (num) pts += 2;
        if (sym) pts += 2;
        if (pass.length() >= 12) pts += 2;

        // Check seq chars
        boolean seq = false;
        for (int i = 0; i < pass.length() - 2; i++) {
            if (Character.isLetterOrDigit(pass.charAt(i)) &&
                    Character.isLetterOrDigit(pass.charAt(i + 1)) &&
                    Character.isLetterOrDigit(pass.charAt(i + 2))) {
                if (pass.charAt(i + 1) == pass.charAt(i) + 1 &&
                        pass.charAt(i + 2) == pass.charAt(i) + 2) {
                    seq = true;
                    break;
                }
            }
        }

        // Show results
        if (pts >= 8 && !seq) {
            System.out.println(pass + " is a strong password.");
            System.out.println("Strength score: " + pts + "/10");
        } else {
            System.out.println(pass + " does not meet security requirements.");
            System.out.println("Required: uppercase, lowercase, number, special character");
            System.out.println("Current strength score: " + pts + "/10");
        }
    }
}
