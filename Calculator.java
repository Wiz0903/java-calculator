import java.util.Scanner; // Import Scanner class to read user input

public class Calculator {
   public static void main(String[] args) {
   
      // Create Scanner object to get input from the user
      Scanner input = new Scanner(System.in);
      
      // Ask the user for the starting number
      System.out.print("Enter starting number: ");
      int result = input.nextInt(); // Store starting number in result
      
      int choice = 0; // Variable to store the user's menu choice
      
      // Loop continues until the user chooses option 5 (Exit)
      while (choice != 5) {
      
         // Display calculator menu
         System.out.println("1. Add");
         System.out.println("2. Subtract");
         System.out.println("3. Multiply");
         System.out.println("4. Divide");
         System.out.println("5. Exit\n");
         
         // Ask user to choose an operation
         System.out.print("Choose option: ");
         choice = input.nextInt();
         
         // Addition
         if (choice == 1) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            result += num; // Add number to result
            
         // Subtraction
         } else if (choice == 2) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            result -= num; // Subtract number from result
            
         // Multiplication
         } else if (choice == 3) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            result *= num; // Multiply result by number
         
         // Division
         } else if (choice == 4) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            result /= num; // Divide result by number
         }
       }
       
       // Display final result after exiting the loop
       System.out.println("Answer: " + result);
       
       // Close the Scanner to free resources
       input.close();
    }
}