package com.CalculatorApp;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CalApp {
    public static void main(String args[]){
        // Create a Object to Scanner class to take inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Running Basic Console Calculator using Java");
        System.out.println("1.Enter 'Yes' to do another Operation ");
        System.out.println("2.Enter 'Exit' to stop the Calculator");
        System.out.println();
        while(true){
            try{
                System.out.print("Enter your first number: ");
                long num1 = sc.nextLong();
                System.out.print("Enter your Operator (+, -, *, /): ");
                String op = sc.next();
                System.out.print("Enter your second number: ");
                long num2 = sc.nextLong();
                if(op.equals("/") && num2==0){
                    System.out.println("Divident Cannot be 0.Please Re-Enter Valid Values");
                    continue;
                }
                else{

                    switch (op){
                        case "+" :
                            print(add(num1,num2));
                            break;
                        case "-" :
                            print(sub(num1,num2));
                            break;
                        case "*" :
                            print(mult(num1,num2));
                            break;
                        case "/" :
                            print(div(num1,num2));
                            break;
                        default:
                            System.out.println("Please Enter Valid Operator (+, -, *, /).");
                            break;
                    }
                }

            }
            catch (InputMismatchException ex){
                System.out.println("Please Enter valid values");
            }
            catch(Exception ex){
                System.out.println(ex);
            }
            System.out.print("Want to do one more calculation,So Enter Yes Or Exit to stop it: ");
            String next = sc.next();
            while(true){

                if(!next.toLowerCase().equals("yes") && !next.toLowerCase().equals("exit")){
                    System.out.print("Please Re-Enter Yes or Exit Whether to Continue or Stop Calculations!: ");
                    next = sc.next();
                }
                else{
                    break;
                }
            }
            if(next.toLowerCase().equals("exit")){
                break;
            }
        }
        System.out.println("Calculator has Stopped..!");
    }
    public static void print(long ans){
        System.out.println("Your Result : "+ans);
    }
    public static long add(long a, long b){
        return a + b;
    }
    public static long sub(long a, long b){
        return a - b;
    }
    public static long mult(long a, long b){
        return a * b;
    }
    public static long div(long a, long b){
        return a / b;
    }

}
