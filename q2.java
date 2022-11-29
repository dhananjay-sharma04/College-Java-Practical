import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int temp,sum=0,n,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check");
        n=sc.nextInt();
        temp=n;    
        while(n>0){    
        r=n%10;  //getting remainder  
        sum=(sum*10)+r;    
        n=n/10;    
        }
        if(temp==sum){
            System.out.println("number is pallindrome");
        }
        else{
            System.out.println("number is not pallindrome");
        }
    }
}

/*
 * PS F:\java\clg practical> cd "f:\java\clg practical\" ; if ($?) { javac q2.java } ; if ($?) { java q2 }        
enter a number to check
121
number is pallindrome
PS F:\java\clg practical> cd "f:\java\clg practical\" ; if ($?) { javac q2.java } ; if ($?) { java q2 }
enter a number to check
1234
number is not pallindrome
 */
