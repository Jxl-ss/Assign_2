/**
 * Calculates the future salary of someone
 * 
 * @author Jia Xuan Li
 * @since 2021-10-07
 * @version 1.0
 */
public class Task_3 {
    /**
     * Calculates the future salary of someone
     * 
     * @param currentSalary The current salary of the person
     * @param year          The amount of years the person wants to work for
     * @return The future salary of the person
     */
    public static double calcFutureSalary(double currentSalary, int year) {
        double futureSalary = currentSalary;
        for (int i = 0; i < year; i++) {
            if (i < 3) {
                futureSalary *= 1.03;
            } else if (i < 10) {
                futureSalary *= 1.05;
            } else {
                futureSalary *= 1.08;
            }
        }

        return futureSalary;
    }

    public static void main(String[] args) {
        System.out.println(calcFutureSalary(10000, 12));
    }
}
