
/*
 * File          :Positivesum.java 
 * Description   : Find sum of positive numbers until a negative number is entered using while statement
 * Author        :Nandagopan L
 * Version       : 1.0
 * Date          : 26/09/2023
 * */
package javalab;
 import java.util.Scanner;
public class Positivesum {
	public static void main(String[] args) {
		int num=0,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		while(num>0)
		{
			sum=sum+num;
			num=sc.nextInt();
			
		}
		System.out.println("Sum of Number is:"+sum);
	}


}
