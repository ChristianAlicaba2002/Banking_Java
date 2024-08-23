/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Map;

/**
 *
 * @author DELL
 */
public class DisplayAccounts extends Main {
    public void DisplayAccounts(){
         System.out.println("==========================================");
        System.out.println("\n\tALL lIST ACCOUNTS: "+Accounts.size()+"\n");
         System.out.println("==========================================");
        for(Map.Entry<Integer,Account> Display: Accounts.entrySet()){
            Account accounts = Display.getValue();
            System.out.println(accounts.toString());
             System.out.println("==========================================");
        }
    }
}
