// Print the Table of a given number

package HomeworkProblem;

import java.util.Scanner;

public class Problem008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number whose table do you want to print: ");
        int n = scan.nextInt();
        int t = 0;
        for(int i = 1; i <= 10; i++){
            t = n*i;
            System.out.println(t);
        }
        scan.close();
    }
}
