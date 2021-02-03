import java.util.Scanner;

class Q2 {

    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;

        Scanner sc = new Scanner(System.in);

        int num;

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();

            if (num%2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }

        System.out.println("Even: "+ count1);
        System.out.println("Odd: "+ count2);

        sc.close();
    }
}
