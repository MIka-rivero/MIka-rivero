package chapter3;

/* NESTED IF
To qualify for a loan there are two conditions that must be met.
The person must make at least $30,000 and they must have also been at their job for 2 or more years.*/

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String arg[]) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number  of years you've worked at your current job.");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary){
            if(years >= requiredYearsEmployed){
                System.out.println("Congratulations, you qualify for the loan.");
            }
            else {
                System.out.println("Sorry, you must have worked at your current job for at least "
                + requiredYearsEmployed +" years.");
            }
        }
        else {
            System.out.println("Sorry you have to earn at least $"
                    + requiredSalary + " to qualify for the loan");
        }
    }
}
