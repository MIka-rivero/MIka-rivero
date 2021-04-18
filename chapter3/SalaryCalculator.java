package chapter3;

import java.util.Scanner;
/* IF
Let's say we have a team of salespeople, all of whom make a
standard rate of $1,000 a week. For any of them who make more than 10 sales
that week, they get an additional bonus of $250.*/

public class SalaryCalculator {
    public static void main(String arg[]) {
        //Initializing the values I know
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //getting the unknown value
        System.out.println("Enter how many sales the employee made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales > quota){
            salary = salary + bonus;
        }
        System.out.println("the employee's salary is $" + salary );
    }
}
