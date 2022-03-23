/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.joanamunyelet;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class coursework1 {
    public static void main(String[]args){
        System.out.println("Welcome to XYZ bank");
        System.out.println("Choose from the following accounts");
        System.out.println("1.Regular account");
        System.out.println("2.Interest account");       
         System.out.println("3.Checking account");
         System.out.println("4.CD account");
        System.out.println("PINs are: 1   2   3  4");
         Scanner scn=new Scanner(System.in);
         System.out.println("ENTER THE PIN");
         int PIN=scn.nextInt();
         if (PIN==1){
             System.out.println("1.Regular account");
             System.out.println("charges of 10% of the balance at the end of the month\n no interest\n penalty of 10.00 when the balance goes below 50,000.00");
         }
         else if (PIN==2){
             System.out.println("2.Interest account");
             System.out.println("charges of 10%of the balance at the end of the month\ninterest of 7%paid monthly\n no minimum balance");
         }
         else if (PIN==3){
                 System.out.println("3.Checking account");
                 System.out.println("charges of 10% of the balance at the end of the month\n annual interest of 7%paid per month\n penalty of 10.00 if balance falls below 10000.00\n charge of 0.10 for each transaction");
                 }
                 else if (PIN==4){
               System.out.println("4.CD account");
               System.out.println("charges of 10% of the balance at the end of the month\nannual interest of 15%\n no minimun balance\n penalty of 20%of current balance if you withdraw before 12months");
           }
           else{
               System.out.println("WRONG PIN");
               main(null);
              
                       
             
                       
              
                       }  
             }      
             }
        }
    }
    
}
Thank you
Go ahead and upload
