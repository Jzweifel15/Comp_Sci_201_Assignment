package Part_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Two-dimensional array of states and their capitals; already in alphabetical order by state
        String[][] statesAndCapitals = {
            {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"}, {"Arkansas", "Little Rock"},
            {"California", "Sacramento"}, {"Colorado", "Denver"}, {"Connecticut", "Hartford"}, {"Delaware", "Dover"},
            {"Florida", "Tallahassee"}, {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
            {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"}, {"Kansas", "Topeka"},
            {"Kentucky", "Frankfort"}, {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, {"Maryland", "Annapolis"},
            {"Massachusetts", "Boston"}, {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, {"Mississippi", "Jackson"},
            {"Missouri", "Jefferson City"}, {"Montana", "Helena"}, {"Nebraska", "Lincoln"}, {"Nevada", "Carson City"},
            {"New Hampshire", "Concord"}, {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"}, {"New York", "Albany"},
            {"North Carolina", "Raleigh"}, {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"}, {"Oklahoma", "Oklahoma City"},
            {"Oregon", "Salem"}, {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"}, {"Tennessee", "Nashville"}, {"Texas", "Austin"}, {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"}, {"Virginia", "Richmond"}, {"Washington", "Olympia"}, {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"}
        };

        
        Scanner scanner = new Scanner(System.in);    // Using Scanner class for user input

        String userInput;    // variable that will hold the user's input

        String foundState = "";       // variable used to hold the state, if the user's input is found

        String foundCapital = "";    // variable used to hold the capital, if the user's input is found

        boolean flag = true;    // flag used to check if user wants to quit the program

        int correctCount = 0;

        while (flag) {
            System.out.println("Enter a U.S. state capital: ");    // Prompt user for input
            userInput = scanner.nextLine();      // Get the user's input

            // Traverse through the array - This for-loop only traverses through the rows of the 2D array
            /*
             * Traverse through the array - This for-loop only traverses through the rows of the 2D array.
             * Since we'll always want to check the user's input against a capital, no need to use a 2nd
             * for-loop. We can always get the capital using statesAndCapitals[i][1]. If the capital is
             * found, print the capital and its state. Else, let the user know that their input is not a 
             * state capital.
             */
            for (int i = 0; i < statesAndCapitals.length; i++) {

                // Check the current state's capital against the user's input
                if (userInput.equals(statesAndCapitals[i][1]) || userInput.equals(statesAndCapitals[i][1].toLowerCase())) {
                    foundState = statesAndCapitals[i][0];
                    foundCapital = statesAndCapitals[i][1];
                }
                
            }

            if (!(foundCapital.equals(""))) {
                // Increase their number of correct answers by 1
                correctCount++;

                System.out.println(foundCapital + " is the capital of " + foundState);
                System.out.println("Score: " + correctCount);

                // Reset foundState and foundCapital to empty Strings before another loop begins
                foundState = "";
                foundCapital = "";
            }
            else {
                System.out.println("Sorry, the value " + userInput + " is not a capital of any U.S. state");
                System.out.println("Score: " + correctCount);
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

        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.sort(statesAndCapitals);
        bubbleSort.print(statesAndCapitals);

    }
}