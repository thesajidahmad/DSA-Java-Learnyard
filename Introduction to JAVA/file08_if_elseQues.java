import java.util.Scanner;
public class file08_if_elseQues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        // if else
        if(a >= b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        // with ternary
        System.out.println(a>=b?a:b);

        scan.close();
    }
}
