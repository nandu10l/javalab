package Javalab;
import java.util.Scanner;
public class CustomException {
	public static void main (String [] args) {
		InvalidAmountException amountinvalid =new InvalidAmountException();
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter the number of Customers:");
		int noOfCustomers=sc.nextInt();
		Customer [] customer =new Customer[noOfCustomers];
		for(int i=0;i<noOfCustomers;i++) {
			customer[i] = new Customer();
			customer[i].setCustomerDetails();
		}
		
		do {
			System.out.println("1.Display Account Details");
			System.out.println("2.Search by Account Number");
			System.out.println("3.Deposit the amount");
			System.out.println("4.Withdraw the Amount");
			System.out.println("5.Exit");
			System.out.println("enter your choice:");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				for(int i=0;i<noOfCustomers;i++) {
					customer[i].getCustomerDetails();
				}
				break;
				
			case 2:
				System.out.println("Enter the Account Number:");
				int searchAccount= sc.nextInt();
				for(int i=0;i<noOfCustomers;i++) {
					if(customer[i].accountNumber==searchAccount) {
						customer[i].getCustomerDetails();
					}
				}
				break;
				
			case 3:
				System.out.println("Enter the Account Number:");
				searchAccount= sc.nextInt();
				try {
				System.out.println("Enter the Account to Deposit:");
				int depositAmount=sc.nextInt();
				if(depositAmount<0) {
					throw amountException;
				}
				else {
					for(int i=0;i<noOfCustomers;i++) {
						if(customer[i].accountNumber==searchAccount) {
							customer[i].accountBalance=customer[i].accountBalance+depositAmount;
							customer[i].getCustomerDetails();
						        }
					        }
				     }
				
			      }
				catch(InvalidAmountException e) {
					System.out.println(e.getMessage);
				}
				break;
				
			case 4:
				System.out.println("Enter the Account Number:");
				searchAccount= sc.nextInt();
				default:
			
			
			}
		}
        while(choice<4);
	}

}
class InvalidAmountException extends Exception{
	public InvalidAmountException() {
          System.out.println("");
	}
}
class Customer{
	int accountNumber;
	String accountType;
	String customerName;
	int accountBalance;
	Scanner sc=new Scanner(System.in);
	public void setCustomerDetails() {
		System.out.println("Enter the Account Number:");
		accountNumber=sc.nextInt();
		System.out.println("Enter the Account Type:");
		accountType=sc.next();
		System.out.println("Enter the Customer Name:");
		customerName=sc.next();
		System.out.println("Enter the Account Balance:");
		accountBalance=sc.nextInt();
	}
	public void getCustomerDetails() {
		System.out.println("The Customer Details are:");
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Account Type:"+accountType);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Account Balance:"+accountBalance);
		System.out.println("");
	}
	
}















