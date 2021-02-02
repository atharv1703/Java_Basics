import java.util.Scanner;

public class Question3 {
    public static void main(String s[]) {
        int day;
        String name = "";

        Scanner sc = new Scanner(System.in);

        day = sc.nextInt();

        if ((day == 1) || (day == 8) || (day == 15) || (day == 22)) {
            name = "mon";
        } else if ((day == 2) || (day == 9) || (day == 16) || (day == 23)) {
            name = "tue";
        } else if ((day == 3) || (day == 10) || (day == 17) || (day == 24)) {
            name = "wed";
        } else if ((day == 4) || (day == 11) || (day == 18) || (day == 25)) {
            name = "thurs";
        } else if ((day == 5) || (day == 12) || (day == 19) || (day == 26)) {
            name = "fri";
        } else if ((day == 6) || (day == 13) || (day == 20) || (day == 27)) {
            name = "sat";
        } else if ((day == 7) || (day == 14) || (day == 21) || (day == 28)) {
            name = "sun";
        }

        switch (name) {
            case "mon":
                System.out.println("Monday");
                break;
            case "tue":
                System.out.println("Tuesday");
                break;
            case "wed":
                System.out.println("Wednesday");
                break;
            case "thurs":
                System.out.println("Thursday");
                break;
            case "fri":
                System.out.println("Friday");
                break;
            case "sat":
                System.out.println("Saturday");
                break;
            case "sun":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }

        sc.close();
    }

}
