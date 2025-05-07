import java.util.Scanner;
public class file07_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String Result =  marks>=30 ? "Pass!!" : "Fail!!";
        System.out.println(Result);
        sc.close();
    }
}
