package Beginner;

public class ProblemOne {

    public static void main(String[] args) {

        int firstValue = 10;
        double secondValue = 15.5;

        // This line throws a validation exception. Modify it so that it no longer throws an error and the output
        // to the console is 25.5
        int addedValues = firstValue + secondValue;
        System.out.println("10 + 15.5 = " + addedValues);
    }
}
