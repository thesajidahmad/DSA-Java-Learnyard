// Print even numbers from 1 to n

package HomeworkProblem;

import java.util.Scanner;

public class Problem006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 1; i <= n; i++ ){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
