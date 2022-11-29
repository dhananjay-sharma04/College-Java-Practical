import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
    int row1=2,col1=2;
    int row2=2,col2=2;
    int a[][] = new int[row1][col1];
    int b[][] = new int[row2][col2];
    int c[][] = new int[row1][col2];
    Scanner s = new Scanner(System.in);

    System.out.println("\nEnter values for matrix A : ");
    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col1; j++)
      {
        System.out.print("a["+i+"]"+"["+j+"]=");
        a[i][j] = s.nextInt(); 
      }
    }
    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col1; j++){
        System.out.print(" " + a[i][j]);
      }
      System.out.println("");
    }
    System.out.println("\nEnter values for matrix B : ");
    for (int i = 0; i < row2; i++) {
      for (int j = 0; j < col2; j++){
        System.out.print("b["+i+"]"+"["+j+"]=");
        b[i][j] = s.nextInt();
      }
    }

    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col1; j++){
          System.out.print(" " + b[i][j]);
        }
        System.out.println("");
      }

    System.out.println("\nMatrix multiplication is : ");
    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col2; j++) {
        // Initialize the element C(i,j) with zero
        c[i][j] = 0;

        // Dot product calculation
        for (int k = 0; k < col1; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
        
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
    }
}
/*
PS F:\java\clg practical> cd "f:\java\clg practical\" ; if ($?) { javac q4.java } ; if ($?) { java q4 }
 * Enter values for matrix A : 
a[0][0]=2
a[0][1]=2
a[1][0]=2
a[1][1]=2
 2 2
 2 2

Enter values for matrix B :
b[0][0]=2
b[0][1]=2
b[1][0]=2
b[1][1]=2
 2 2
 2 2

Matrix multiplication is :
8 8
8 8
 */
