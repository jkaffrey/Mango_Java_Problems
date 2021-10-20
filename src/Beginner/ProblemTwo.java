package Beginner;

public class ProblemTwo {

    public static void main(String[] args) {

        int firstValue = 11;
        double secondValue = 25;
        int thirdValue = 3;

        // Running this mathematic operation returns 19.333333333333336, but we want it to return 12. Without
        // modifying the variables above, modify line 13 so that the output is 12.
        double output = firstValue + secondValue / thirdValue;
        System.out.println("Your output is: " + output);
    }
}
