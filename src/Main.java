import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Rania Sutton
*****************************************************************************************************
*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String firstName = "";
        String favouriteFood = "";
        System.out.println("Please enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your first name: ");
        firstName = scanner.nextLine();
        System.out.println("Please enter your favourite food: ");
        favouriteFood = scanner.nextLine();
        System.out.println("First name: "+firstName+"\nAge: "+age+"\nFavourite food: "+favouriteFood);
    }

}
