import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("1이상의 숫자 입력:");
            i = sc.nextInt();
        } while (i < 1);
        System.out.println(i);
    }
}
