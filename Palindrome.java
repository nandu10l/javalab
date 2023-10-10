/*File          : Palindrome.java
 *Description   : The program to check wheather the given string is palindrome or not.
 *Author        : Nandagopan L 
 * Version      : 1.0
 * Date			: 26/09/2023
 * 
 * */



package javalab;
import java.util.Scanner;
public class Palindrome {
	public static void main(String [] args) {
		String stringInput, reversedString = "";
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string: ");
			stringInput = sc.next();
			char []arrString=stringInput.toCharArray();
			int stringLength = stringInput.length();
			if(pChecking(arrString,stringLength)){
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not Palindrome");
			}
	}
	static boolean pChecking(char []arrString,int stringLength) {
		int key = 1,k = 0;
		for (int i = stringLength-1; i>=0;i--) {
			if (arrString[i]!=arrString[k]) {
				key = key + 1;
			}
			k = k+1;
		}
		if (key == 1) {
			return true;
		}
		else {
			return false;
		}
}
}