package Week3;

import java.util.Scanner;
import java.util.ArrayList;

public class wordSearch {
    public static void main(String[] args) {
        // Prompt the user to enter a list of strings.  This could be a list of names, cities, sports teams, etc.
        // The user can enter the list of words in one list, or individually after pressing enter after each entry.
        // Parse the list of strings into an array.
        // Prompt the user to enter the word to search for.  (Example; Seattle, or Seahawks, or Canada, etc.)
        // The program should search the array for the search word, and determine if the search word exists in the array
        // If the word exists more than once, it should produce a count of the number of times it exists.
        // The program will then output the list of words, the search word, whether the search word exists in the list
        // (yes or no), and if it does exist, how many times it is found in the list.

        System.out.println("This program will find if and how many times your word occurs in a given string");
        Scanner scanner = new Scanner(System.in);
        char splitter = ',';
        int startIndex = 0;
        int occur = 0;
        ArrayList<String> places = new ArrayList<String>();

        System.out.println("Please enter a list of anything, separated by commas.");
        String scan = scanner.nextLine();

        // this segment  scans through the string, then splits it at a character, adding it to an arraylist
        for(int i = 0; i < scan.length(); i++){
            // split the string based on a character
            if(scan.charAt(i) == splitter){
                // add to arraylist based on the starting and where the split happens
                places.add(scan.substring(startIndex, i).trim()); // trim whitespace
                startIndex = i + 1;
            }
        }
        // adding the last value of to the array after the finishes iterating since it cuts off when I tested it
        places.add(scan.substring(startIndex).trim());

        System.out.println("Please enter a target word, and I will find it for you!");
        String target = scanner.nextLine();

        for(String i : places){
            if(i.equals(target)){
                occur += 1;
            }
        }

        if(occur >= 1){
            System.out.println("Here is your array: " + places);
            System.out.println("Your target word: " + target);
            System.out.println("Your target exists! We found your target " + occur + " time(s)!");
        }
        else{
            System.out.println("Your target does not exist :(");
        }


    }
}
