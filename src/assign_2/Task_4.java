/**
 * Gives information about a score
 * 
 * @author Jia Xuan Li
 * @since 2021-10-07
 * @version 1.0
 */
public class Task_4 {
    /**
     * Finds the letter score for the given grade
     * 
     * @param digitScore The score as a number
     * @return The letter score
     */
    public static char toLetterScore(double digitScore) {
        if (digitScore < 60) {
            return 'F';
        } else if (digitScore < 70) {
            return 'D';
        } else if (digitScore < 80) {
            return 'C';
        } else if (digitScore < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    /**
     * Prints a message about the score, using if/else
     * 
     * @param letterScore The score as a character
     */
    public static void printMessage1(char letterScore) {
        if (letterScore == 'F') {
            System.out.println("Better try again");
        } else if (letterScore == 'D') {
            System.out.println("Passed");
        } else if (letterScore == 'C' || letterScore == 'B') {
            System.out.println("Well done");
        } else if (letterScore == 'A') {
            System.out.println("Excellent");
        }
    }

    /**
     * Prints a message about the score, using switch/case
     * 
     * @param letterScore The score as a character
     */
    public static void printMessage2(char letterScore) {
        switch (letterScore) {
            case 'F':
                System.out.println("Better try again");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'C':
            case 'B':
                System.out.println("Well done");
                break;
            case 'A':
                System.out.println("Excellent");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println(toLetterScore(67));
        System.out.println(toLetterScore(95));
        System.out.println(toLetterScore(23));
        System.out.println(toLetterScore(75));

        printMessage1('F');
        printMessage1('D');
        printMessage1('C');
        printMessage1('B');
        printMessage1('A');

        printMessage2('F');
        printMessage2('D');
        printMessage2('C');
        printMessage2('B');
        printMessage2('A');

    }
}
