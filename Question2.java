import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks:");
        marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: O");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade: E");

        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade: A");

        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: B");

        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade: C");

        } else if (marks >= 40 && marks <= 49) {

            System.out.println("Grade: D");
        }

        sc.close();
    }
}
