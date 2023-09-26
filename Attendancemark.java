
/*
 * File          :Attendancemark.java 
 * Description   : Find attendance mark
 * Author        :Nandagopan L
 * Version       : 1.0
 * Date          : 26/09/2023
 * */
package javalab;
import java.util.Scanner;
public class Attendancemark {
	public static void main(String[] args) {
		float attendancepercentage;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the attendance percentage:");
		attendancepercentage=sc.nextInt();
		if(attendancepercentage>=90)
		{
			System.out.println("the mark is :10");
		}
		else
		{
			float newmark=attendancepercentage/10;
			System.out.println("the mark is :"+newmark);
			
		}
	}
}
