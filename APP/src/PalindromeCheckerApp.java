/**
 *this class represents the entry point of the Palindrome Checker Management App .
 *At this stage the application starts execution for the main() method
 *,displays a welcome message and shows application version
 *No palindrome logic is implemented yet
 *the goal is to establish a clear startup flow.
 *@author Renisha
 *@version 1.0
 */

public class PalindromeCheckerApp{
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System \nVersion : 1.0 \nSystem initialized successfully");
        String input="madam";

        /**This class demonstrates basic palindrome validation using a hardcoded string value
         * at this stage the application;
         * stores a predefined string and checks if it is palindrome and then displays the result
         * UC2 introduces fundamental comparison logic before using advanced data structures.
         * @author Renisha
         * @version 1.1
         */
        System.out.println("Input text: madam");
        System.out.print("Is it a palindrome?:");
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i)!=input.charAt(input.length()-i-1)) {
                System.out.print(" false");
            }else{
                System.out.print(" True");
                break;
            }
        }
    }
}