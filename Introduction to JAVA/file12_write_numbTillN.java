import java.util.Scanner;

public class file12_write_numbTillN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
        scan.close();
    }
}
