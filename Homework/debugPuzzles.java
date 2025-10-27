// debug the following code, use your brain and paper. If you couldn't find the errors, use your IDE.

public class SimplePuzzle {
    public static void main(String[] args) {
        String keyword = "secret";
        String guess = "secret";

        int number = 10;
        int check = 3;

        boolean isCorrectGuess;
        boolean hasSubstring;
        boolean isDivisible;
        
        // Puzzle 1: Compare the strings
        if (guess == keyword) {
            isCorrectGuess = true;
        } else {
            isCorrectGuess = false;
        }

        // Puzzle 2: Find the substring
        int firstIndex = keyword.indexOf("cre");
        if (firstIndex > 0) {
            hasSubstring = true;
        } else {
            hasSubstring = false;
        }

        // Puzzle 3: Check divisibility
        if (number / check == 0) {
            isDivisible = true;
        } else {
            isDivisible = false;
        }
        
        // The final result
        if (isCorrectGuess && hasSubstring && isDivisible) {
            System.out.println("The puzzle is solved!");
        } else {
            System.out.println("Something is wrong with your logic.");
            System.out.println("isCorrectGuess: " + isCorrectGuess);
            System.out.println("hasSubstring: " + hasSubstring);
            System.out.println("isDivisible: " + isDivisible);
        
    }
}
