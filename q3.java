import java.util.Scanner;

public class q3 {
    static void power(int n,int pow){
        int temp=1;
        int po=1;
        while(temp<=pow){
            po = po*n;
            temp++;
        }      
        System.out.println(po);
    }
    public static void main(String[] args) {
        int n,power;
        Scanner sc = new Scanner(System.in);    
        System.out.println("enter the number");
        n=sc.nextInt();
        System.out.println("enter the exponent ");
        power=sc.nextInt();
        power(n,power);
    }
}
/*
 * PS F:\java\clg practical> cd "f:\java\clg practical\" ; if ($?) { javac q3.java } ; if ($?) { java q3 }
enter the number
5
enter the exponent 
5
3125
PS F:\java\clg practical> cd "f:\java\clg practical\" ; if ($?) { javac q3.java } ; if ($?) { java q3 }
enter the number
5
enter the exponent 
4
625
 */
