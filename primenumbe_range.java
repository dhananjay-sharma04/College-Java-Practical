import java.util.Scanner;

/**
 * primenumbe_range
 */
public class primenumbe_range {
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
 
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }
    static void printPrime(int start, int end)
    {
        for (int i = 2; i <= end; i++) {
            if (isPrime(i)){
                if(i>=start){
                    System.out.print(i + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        {
            int start,end;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the lower bound");
            start=sc.nextInt();
            System.out.println("enter the upper bound");
            end=sc.nextInt();

        printPrime(start,end);
        }
    }
    
}

/*
 *---------------output------------------------

PS F:\java\clg practical> java primenumbe_range.java
enter the lower bound
7
enter the upper bound
20
7 11 13 17 19


 */