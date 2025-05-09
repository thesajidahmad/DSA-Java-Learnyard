// Find the maximum of 3 given integers


package HomeworkProblem;

import java.util.Scanner;

public class Problem001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a >= b && b >= c){
            System.out.println(a);
        }else if (a <= b && b >= c) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }
        scan.close();
    }
}
