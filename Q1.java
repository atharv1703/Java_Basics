import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int one, two, three;

        System.out.println("Enter First Number:");
        one = sc.nextInt();
        System.out.println("Enter Second Number:");
        two = sc.nextInt();
        System.out.println("Enter Third Number:");
        three = sc.nextInt();

        if (one>two && one>three) {
            System.out.println(one+" is the Greatest!!");
        }
        else if (one<two && two>three) {
            System.out.println(two+" is the Greatest!!");
        }
        if (three>two && one<three) {
            System.out.println(three+" is the Greatest!!");
        }
         sc.close();
    }
}
