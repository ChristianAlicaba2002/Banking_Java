
package main;

import java.text.DecimalFormat;

public class Account {
   DecimalFormat money = new DecimalFormat("###,###,###");
    private String AccountName;
    private String Gender;
    private String Address;
    private int Age;
    private int AccountNumber;
    private double balance;
    
           
    public Account(String AccountName,int Age,String Gender,String Address,int AccountNumber,double balance){
        this.AccountName = AccountName;
        this.Age = Age;
        this.AccountNumber = AccountNumber;
        this.Gender = Gender;
        this.Address = Address;
        this.balance = balance;
        
    }
       /**
     * @return the AccountName
     */
    public String getAccountName() {
        return AccountName;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @return the AccountNumber
     */
    public int getAccountNumber() {
        return AccountNumber;
    }

    /**
     * @return the balance
     */
    public double getbalance() {
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdraw(double amount){
        if(getbalance() >= amount){
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){    
        return 
                "Account Name    : "+AccountName+
                "\nAge             : "+Age+
                "\nGender          : "+Gender+
                "\nAddress         : "+Address+
                "\nAccount Number  : "+AccountNumber+
                "\nCurrent Balance : Php"+money.format(balance);
    }
     public String bestString(){    
        return 
                "Account Name     : "+AccountName+
                "\nAge              : "+Age+
                "\nGender           : "+Gender+
                "\nAddress          : "+Address+
                "\nAccount Number   : "+AccountNumber+
                "\nCurrent Balance  : Php"+money.format(balance);
    }
     public String transferFunds(){
         return "Account Name      : "+AccountName+
                "\nAge             : "+Age+
                "\nGender          : "+Gender+
                "\nAddress         : "+Address+
                "\nAccount Number  : "+AccountNumber+
                "\nCurrent Balance : Php"+money.format(balance);
     }

    /**
     * @param AccountName the AccountName to set
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @param AccountNumber the AccountNumber to set
     */
    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

 
}
