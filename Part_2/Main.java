package Part_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // Two-dimensional array of states and their capitals; array is purposefully unordered 
        String[][] statesAndCapitals = {
            {"Alabama", "Montgomery"}, {"Montana", "Helena"}, {"Alaska", "Juneau"}, {"Nebraska", "Lincoln"},
            {"Arizona", "Phoenix"}, {"Nevada", "Carson City"}, {"Arkansas", "Little Rock"}, {"New Hampshire", "Concord"},
            {"California", "Sacramento"}, {"New Jersey", "Trenton"}, {"Colorado", "Denver"}, {"New Mexico", "Santa Fe"},
            {"Connecticut", "Hartford"}, {"New York", "Albany"}, {"Delaware", "Dover"}, {"North Carolina", "Raleigh"},
            {"Florida", "Tallahassee"}, {"North Dakato", "Bismarck"}, {"Georgia", "Atlanta"}, {"Ohio", "Columbus"},
            {"Hawaii", "Honolulu"}, {"Oklahoma", "Oklahoma City"}, {"Idaho", "Boise"}, {"Oregon", "Salem"},
            {"Illinois", "Springfield"}, {"Pennsylvania", "Harrisburg"}, {"Indiana", "Indianopolis"}, {"Rhode Island", "Providence"},
            {"Iowa", "Des Moines"}, {"South Carolina", "Columbia"}, {"Kansas", "Topeka"}, {"South Dakota", "Pierre"},
            {"Kentucky", "Frankfort"}, {"Tennessee", "Nashville"}, {"Louisiana", "Baton Rouge"}, {"Texas", "Austin"},
            {"Maine", "Augusta"}, {"Utah", "Salt Lake City"}, {"Maryland", "Annapolis"}, {"Vermont", "Montpelier"},
            {"Massachusetts", "Boston"}, {"Virginia", "Richmond"}, {"Michigan", "Lansing"}, {"Washington", "Olympia"},
            {"Minnesota", "Saint Paul"}, {"West Virginia", "Charleston"}, {"Mississippi", "Jackson"}, {"Wisconsin", "Madison"},
            {"Missouri", "Jefferson City"}, {"Wyoming", "Cheyenne"}
        };

        // Create an empty HashMap with K and V being of type String
        Map<String, String> statesAndCapitalsMap = new HashMap<String, String>();

        // Traverse the 2D array and add the State as the key and the Capital as the value to the HashMap
        for (int i = 0; i < statesAndCapitals.length; i++) {
            statesAndCapitalsMap.put(statesAndCapitals[i][0], statesAndCapitals[i][1]);
        }

        // Traverse and print each entry in the HashMap
        System.out.println("Unsorted Map");
        for (Map.Entry<String, String> x:statesAndCapitalsMap.entrySet()) {
            System.out.println("State: " + x.getKey() + ", Capital: " + x.getValue());

        }

        System.out.println();   // Print a blank line

        // Create a TreeMap using the TreeMap(Map m) constructor. This will populate the TreeMap with the entries of the 
        // statesAndCapitalsMap and sort them in natural order (by the key)
        TreeMap<String, String> treeMap = new TreeMap<String, String>(statesAndCapitalsMap);

        // Traverse and print each entry in the TreeMap. This will be sorted based on the Capital
        System.out.println("Sorted Map");
        for (Map.Entry<String, String> x:treeMap.entrySet()) {
            System.out.println("State: " + x.getKey() + ", Capital: " + x.getValue());
        }

        System.out.println();   // Print a blank line

        Scanner scanner = new Scanner(System.in);   // Using Scanner class for user input

        String userInput;    // variable that will hold the user's input


        boolean flag = true;    // flag used to check if user wants to quit the program

        while (flag) {
            System.out.println("Enter a U.S. state: ");    // Prompt user for input
            userInput = scanner.nextLine();      // Get the user's input

            // Traverse the TreeMap to find the user's value
            if (treeMap.containsKey(userInput)) {
                System.out.println("The capital of " + userInput + " is " + treeMap.get(userInput));
            }
            else {
                System.out.println("Sorry, but " + userInput + " is not a U.S. state");
            }

            System.out.println();   // Print a blank line

            // Ask the user if they would like to try again
            System.out.println("Would you like to try again?");
            System.out.println("y/Y for Yes, anything else will be considered No ");
            
            userInput = scanner.nextLine();     // Update userInput with the response to go again or not

            // Set the flag to false so the while-loops condition becomes false and the program ends
            if (userInput.equals("Y") || userInput.equals("y")) {
                continue;
            }

            break;
        }
    }
}
