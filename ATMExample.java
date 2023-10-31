//import required classes and packages
import java.util.Scanner;
//create ATM Example class to implement the ATM functionality
public class ATMExample {
    //main method starts
    public static void main(String... args){
        //declare and initialize balance, withdraw, and deposit
        int balance = 100000, withdraw, deposit;
        //create scanner class object to get choice of user
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.print("Choose the operation you want to perform: ");

            //get choice from user
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn: ");

                    //get the withdrawal money from user
                    withdraw = scanner.nextInt();

                    //check whether the balance is greater than or equal to the withdrawal amount
                    if (balance >= withdraw) {
                        //removes the withdrawal amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        //show custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println(" ");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited: ");

                    //get deposit amount from user
                    deposit = scanner.nextInt();
                    //add the deposit amount to the total balance
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println(" ");
                    break;

                case 3:
                    //displaying the total balance of the user
                    System.out.println("Balance : " + balance);
                    System.out.println(" ");
                    break;

                case 4:
                    //exit from the menu
                    System.exit(0);
            }
        }
    }
}
