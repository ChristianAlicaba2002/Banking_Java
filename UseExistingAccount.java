/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;

  
public class UseExistingAccount extends Main{
      LocalDateTime currentDateTime = LocalDateTime.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/dd/y hh:mm a");
    public void UseExistingAccount(){
        boolean hehe = true;
        String DateTIme = currentDateTime.format(formatter);
        System.out.println("==========================================");
        System.out.println("\tUSE EXISTING ACCOUNT");
        System.out.println("Enter your AccountNumber: ");
        System.out.print("=> ");  
        int AccountNumber = scan.nextInt();
         
    if(Accounts.isEmpty()){
        System.out.println("==========================================");
        System.out.println("\n\tYOU DON'T HAVE ACCOUNT YET\n");
        System.out.println("==========================================");
    }else if(Accounts.containsKey(AccountNumber)){
            Account accounts = Accounts.get(AccountNumber);
             System.out.println("==========================================");
            System.out.println("\tUSE EXISTING ACCOUNT");
            System.out.println("\n\t  Hello!! "+accounts.getAccountName());
            
            do{
                try{    
            System.out.println("1.Deposit\n2.Withdraw\n3.Transfer\n4.return");
            System.out.print("=> ");
            int choice = scan.nextInt();
           scan.nextLine();
           
           switch(choice){
               case 1:
                   System.out.println("==========================================");
                   System.out.println("\t     DEPOSIT");
                   System.out.println("Enter your Amount ");
                   System.out.print("Php:");
                   int DepositAmount = scan.nextInt();
                   scan.nextLine();
                   if(DepositAmount < 1000){
                    System.out.println("==========================================");
                    System.out.println("\n\tWE ONLY ACCEPT PHP1000\n");
                    System.out.println("==========================================");
                   }else if(DepositAmount >= 1000){
                   accounts.deposit(DepositAmount);
                    System.out.println("==========================================");
                    System.out.println("\n\tDEPOSIT AMOUNT SUCCESSFULLY");
                    System.out.println("Account Name     : "+accounts.getAccountName());
                    System.out.println("Account Number   : "+accounts.getAccountNumber());
                    System.out.println("Age              : "+accounts.getAge());
                    System.out.println("Gender           : "+accounts.getGender());
                    System.out.println("Address          : "+accounts.getAddress());
                    System.out.println("Date&Time        : "+DateTIme);
                    System.out.println("Amount           : Php"+money.format(accounts.getbalance()));
                    System.out.println("Updated Balance  : Php"+money.format( accounts.getbalance()));
                    System.out.println("==========================================\n");
                    }else{
                       
                   }
                   break;
               case 2:
                   System.out.println("==========================================");
                   System.out.println("\t     WITHDRAW");
                   System.out.println("Enter your Amount ");
                   System.out.print("Php:");
                   int WithdrawAmount = scan.nextInt();
                   scan.nextLine();
                   if(accounts.getbalance() == 0){
                    System.out.println("==========================================");
                    System.out.println("\n\tYOU NEED DEPOSIT FIRST\n");
                    System.out.println("==========================================");
                   }else{
                   accounts.withdraw(WithdrawAmount);
                    System.out.println("==========================================");
                    System.out.println("\n\tWTIHDRAW AMOUNT SUCCESSFULLY");
                    System.out.println("Account Name     : "+accounts.getAccountName());
                    System.out.println("Account Number   : "+accounts.getAccountNumber());
                    System.out.println("Date&Time        : "+DateTIme);
                    System.out.println("Amount           : Php"+money.format(WithdrawAmount));
                    System.out.println("Updated Balance  : Php"+money.format( accounts.getbalance()));
                    System.out.println("==========================================\n");
                   }
                   break;
               case 3:
                   System.out.println("==========================================");
                   System.out.println("\t    TRANSFER FUNDS");
                   System.out.println("\nEnter Account Number to Transfer.");
                   System.out.print("=> ");
                   int TransferAccountNumber = scan.nextInt();
                   if(Accounts.containsKey(TransferAccountNumber)){
                       System.out.println("==========================================");
                       System.out.println("\tACCOUNT DETAILS\n");
                       System.out.println("Account Name        : "+accounts.getAccountName());
                       System.out.println("Current Balanced    : Php"+money.format(accounts.getbalance()));
                        System.out.println("==========================================");
                       System.out.println("Enter the Amount to Transfer this Account.");
                       System.out.print("Php:");
                       int TransferMoney = scan.nextInt();
                       System.out.println("==========================================");
                       System.out.println("\tTRANSFER AMOUNT SUCCESSFULLY\n");
                       System.out.println("Transfer Amount      : Php"+TransferMoney);
                       System.out.println("Account Name         : "+accounts.getAccountName());
                       System.out.println("Account Number       : "+accounts.getAccountNumber());
                       System.out.println("New Money Updates    : Php"+money.format(accounts.getbalance()));
                       
                   }else{
                       System.out.println("==========================================\n");
                       System.out.println("\tACCOUNT NOT FOUND.\n");
                   }
               case 4:
                    System.out.println("==========================================");
                   return;
               default:
                   System.out.println("\n==========================================");
                   System.out.println("\n\t  CHOOSE ONLY 1-3");
                   System.out.println("\n==========================================");
           }
                }catch(InputMismatchException e){
                    System.out.println("\n==========================================");
                    System.out.println("\n\tINVALID ,CHOOSE ONLY 1-3");
                    System.out.println("\n==========================================");
                    scan.nextLine();
                }
                
           }while(hehe);
   
        }else{
        System.out.println("\n==========================================");
        System.out.println("\n\tACCOUNT NOT FOUND\n");
        System.out.println("==========================================");
        }
        
    }
}
