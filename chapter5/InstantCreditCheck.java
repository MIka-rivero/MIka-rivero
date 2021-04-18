package chapter5;
/* VARIABLE SCOPE
Write an instant credit check program that
approves anyone who makes more than $25,000 and has a credit score of 700 or better.
*/

import java.util.Scanner;

public class InstantCreditCheck {

    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]) {

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);

        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(double salary, int creditScore) {
        if(salary >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if(isQualified) {
            System.out.println("Congrats! You have qualified for the credit check.");
        }
        else {
            System.out.println("Sorry. You have not qualified for the credit check");
        }

    }

}
