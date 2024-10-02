import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int age = sc.nextInt();

        do{
            if(age < 0){
                System.out.println("You are negative");
            }
        }while(age < 0);
        System.out.println(age);
    }
}
