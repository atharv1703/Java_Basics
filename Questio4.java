import java.util.Scanner;

public class Questio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r, sum = 0, temp;
        int n;

        System.out.println("Enter Number:");
        n = sc.nextInt();

        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Palindrome Number !!!!");
        else
            System.out.println("Not Palindrome ;_;");

        sc.close();
    }

}
