package org.example;
public class BankAccount {
    public String username;
    public String password;
    public int accountNumber;
    public int balance ;

    public void inputs(String username,String password , int accountNumber){
        this.username = username;
        this.password = password;
        this.accountNumber = accountNumber;
    }
}
