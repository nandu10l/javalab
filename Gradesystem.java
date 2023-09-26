/*
 * File          :Attendancemark.java 
 * Description   : Find attendance mark
 * Author        :Nandagopan L
 * Version       : 1.0
 * Date          : 26/09/2023
 * */
package javalab;
import java.util.Scanner;
public class Gradesystem {
	public static void main(String[] args)
	{
		float markofstudent;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the mark:");
		markofstudent=sc.nextInt();
		if(markofstudent>90)
		{
			System.out.println("the Grade is :S");
		}
		else if(markofstudent>85)
		{
			System.out.println("the Grade is :A+");
		}
		else if(markofstudent>85)
		{
			System.out.println("the Grade is :A");
		}
		else if(markofstudent>80)
		{
			System.out.println("the Grade is :B+");
		}
		else if(markofstudent>75)
		{
			System.out.println("the Grade is :B");
		}
		else if(markofstudent>70)
		{
			System.out.println("the Grade is :C");
		}
		else if(markofstudent>60)
		{
			System.out.println("the Grade is :D");
		}
		else if(markofstudent>50)
		{
			System.out.println("the Grade is :E");
		}
		else if(markofstudent>40)
		{
			System.out.println("the Grade is :P");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
