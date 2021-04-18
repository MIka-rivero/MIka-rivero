package chapter3;

/* IF/ELSE/IF
Given a numeric test score,
        we need to figure out the letter grade for that test score.*/

import java.util.Scanner;

public class TestResults {
    public static void main(String arg[]) {
        //Get the score
        System.out.println("Enter your score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        char grade;

        if(score <60 ) {
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 90){
            grade ='B';
        }
        else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}
