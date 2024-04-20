package Week2;

import java.util.Scanner;

public class userInput {
    /*
    Prompt the user to enter a string as input.
    Include a method, named printMessage.
    The method should accept a String as a parameter, which will be the output it prints using a println statement.
    When you call the printMessage method from main, include the method call inside a for loop,
    so that the method gets called 5 times. Experiment with different method calls,
    passing different string arguments to the print method.
    */
    public static void main(String[] args) {
        userInput user = new userInput();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an input value (Sports team, name, college, etc...)");
        String msg = input.nextLine();
        for(int i = 0; i < 5; i++){
            user.printMessage(msg);
        }
        input.close();
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
