import java.util.Scanner;
import java.util.Random;

public class Ivan {
    public static void main(String[] args) {


        String correctUsername = "ivan";
        String correctPassword = "ivan";


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine(); 

        System.out.print("Enter your password: ");
        String password = scanner.nextLine(); 


        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            Random rand = new Random();
            int authCode = 100000 + rand.nextInt(900000); 
            System.out.println("Login successful!");
            System.out.println("Your 6-digit authentication code is: " + authCode);
        } else {
            System.out.println("Invalid username or password. Access denied.");
        }

        scanner.close(); 
    }
}