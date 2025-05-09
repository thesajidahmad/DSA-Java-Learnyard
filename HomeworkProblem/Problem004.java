// Find sum of all odd numbers from 1 to N

package HomeworkProblem;

import java.util.Scanner;

public class Problem004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i, a = 0;
        for(i = 1; i <= n; i++){
            if(i % 2 != 0){
                a = a + i;
                // System.out.println(a);
                // System.out.println(i);
            }
        }
        System.out.println(a);
        scan.close();
    }
}
