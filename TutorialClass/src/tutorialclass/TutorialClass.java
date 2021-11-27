/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialclass;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yazak
 */
public class TutorialClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean run = true;
        //creating a customer
        BankAccount Person1 = new BankAccount() {};
        
        //getting all the valid data 
        {
            //getting account number from the customer
            while(run){
                try{
                    //entering account value
                    System.out.println("Enter your Accout Number: \n");
                
                    //reading accout value
                    Scanner obj1 = new Scanner(System.in);
                    Person1.accountNumber = obj1.nextInt();
                    break;
                    //checking if the user have inputted the correct value
                } catch(InputMismatchException e){
                    System.out.println("Please enter your account number! (integer values only)\n");
                }
                }
            
            //getting customer name 
            while(run){
                try{
                    //entering customer name
                    System.out.println("Enter your Name: \n");
                
                    //getting the name
                    Scanner obj1 = new Scanner(System.in);
                    Person1.CustomerName = obj1.nextLine();
                    break;
                
                    //checking if the user have inputted the name only
                } catch(InputMismatchException e){
                    System.out.println("Please enter your name! (text only)\n");
                }
                }
            
            
            //getting customer account balance 
            while(run){
                try{
                    //entering balance
                    System.out.println("Enter Balance: \n");
                
                    //getting balance
                    Scanner obj1 = new Scanner(System.in);
                    Person1.balance = obj1.nextDouble();
                    
                    if(Person1.balance < Person1.InitialDeposit()){
                        System.out.println("You cant enter a value less than the Initial deposit account");
                    
                    }
                    else{
                        Person1.Deposit(Person1.balance);
                        run = false;
                    }

                
                    //checking if the user have inputted the balance only
                } catch(InputMismatchException e){
                    System.out.println("Please enter your account balance! (decimal or integer only)\n");
                }
                }
        
        }
        
        
        //The collected data struct
        
            String CustomerName = Person1.CustomerName;
            int AccountNumber = Person1.accountNumber;
            double Balance = Person1.balance;
        
        //actual program
        int choice;
        
        System.out.println("\nChoose");
        System.out.println("\nCheck balance (1)");
        System.out.println("\nWithdraw (2)");
        System.out.println("\nDeposit (3)");
        System.out.println("\nInterst (4)");
        System.out.println("\nInitial Deposit (5)");
        
        Scanner obj2 = new Scanner(System.in);
        
        choice = obj2.nextInt();
        switch (choice) {
            case 1:
                Person1.Balance(Balance);
                break;
            case 2:
                Person1.Withdraw(0.0);
                break;
            case 3:
                Person1.Deposit(0.0);
                break;
            case 4:
                Person1.ComputeInterest(0.0);
                
            case 5:
                double Amount = Person1.InitialDeposit();
                System.out.println("Intial deposit amount is: "+Amount+"\nMake sure you dont keep your balance less than this");
            default:
                System.out.println("Choose an a number to proceed");
                break;
        }
       
        
        
        
        
        
        
    }
    
}
