package Beginner;

public class ProblemSix {

    public static void main(String[] args) {

        String yourAge = "28";
        int legalDrinkingAge = 21;

        // This line throws a illegal operation exception. Resolve this issue by only modifying line 11.
        System.out.println("Can you drink? " + yourAge >= legalDrinkingAge);
    }
}
