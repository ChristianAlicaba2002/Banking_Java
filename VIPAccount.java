/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Map;



public class VIPAccount extends Main {
    
    public void VIPAccount(){
        System.out.println("==========================================");
        System.out.println("\n\t  VIP ACCOUNTS: "+Accounts.size()+"\n");
        System.out.println("==========================================");
        for(Map.Entry<Integer,Account> Best : Accounts.entrySet()){
            Account account = Best.getValue();
        
        if(account.getbalance() >= 1000000){
                System.out.println("Category         : DIAMOND");
                System.out.println(account.bestString());
                System.out.println("==========================================");
        }else if(account.getbalance() >= 500000){
                System.out.println("Category         : GOLD");
                System.out.println(account.bestString());
                System.out.println("==========================================");                
            }else if(account.getbalance() >= 200000){             
                System.out.println("Category         : SILVER");
                System.out.println(account.bestString());
                System.out.println("==========================================");              
            }else{
                
                System.out.println("Category         : BRONZE");
                System.out.println(account.bestString());
                System.out.println("==========================================");
            }
        
        }
        
    }
}
