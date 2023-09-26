/*
 * File          :Sumoftwonumbers.java 
 * Description   : Find sum of two numbers
 * Author        :Nandagopan L
 * Version       : 1.0
 * Date          : 26/09/2023
 * */
package javalab;
import java.util.Scanner;
public class Sumoftwonumbers {
	public static void main(String[] args) {
		int num1,num2,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number:");
		
		num1=sc.nextInt();
		System.out.println("enter the second number:");
		
		num2=sc.nextInt();
		sum=sum+num1+num2;
		
		System.out.println("the sum is :"+sum);
	}

}
