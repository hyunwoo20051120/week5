import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
            if(sum >= 100){
                System.out.println(sum);
                break;
            }
        }
    }
}
