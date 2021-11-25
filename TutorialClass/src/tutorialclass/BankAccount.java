/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialclass;

/**
 *
 * @author student
 */
abstract public class BankAccount {
    protected int accountNumber;
    protected String CustomerName;
    protected double balance;
    
    void BankAccount(int account, String name){
        System.out.println("Your Account Number is "+account+" Under the name of "+name);
    }
    
    double InitialDeposit(){
        double Amount = 20.0;
        
        return Amount;
    }
    double ComputeInterest(double Interest){
        return Interest;
    }
    double Withdraw(double WithDrawValue){
        return WithDrawValue;
    }
    void Deposit(double DepositValue){
        System.out.println("You have deposited "+ DepositValue+" to the account.");
    }
    void Balance(double Amount){
        System.out.println("You have a balance of: "+Amount);
    }

}
