package ExceptionProblems;
import java.util.Scanner;
class InvalidAmountException extends Exception {
    InvalidAmountException(String str) {
        super(str);
    }
}
class InsufficientAmountException extends Exception {
    InsufficientAmountException(String str2) {
        super(str2);
    }
}

public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        InvalidAmountException amountException = new InvalidAmountException("Invalid amount ");
        InsufficientAmountException amountException2 = new InsufficientAmountException("Insufficient balance");
        int limit, i, choice;
        System.out.println("Enter the number of customers you want to enter");
        limit = sc.nextInt();
        Customer[] customer = new Customer[limit];
        for (i = 0; i < limit; i++) {
            customer[i] = new Customer();
            customer[i].setCustomerDetails();
        }
        for (i = 0; i < limit; i++) {
            customer[i].printDetails();
        }
        do {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Display account details");
            System.out.println("2. Search by account number");
            System.out.println("3. Deposit amount");
            System.out.println("4. Withdraw amount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (i = 0; i < limit; i++) {
                        customer[i].printDetails();
                    }
                    break;
                case 2:
                    int searchAccNo;
                    System.out.println("Enter the account number you want to search");
                    searchAccNo = sc.nextInt();
                    j = 0;
                    for (i = 0; i < limit; i++) {
                        if (customer[i].acc_no == searchAccNo) {
                            customer[i].printDetails();
                            j++;
                        }
                    }
                    if (j == 0) {
                        System.out.println("Account not found!!");
                    }
                    break;
                case 3:
                    System.out.println("Enter the account number you want to deposit amount");
                    searchAccNo = sc.nextInt();
                    try {
                        System.out.println("Enter the amount to deposit");
                        int depositAmount = sc.nextInt();
                        if (depositAmount <= 0) {
                            throw amountException;
                        } else {
                            j = 0;
                            for (i = 0; i < limit; i++) {
                                if (customer[i].acc_no == searchAccNo) {
                                    customer[i].balance = customer[i].balance + depositAmount;
                                    customer[i].printDetails();
                                    j++;
                                }
                            }
                            if (j == 0) {
                                System.out.println("Account not found!!");
                            }
                        }
                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Enter the account number you want to withdraw amount");
                    searchAccNo = sc.nextInt();
                    try {
                        System.out.println("Enter the amount to withdraw");
                        int withdrawAmount = sc.nextInt();
                        if (withdrawAmount <= 0) {
                            throw amountException;
                        } else {
                            j = 0;
                            for (i = 0; i < limit; i++) {
                                if (customer[i].acc_no == searchAccNo) {
                                    j++;
                                    if (withdrawAmount > customer[i].balance) {
                                        throw amountException2;
                                    } else {
                                        customer[i].balance = customer[i].balance - withdrawAmount;
                                        customer[i].printDetails();
                                    }
                                }
                            }
                            if (j == 0) {
                                System.out.println("Account not found!!");
                            }
                        }
                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    } catch (InsufficientAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}

class Customer {
    Scanner sc = new Scanner(System.in);
    int acc_no, balance;
    String name, accountType;

    // Constructor to initialize customer details
    public Customer() {
        this.name = "";
        this.acc_no = 0;
        this.accountType = "";
        this.balance = 0;
    }

    public void setCustomerDetails() {
        System.out.println("Enter the name=");
        name = sc.next();
        System.out.println("Enter the account number=");
        acc_no = sc.nextInt();
        System.out.println("Enter the account type=");
        accountType = sc.next();
        System.out.println("Enter the balance=");
        balance = sc.nextInt();
    }

    public void printDetails() {
        System.out.println("________________________________");
        System.out.println("CUSTOMER DETAILS:");
        System.out.println("Customer Name=" + name);
        System.out.println("Account Balance=" + balance);
        System.out.println("Accountnumber=" + acc_no);
        System.out.println("Accounttype=" + accountType);
        System.out.println("________________________________");
    }
}

