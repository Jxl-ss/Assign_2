import java.util.Random;

/**
 * Generates random numbers to find the average
 * 
 * @author Jia Xuan Li
 * @since 2021-10-07
 * @version 1.0
 */
public class Task_2 {
    /**
     * Finds the average score by generating num random integers
     * 
     * @param num Amount of numbers to generate
     * @return The average score
     */
    public static int calcAverageScore(int num) {
        Random rand = new Random();

        int sum = 0;
        int realNumCount = 0;

        for (int i = 0; i < num; i++) {
            // Gets a value from [0, 100]
            int randomInt = rand.nextInt(101);
            // Numbers below 40 are automatically discarded
            if (randomInt >= 40) {
                // Add the number to the sum
                // and increment the real number count to divide later
                sum += randomInt;
                realNumCount++;
            }
        }

        // Numbers cannot be divided by 0
        if (realNumCount == 0)
            return 0;

        // return the average
        return sum / realNumCount;
    }

    public static void main(String[] args) {
        System.out.println(calcAverageScore(1));
    }
}
