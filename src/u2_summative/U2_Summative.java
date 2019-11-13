/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */

package u2_summative;
import java.util.Scanner;
/**
 *
 * @author demar3553
 */
public class U2_Summative {
    
    public static void calculator(){
         
        boolean exit = false;
        
        Scanner kinput = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        String choiceIn;
        int numMarks;
        double[] marks;
        double sum = 0;
        double average;
        
        
        
        choiceIn = input.nextLine();
        
    switch (choiceIn) {
        case "1":
            System.out.println("~~~~~~~~~~~~~~~~~Mark Calculator~~~~~~~~~~~~~~~~~~~~");
            System.out.println("How many classes do you want to calculate?");
            numMarks = kinput.nextInt();
            
            marks = new double[numMarks];
            
            System.out.println("Enter your marks one at a time");
            System.out.println("Then click Enter");
            for(int i = 0; i < numMarks; i++) {
                marks[i] = kinput.nextDouble();
                sum += marks[i];
            }        
                average = sum/ numMarks;
                average = (int)(average*100);
                average /=100;
                
                System.out.println("Your average is: " + average);
               
                break;
            
            case "2":
                exit = true;
                break;
        }
    }


    public static void main(String[] args) {
        System.out.println("1. Calculate your marks");
        System.out.println("2. Exit");
        calculator();
        }
     }
    
    
    

