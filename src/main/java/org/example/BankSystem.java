package org.example;
import java.util.*;
import org.example.BankAccount;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account=new BankAccount();
        ArrayList<BankAccount> accounts=new ArrayList<>();
        boolean booleanChecker = true ;
        while(booleanChecker) {
            System.out.println("welcome to the Bank account system");
            System.out.println("----------------------------------------");
            System.out.println("options available");
            System.out.println("1. create account");
            System.out.println("2. login into the account");
            System.out.println("3. exit");
            System.out.println("----------------------------------------");
            System.out.println("enter the choice(number) : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println(" * Enter the account details * ");
                    System.out.println("Enter the username : ");
                    String username = scanner.nextLine();
                    System.out.println("Enter the password : ");
                    String password = scanner.nextLine();
                    System.out.println("Enter the account number : ");
                    int accountNumber1 = scanner.nextInt();
                    scanner.nextLine();
                    account.inputs(username,password,accountNumber1);
                    accounts.add(account);
                    break;
                case 2:
                       System.out.println("* login *");
                       System.out.println("Enter the account number :");
                       int accountNumber2 = scanner.nextInt();
                       scanner.nextLine();
                       for (BankAccount Account : accounts ){
                           if(Account.accountNumber == accountNumber2){
                          System.out.println("** you are logged in **");
                          boolean booleanChecker2= true;
                          while(booleanChecker2) {
                              System.out.println("--------------------------");
                              System.out.println("welcome to your bank account ");
                              System.out.println("------------------------");
                              System.out.println("options available");
                              System.out.println("1. withdraw");
                              System.out.println("2. deposit");
                              System.out.println("3. check balance");
                              System.out.println("4. exit");
                              System.out.println("------------------------");
                              System.out.println("enter your choice(number) :");
                              int Choice = scanner.nextInt();
                              scanner.nextLine();
                              switch (Choice) {
                                  case 1:
                                      System.out.println("Enter the amount of money to withdraw : ");
                                      int incomeWithdraw = scanner.nextInt();
                                      scanner.nextLine();
                                      System.out.println("Enter the account number to verify : ");
                                      int accountNumber4 = scanner.nextInt();
                                      scanner.nextLine();
                                      for(BankAccount account1 : accounts){
                                          if(account1.accountNumber == accountNumber4){
                                              account1.balance = account1.balance - incomeWithdraw;
                                          }
                                      }
                                      break;
                                  case 2:
                                      System.out.println("Enter the amount of money to deposit : ");
                                      int incomeDeposit = scanner.nextInt();
                                      scanner.nextLine();
                                      System.out.println("Enter the account number to verify : ");
                                      int accountNumber3 = scanner.nextInt();
                                      scanner.nextLine();
                                      for(BankAccount account1 : accounts){
                                          if(account1.accountNumber == accountNumber3){
                                              account1.balance = account1.balance + incomeDeposit;
                                          }
                                      }
                                      break;
                                  case 3:
                                      System.out.println("Enter the account number to verify : ");
                                      int accountNumber5 = scanner.nextInt();
                                      scanner.nextLine();
                                      for(BankAccount account1 : accounts){
                                          if(account1.accountNumber == accountNumber5){
                                              System.out.println("your balance : ");
                                              System.out.println(account1.balance);
                                          }
                                      }
                                      break;
                                  case 4:
                                      booleanChecker2 = false;
                                      break;
                                  default:
                                      System.out.println("unknown choice");
                                      break;
                              }
                          }
                           }else{
                               System.out.println("? don't have an account ?");
                           }
                       }
                    break;
                case 3:
                    booleanChecker =false;
                    break;
                default:
                    break;
            }
        }
    }
}