/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InputsLab;
import java.util.Scanner;
/**
 *
 * @author EDFlo
 */
public class AverageOfValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double TOTAL_NUM_VALUES = 5;
        
        System.out.print("enter 1st number: ");
        double num1 = input.nextDouble();
        
        System.out.print("enter 2st number: ");
        double num2 = input.nextDouble();
        
        System.out.print("enter 3rd number: ");
        double num3 = input.nextDouble();
        
        System.out.print("enter 4th number: ");
        double num4 = input.nextDouble();
        
        System.out.print("enter 5th number: ");
        double num5 = input.nextDouble();
        
         double sum = num1 + num2+ num3 + num4 + num5;
        double avg = sum / TOTAL_NUM_VALUES;
        
        System.out.println("The sum of the five numbers is: " + sum);
        System.out.println("The average of the five numbers is: " + avg);
        
        
        
        
        
    }
    
}
