package org.example;
import java.util.*;
import org.example.classes.BankAccount;

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
                          System.out.println("--------------------------");
                          System.out.println("welcome to your bank account ");
                          System.out.println("------------------------");

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