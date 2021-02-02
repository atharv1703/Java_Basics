import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        String first, last, name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name:");
        first = sc.nextLine();
        System.out.println("Enter Last Name:");
        last = sc.nextLine();

        name = first + " " + last;

        System.out.println("Your Name: " + name);
        sc.close();
    }
}
