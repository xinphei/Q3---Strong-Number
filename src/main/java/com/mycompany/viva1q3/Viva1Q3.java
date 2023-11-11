package com.mycompany.viva1q3;

/**
 * Author: Heng Xin Phei
 * Lab: Occ9
 * Date: 9/11/2023
 * Objective: Viva 1-Q3: Write a program to determine if the number entered by the user is a Strong Number or not. A Strong Number is a number whose sum of the factorial of each digit is equal to the number itself. For example, 145 is a Strong Number because 1! + 4! + 5! = 1 + 24 + 120 = 145.
 */
//import Scanner class from java.util package
import java.util.Scanner;
//create public class Viva1Q3
public class Viva1Q3 {
    //create main() method 
    public static void main (String[] args){
        //create object(input) of Scanner
        Scanner input = new Scanner(System.in);
        //declare and initialise variables
        int sum=0;
        int digit;
        
        //header of system (objective of code)
        System.out.println("***Determining Strong Number***");
        //prompt user
        System.out.print("Please enter a number: ");  
        //read inputNum
        int num = input.nextInt();
        //num: constant variable to compare with sum
        final int INPUTNUM = num;
        
        //repetition: do-while
        do{
            //take a digit number(from right)
            digit=num%10;
            //make sure every digit factorial start with 1
            int fact=1;
            //factorial process
            for(int i=1; i<=digit; i++){
                fact*=i;
            }
            //sum
            sum+=fact;
            //take the remaining digit
            num/=10;
        }
        while(num>0); 
        
        //checking for strong number
        if(INPUTNUM==sum){
            System.out.println(INPUTNUM+" is a strong number.");
        }
        else{
            System.out.println(INPUTNUM+" is not a strong number.");
        }
    }  
}

