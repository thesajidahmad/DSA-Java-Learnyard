// Whether a given year is a leap year or not? (Feel free to google what's a leap if you're unsure)


package HomeworkProblem;

import java.util.Scanner;

public class Problem002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap Year");
        }else
            System.out.println("Not a leap Year");

        scan.close();
    }
}
