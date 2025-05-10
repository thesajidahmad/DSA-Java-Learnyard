// A Problem - FizzBuzz (Sum of i and break when sum > n*3)

// Given a number N, iterate i = 1 to N:
// Print "FizzBuzz" if i is multiple if both 3 and 5.
// Print "Fizz" if i is multiple by 3 only.
// Print "Buzz" if i is multiple by 5 only.
// Otherwise, print the value of i.

package HomeworkProblem;

import java.util.Scanner;

public class Problem010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = scan.nextInt();
        int sum = 0;
        
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
                sum = sum + i;
                System.out.println("Sum is: "+sum);
            }
            if(sum > n * 3){
                break;
            }
        }


        scan.close();
    }
}
