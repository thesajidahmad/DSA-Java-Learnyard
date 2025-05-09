// Given 3 sides of a triangle, check whether it's a valid triangle or not?


package HomeworkProblem;

import java.util.Scanner;

public class Problem003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter side A: ");
        int a = scan.nextInt();

        System.out.println("Enter side B: ");
        int b = scan.nextInt();
        
        System.out.println("Enter side C: ");
        int c = scan.nextInt();

        if(((a + b) > c) && (b + c > a) && (c + a > b)){
            System.out.println("It is a Valid Triangle");
        }else{
            System.out.println("It is not a valid Triangle");
        }
        scan.close();
    }
}
