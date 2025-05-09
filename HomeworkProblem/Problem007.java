// Print only those even numbers from 1 to N that are divisible by 7 also.

package HomeworkProblem;

import java.util.Scanner;

public class Problem007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 2 == 0 && n % 7 == 0) {
            System.out.println("The given number "+n+ " is even number and also divisible by 7");
        }else{
            System.out.println("The given number "+n+ " is not an even number or not divisible by 7");
        }
        scan.close();
    }
}
