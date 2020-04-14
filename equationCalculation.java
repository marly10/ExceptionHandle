/*
Ricky McKenzie
Lab4 - CSC 1054
*/

import java.io.*;
import java.util.*;

public class equationCalculation {

   public static void main(String[] args) {

      //string variable used for input
      String firstNum;
      String secondNum;
      String symbol;

      //variable used to parsed strings after the have been added.
      int total = 0;
      int firstNum1 = 1;
      int secondNum2 = 1;
      
      boolean data =  false;

      //loop used to keep used entering the right data
      while (!data) {
         //try begins here
         
         data = true;
         try {

            System.out.println("Please enter two numbers and one operator(/,*,-,+): ");
            Scanner keyboard = new Scanner(System.in);
            //get the strng values to parse
            firstNum = keyboard.next();
            secondNum = keyboard.next();

            //reads the symbol
            symbol = keyboard.next();
            
            //parses number 1 and 2
            firstNum1 = Integer.parseInt(firstNum);
            secondNum2 = Integer.parseInt(secondNum);
            
            switch(symbol){

            //else if statement for division
            case "/":
               System.out.println("The division of "+ firstNum1+" "+ secondNum2+ " is:");
               total = firstNum1 / secondNum2;
               System.out.println("result: " + Math.abs(total));      
               break;

               //else if statement for multiplication
            case "*":
               System.out.println("The multiplication of "+ firstNum1+" "+secondNum2+ " is:");
               total = firstNum1 * secondNum2;
               System.out.println("result: " + Math.abs(total));      
               break;

               //else if statement for subtraction
            case "-":
               System.out.println("The subtraction of "+ firstNum1+" "+secondNum2+ " is:");
               total = firstNum1 - secondNum2;
               System.out.println("result: " + Math.abs(total));      
               break;
               
               //else if statement for addition
               case "+":
               System.out.println("The addition of "+ firstNum1+" "+secondNum2+ " is:");
               total = firstNum1 + secondNum2;
               System.out.println("result: " + Math.abs(total));      
               break;
               
             //default the total of either operation tried
              default:
              System.out.println("Wrong operand entered ");
              data = false;
              break;
              
         } //try ends here
}//while loop ends here

         //catches the exceptions found and tells user where it broke/ Allows data to be reentered
         catch (InputMismatchException | NumberFormatException ex) {
            System.out.println("\nNice try...cannot convert input to integer\n");
            data =  false;
         } 
         
         catch (ArithmeticException e) {
            System.out.println("don’t divide by 0! ");
            data =  false;

         }
      }

   }
}