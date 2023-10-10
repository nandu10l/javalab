/*File          : Frequency.java
 *Description   : To find the frequency of a charactor in a string and return the count of the character. 
 *Author        : Nandagopan L 
 * Version      : 1.0
 * Date			: 03/10/2023
 * */


package javalab;
import java.util.Scanner;
public class Frequency {
	public static void main(String [] args) {
		String userInput;
		System.out.println("input the string: ");
		Scanner sc = new Scanner(System.in);
		userInput = sc.next();
		char findChar;
		System.out.println("input the char");
		findChar = sc.next().charAt(0);
		char []newArray = userInput.toCharArray();
		int count = 0;
		count = countChecker(newArray,userInput,findChar);
		System.out.println("The count of the " + findChar + " is "+count);
	}
	static int countChecker(char [] newArray, String userInput,char findChar) {
		int sentenceLength = userInput.length(),count = 0;
		for (int i = 0; i<sentenceLength;i++) {
			if (findChar == newArray[i] ) {
				count = count +1;
			}
		}
		return count;
	}

}