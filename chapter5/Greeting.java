package chapter5;
/* Create a method that aks for the name and then greets the persona by their name
*/

import java.util.Scanner;

public class Greeting {
    public static void main(String arg[]) {
        System.out.println("What is your name?: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Oh, Hi there," + name + "!");
    }
}
