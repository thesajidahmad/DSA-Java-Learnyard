import java.util.Scanner;

public class file11_switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Days = scan.nextInt();

        switch (Days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Number, Please write number between 1 to 7: ");
        }
        scan.close();
    }
}
