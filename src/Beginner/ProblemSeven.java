package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemSeven {

    // There are two bugs in this application that are preventing it from working correctly. Find and resolve those bugs
    // Do NOT change or modify lines 23 onward.
    public static void main(String[] args) {

        System.out.print("Please input your age: ");
        String inputAge = readLineFromConsole();

        System.out.println("Can you legally drink? " + canYouDrink(inputAge));
    }

    public static boolean canYouDrink(int yourAge) {
        return yourAge <= 21;
    }

    /** Do NOT modify the code bellow **/
    public static String readLineFromConsole() {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (IOException exception) {
            System.out.println("Something went wrong reading from the console.");
            return "";
        }
    }
}
