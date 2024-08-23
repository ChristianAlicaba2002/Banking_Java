/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    static HashMap<Integer,Account> Accounts = new HashMap<>();
    static Random RandomNumber = new Random();
    static Scanner scan = new Scanner(System.in);
    static DecimalFormat money = new DecimalFormat("###,###,###");
    
    public static void main(String[] args) {
        boolean he = true;
        System.out.println("\tWELCOMED TO MY BANK..");
        do{
            try{
            System.out.println("\n\tChoose Category..");
            System.out.println("1.Create Account\n2.Use Existing Accounts\n3.Display Accounts\n4.VIP Accounts\n5.Delete Accounts\n6.Updates Accounts\n7.Exit");
            System.out.print("=> ");
            int choice = scan.nextInt();
        switch(choice){
            case 1:
                  CreateAccount CA = new CreateAccount();
                  CA.CreateAccount();
                break;
            case 2:
                    UseExistingAccount UEA = new UseExistingAccount();
                    UEA.UseExistingAccount();
                break;
            case 3:
                    DisplayAccounts DA = new DisplayAccounts();
                    DA.DisplayAccounts();
                break;
            case 4:
                    VIPAccount VIP = new VIPAccount();
                        VIP.VIPAccount();
                break;
            case 5:
                    DeleteAccount(scan);
                break;
            case 6:
                UpdatesAccount UD = new UpdatesAccount();
                UD.UpdatesAccount();
                break;
            case 7:
                System.out.println("==========================================");
                System.out.println("\n\t  END OF PROGRAMED..");
                System.out.println("   BY: CHRISTIAN DAVE L. ALICABA");
                System.out.println("\n==========================================");
                System.exit(0);
            default:
                 System.out.println("==========================================");
                 System.out.println("\nINVALID CHOICES , CHOOSE ONLY 1 - 6\n");
                 System.out.println("==========================================");
        }
        }catch(Exception e){
            System.out.println("==========================================");
            System.out.println("\n\t   INPUT CAREFULLY");
            System.out.println("\n==========================================");
            scan.nextLine();
        }
       
        }while(he);
    }
    public static void DeleteAccount(Scanner scan){
         System.out.println("==========================================");
        System.out.println("\nEnter your AccountNumber: ");
         System.out.print("=> ");
        int AccountNumber = scan.nextInt();
        scan.nextLine();
    if(Accounts.isEmpty()){
        System.out.println("==========================================");
        System.out.println("\n\tNO ACCOUNTS EXIST\n");
        System.out.println("==========================================");
    }else if(!Accounts.containsKey(AccountNumber)){
        System.out.println("==========================================");
        System.out.println("\n\tINVALID ACCOUNT NUMBER\n");
        System.out.println("==========================================");
    }else if(Accounts.containsKey(AccountNumber)){
          Account accounts = Accounts.get(AccountNumber);
          if(accounts.getbalance() != 0){
               System.out.println("==========================================");
              System.out.println("\n\tYOU NEED TO GET ZERO BALANCE");
              System.out.println("\t   BECAUSE YOUR BALANCE IS\n");
              System.out.println("Balance: Php"+money.format(accounts.getbalance()));
               System.out.println("==========================================");      
    }else {
            Accounts.remove(AccountNumber);
            System.out.println("==========================================");
            System.out.println("\n\tYOUR ACCOUNT IS DELETE\n");
            System.out.println("==========================================");
    
        }
    }
    
    }
    
}
