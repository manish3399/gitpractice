
// Q3: write a code for ATM : 

//  it will give you welcome Screen : Welcome to XYZ Bank ATM

//  Please enter your pin , keep pin as 3333: 
//  if user enters correct PIN then give options:
//  1 cash withdrawal, 2-balance check 3-deposit 4- exit from menu
 
//     if user enters 1- 
//      please enter amount (it should be multiple of 100)
// 	    if it is not multiple of 100 then error please enter valid amount 
// 		If amount is correct : Please collect your cash

//     if user enters 2-  display the current balance
//     if user enters 3- ask amount to enter and add it to total balance
// 	if user enters 4- EXIT

import java.util.Scanner;

class Atm {

    static void ATM(){
        System.out.println("Welcome to XYZ Bank ATM");
        System.out.println(" Please enter your pin");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        int balance = 1000;
        if(pin == 3333){
            System.out.println("Please select an option");
            System.out.println("1. Cash withdrawal");
            System.out.println("2. balance check");
            System.out.println("3-deposit");
            System.out.println("4- exit from menu");
            int option = sc.nextInt();
            if (option == 1) {
                System.out.print("Please enter amount (multiple of 100): ");
                int amount = sc.nextInt();

                if (amount % 100 == 0) {
                        System.out.println("Please collect your cash.");
                        if (amount <= balance) {
                            balance -= amount;
                            System.out.println("Please collect your cash.");
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                    }
                    else {
                        System.out.println("Amount must be a multiple of 100.");
                    }
                } 
             else if (option == 2) {
                System.out.println("Your current balance is: " + balance);
            } else if (option == 3) {
                System.out.print("Please enter amount to deposit: ");
                int amount = sc.nextInt();
                balance += amount;
                System.out.println("Amount deposited successfully.");
            } else if (option == 4) {
                System.out.println("Thank you for using our ATM. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        else{
        System.out.println("Incorrect pin. Please try again.");
    }
} 

    public static void main(String[] args) {
       
    }
}