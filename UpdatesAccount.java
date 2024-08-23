/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author DELL
 */
public class UpdatesAccount extends Main{
    
    public void UpdatesAccount(){
        boolean loop = true;
        System.out.println("==========================================");
        System.out.println("\t   UPDATES ACCOUNT");
        System.out.println("Enter the Account Number to Updates the \n\t\tDetails");
        System.out.print("=> ");
        int AccountNumber = scan.nextInt();
        scan.nextLine();
        if(Accounts.isEmpty()){
            System.out.println("==========================================");
            System.out.println("\n\tNO ACCOUNT EXIST\n");
            System.out.println("==========================================");
        }else if(!Accounts.containsKey(AccountNumber)){
            System.out.println("==========================================");
            System.out.println("\n\tACCOUNT NOT FOUND\n");
            System.out.println("==========================================");
        }else if(Accounts.containsKey(AccountNumber)){
            Account account = Accounts.get(AccountNumber);
         
        do{ 
            System.out.println("==========================================");
            System.out.println("\t  CHOOSE ONLY 1-6");
            System.out.println("The Account Number "+account.getAccountNumber()+ " is Temporary");
            System.out.println("you cannot Update due under maintenance\n");
            System.out.println("1.Account Name    : "+account.getAccountName());
            System.out.println("2.Age             : "+account.getAge());
            System.out.println("3.Gender          : "+account.getGender());
            System.out.println("4.Address         : "+account.getAddress());
            System.out.println("5.Updates All");
            System.out.println("6.Return");
            System.out.print("=> ");
            int choice = scan.nextInt();
            scan.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter new Account Name: ");
                 System.out.print("=> ");
                String NewAccountName = scan.nextLine();
                account.setAccountName(NewAccountName);
                System.out.println("==========================================");
                System.out.println("\n    NEW SET ACCOUNTNAME SUCCESSFULLY\n");
                break;
            case 2:
                System.out.println("Enter New Age: ");
                 System.out.print("=> ");
                int NewAge = scan.nextInt();
                account.setAge(NewAge);
                System.out.println("==========================================");
                System.out.println("\n\tNEW SET AGE SUCCESSFULLY\n");
               
                break;
            case 3:
                System.out.println("Enter new Gender: ");
                 System.out.print("=> ");
                String NewGender = scan.nextLine();
                account.setGender(NewGender);
                System.out.println("==========================================");
                System.out.println("\n\tNEW SET GENDER SUCCESSFULLY\n");
              
                break;
            case 4:
                System.out.println("Enter new Address: ");
                System.out.print("=> ");
                String NewAddress = scan.nextLine();
                account.setAddress(NewAddress);
                System.out.println("==========================================");
                System.out.println("\n\tNEW SET ADDRESS SUCCESSFULLY\n");
               
                break;
            case 5:
                System.out.println("Enter new AccountName: ");
                System.out.print("=> ");
                String newAccountName = scan.nextLine();
                account.setAccountName(newAccountName);
                System.out.println("Enter new Age: ");
                System.out.print("=> ");
                int newAge = scan.nextInt();
                scan.nextLine();
                account.setAge(newAge);
                System.out.println("Enter new Gender: ");
                System.out.print("=> ");
                String newGender = scan.nextLine();
                account.setGender(newGender);
                System.out.println("Enter new Address: ");
                System.out.print("=> ");
                String newAddress = scan.nextLine();
                account.setAddress(newAddress);
                System.out.println("==========================================");
                System.out.println("\n    SET ALL UPDATES ACCOUNT SUCCESSFULLY\n");
               
                break;
            case 6:
                System.out.println("==========================================");
                return;
            default:
                    System.out.println("==========================================");
                    System.out.println("\nCHOOSE ONLY 1-6\n");;
                    System.out.println("==========================================");
            }
          }while(loop);
        }
       
    }
}
