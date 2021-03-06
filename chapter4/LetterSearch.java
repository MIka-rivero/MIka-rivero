package chapter4;
/*Loop Break
a program that searches a String to determine if it contains the letter A.*/

import java.util.Scanner;

public class LetterSearch {
    public static void main(String arg[]) {
        System.out.println("Enter the text you would like to be evaluated: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;
        for(int i = 0; i < text.length(); i ++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound) {
            System.out.println("This text contains the letter A.");
        }
        else {
            System.out.println("This text does not contain the letter A.");
        }
    }
}
