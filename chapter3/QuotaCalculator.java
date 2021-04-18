package chapter3;

import java.util.Scanner;

/* IF STATEMENT
Let's say we have a team of salespeople, all of whom make a
standard rate of $1,000 a week. For any of them who make more than 10 sales
that week, they get an additional bonus of $250. All salespeople are expected to reach tat least ten sales
for those who does it will receive a congratulatory message*/

public class QuotaCalculator {
    public static void main(String arg[]) {
        int quota = 10;

        System.out.println("Enter the number of sales the employee made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota){
            System.out.println("Congrats, you've reached your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not reach your quota. You were " + salesShort + " sales short.");
        }
    }
}
