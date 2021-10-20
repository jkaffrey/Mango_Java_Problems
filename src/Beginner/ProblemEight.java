package Beginner;

public class ProblemEight {

    // Run the following chunk of code, you will see that the output from the console says that the variable
    // isThisValueTrue is actually equal to false, despite the fact that it's set to true on line 9. Find the line that
    // is the cause of this.
    public static void main(String[] args) {

        boolean isThisValueTrue = true;

        String distract = "I see you reading this";
        int basicMaths = 1 + 1;

        boolean isOnePlusOneTwo = basicMaths == 2;

        String thisIsCool = "/u0004, I wonder what this outputs";
        boolean truthTablesAreWeird = true && false;

        isThisValueTrue = false;

        double whatDoesThisEvenDo =  Math.round(2.333333333333333333333333333333333333333333333333333333333333333333);

        char[] iCanDoThisForDays = { 'M', 'i', 'c', 'h', 'a', 'e', 'l'};
        String imagineHavingToWriteStringLikeThat = "monkaS";

        System.out.println("Is the boolean isThisValueTrue really true? " + isThisValueTrue);
    }
}
