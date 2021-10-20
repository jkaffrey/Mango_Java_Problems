package Beginner;

public class ProblemFive {

    // Run this code, and you will see that for some reason there is a bug within the application that causes
    // the method isDrinkingAge to state that 20 years only is legal drinking age. Find and resolve the bug in the
    // app that is causing this to happen.
    public static void main(String[] args) {

        System.out.println("Is 20 years only legal drinking age?: " + isDrinkingAge(20));
    }

    public static boolean isDrinkingAge(int yourAge) {

        return yourAge <= 21;
    }
}
