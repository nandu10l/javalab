
/*File          : Matrixmultiplication.java
 *Description   :  Java program to multiply any 2 given matrices
 *Author        : Nandagopan L 
 * Version      : 1.0
 * Date			: 10/10/2023
 * */
package javalab;
import java.util.Scanner;
public class Matrixmultiplication {
	public static void main(String[] args)
	 {
	  Scanner obj=new Scanner(System.in);
	  System.out.print("Enter no of rows of first matrix:");
	  int row1=obj.nextInt();
	  System.out.print("Enter no of columns of first matrix:");
	  int col1=obj.nextInt();
	  System.out.print("Enter no of rows of second matrix:");
	  int row2=obj.nextInt();
	  System.out.print("Enter no of column of second matrix:");
	  int col2=obj.nextInt();
	  int first[][]=new int[row1][col1];
	  int second[][]=new int[row2][col2];
	  int product[][]=new int[row1][col2];
	  System.out.println("Enter elements of first matrix");
	  for(int i=0; i<row1; i++)
	  {
	   for(int j=0; j<col1; j++)
	   {
	    first[i][j]=obj.nextInt();
	   }
	  }
	  System.out.println("Enter elements of second matrix");
	  for(int i=0; i<row2; i++)
	  {
	   for(int j=0; j<col2; j++)
	   {
	    second[i][j]=obj.nextInt();
	   }
	  }
	  if(col1!=row2)
	       System.out.println("Multiplication not possible");
	  else
	  {
	   for(int i=0; i<row1; i++)
	  {
	   for(int j=0; j<col2; j++)
	   {
	        product[i][j]=0;
	        for(int k=0; k<col1; k++)
	                product[i][j]=product[i][j]+(first[i][k]*second[k][j]);
	   }
	  }
	  for(int i=0; i<row1; i++)
	  {
	   for(int j=0; j<col1; j++)
	   {
	    System.out.print(product[i][j]+"\t");
	   }
	   System.out.print("\n");
	  }
	}

}
}
