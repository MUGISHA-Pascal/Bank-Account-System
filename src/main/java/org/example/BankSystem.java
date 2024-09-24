package org.example;
import java.util.*;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    }
}