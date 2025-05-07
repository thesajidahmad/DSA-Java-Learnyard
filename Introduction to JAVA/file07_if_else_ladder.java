import java.util.Scanner;


public class file07_if_else_ladder {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int marks = sc.nextInt();

         if(marks >= 80){
            System.out.println("Very Good!!");
         }
         else if(marks >= 60){
            System.out.println("Good!!");
         }
         else if (marks >= 30) {
            System.out.println("Pass!!");
         }
         else{
            System.out.println("Fail!!");
         }
     sc.close();    
    }
}
