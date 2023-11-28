/*
 * File          : StringTokenizerProblem.java  
 * Description   : Java program that reads a line of integers and displayas it's sum
 * Author        : Nandagopan L
 * Version       : 1.0
 * Date          : 28/11/2023
 * */
package javalab;
import java.util.StringTokenizer;
import java.util.Scanner;

public class StringTokenizerProblem {
	public static void main(String [] args) {
		int data = 0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String with numbers:");
		String line=sc.nextLine();
		StringTokenizer st =new StringTokenizer(line);
		
		while(st.hasMoreTokens()) {
			data =Integer.parseInt(st.nextToken());
            sum=sum+data;
		}
		System.out.println("The sum of entered data is:"+sum);
	}

}
