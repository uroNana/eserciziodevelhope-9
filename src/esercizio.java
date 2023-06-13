//Loop infinite times asking the user to input a number between 1 and 10
//Print the name of the number (e.g. 5 --> five)
//If the user input a number lower than 1 or greater than 10, print Cannot give you the name
import java.util.Scanner;

public class esercizio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");

        switch(input.nextInt()) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            case 6 -> System.out.println("six");
            case 7 -> System.out.println("seven");
            case 8 -> System.out.println("eight");
            case 9 -> System.out.println("nine");
            case 10 -> System.out.println("ten");
            default -> System.out.println("Cannot give you the name");
        }

        input.close();
    }
}
