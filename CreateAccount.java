/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author DELL
 */
public class CreateAccount extends Main{
    public void CreateAccount(){
        scan.nextLine();
        int AccountNumber = RandomNumber.nextInt(111111,999999);
        System.out.println("==========================================");
        System.out.println("\t   CREATE ACCOUNT");
        System.out.println("\nEnter your AccountName: ");
        System.out.print("=> ");
        String AccountName = scan.nextLine();
        System.out.println("Enter your Age: ");
        System.out.print("=> ");
        int Age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your Gender: ");
        System.out.print("=> ");
        String Gender = scan.nextLine();
        System.out.println("Enter your Address: ");
        System.out.print("=> ");
        String Address = scan.nextLine();
         
         
        double balance = 0;
        Account accounts = new Account(  AccountName, Age, Gender, Address, AccountNumber, balance);
        Accounts.put(AccountNumber, accounts);
        System.out.println("==========================================");
        System.out.println("\tCREATE ACCOUNT SUCCESSFULLY");
        System.out.println("\nAccount Name    : "+AccountName);
        System.out.println("Age             : "+Age);
        System.out.println("Gender          : "+Gender);
        System.out.println("Address         : "+Address);
        System.out.println("Account Number  : "+AccountNumber);
        System.out.println("Balanced        : Php"+money.format(balance));
        System.out.println("==========================================");
    
    }
}
