/*
 * File          :ExceptionQ1.java 
 * Description   :Java program that shows the usage of try, catch and finally
 * Author        :Nandagopan L
 * Version       : 1.0
 * Date          : 10/11/2023
 * */
package ExceptionProblems;
import java.util.Scanner;
public class ExceptionQ1 {
	public static void main(String [] args) {
		char key='y';
		while(key=='y') {
		int result;
		System.out.println("Program to perform Division");
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter Number - 1 :");
		int num1= sc.nextInt();
		System.out.println("Enter Number - 2");
		int num2=sc.nextInt();
		
		try {
	    result = num1/num2;
	System.out.println("Result="+result);
		}
		
		catch(Exception e) {
			System.out.println("/ by zero");
		}
		
		finally {
			System.out.println("End of Operation");
		}
		
	System.out.println("Do you want to continue y or n");
    key=sc.next().charAt(0);
	if (key=='n')
	   {
		break; 
	   }
	
	}

  }
}

