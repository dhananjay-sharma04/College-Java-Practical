import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        long num1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        long num2 = sc.nextInt();

        try {
            long ans = num1/num2;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}