/*File          : Employee.java
 *Description   : Exercise to understand Inheritance
 *Author        : Nandagopan L 
 * Version      : 1.0
 * Date			: 17/10/2023
 * */
package javalab;
import java.util.Scanner;
public class Employee {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Officer details.");
			System.out.println("Enter the Officer name:");
			String officerName = sc.nextLine();
			System.out.println("Enter the age:");
			int age = sc.nextInt();
			System.out.println("Enter the Phone Number:");
			String phoneNumber = sc.next();
			System.out.println("Enter the Address:");
			String Address = sc.next();
			System.out.println("Enter the Salary:");
			double salary = sc.nextDouble();
			System.out.println("Enter the Specialization:");
			String specialization= sc.nextLine();
			Officer officer = new Officer(officerName,age,phoneNumber,Address,salary,specialization);

			System.out.print("The officer details are: \n"
					+ "Name is " + officer.name+"\n"
					+ "Age is " + officer.age+"\n"
					+ "Address is " + officer.address+"\n"
					+ "Phone Number is " + officer.phoneNumber+"\n"
					+ "Specialization is " + officer.specialization+"\n");
			officer.printSalary();
			System.out.println("\nEnter the Manager details.");
			System.out.println("Enter the name of Manager:");
			String managerName = sc.nextLine();
			System.out.println("Enter the age:");
			int mAge = sc.nextInt();
			System.out.println("Enter the Phone Number:");
			String mPhoneNumber = sc.next();
			System.out.println("Enter the Address:");
			String mAddress = sc.next();
			System.out.println("Enter the Salary:");
			double mSalary = sc.nextDouble();
			System.out.println("Enter the Department:");
			String Department= sc.nextLine();
			Manager manager = new Manager(managerName,mAge,mPhoneNumber,mAddress,mSalary,Department);

			System.out.print("The Manager details are: \n"
					+ "Name is " + manager.name+"\n"
					+ "Age is " + manager.age+"\n"
					+ "Address is " + manager.address+"\n"
					+ "Phone Number is " + manager.phoneNumber+"\n"
					+ "Department is " + manager.department+"\n");
			manager.printSalary();
			}
		
	}
		class Employeee{ 
		String name,address, phoneNumber;
		int age;
		double salary;
		void printSalary() {
			System.out.println("The salary is "+salary);
		}
		
		}
		class Officer extends Employeee{
			String specialization;
			Officer(String name,int age,String phoneNumber,String address,double salary, String specialization){
				this.name = name;
				this.age = age;
				this.phoneNumber = phoneNumber;
				this.address = address;
				this.specialization = specialization;
				this.salary = salary;
			}
		}
		class Manager extends Employeee{
			String department;
			Manager(String name,int age,String phoneNumber,String address,double salary, String department){
				this.name = name;
				this.age = age;
				this.phoneNumber = phoneNumber;
				this.address = address;
				this.department = department;
				this.salary = salary;
			}
		}
