
/*
 * File          :Prime.java 
 * Description   :java program to check whether a given number is prime or not
 * Author        :Nandagopan L
 * Version       : 1.0
 * Date          : 31/10/2023
 * */
package abs;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		int fact=0;
		Scanner sc=new Scanner(System.in);
				System.out .println("Enter a number :");
				int number= sc.nextInt();
				for(int i=1;i<number;i++)
				{
					if(number%i==0)
					{
						fact++;
					}
				}
   if(fact==1)
   {
	   System.out.println("The Number is prime");
   }
   else
   {
	   System.out.println("The Number is not Prime");
   }
}
}

