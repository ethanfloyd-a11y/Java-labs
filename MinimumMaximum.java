/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SelectionLab;
import java.util.Scanner;
/**
 *
 * @author EDFlo
 */
public class MinimumMaximum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter your second number: ");
        double num2 = input.nextDouble();
        
        if(num1 > num2)
        {
            System.out.print( num1 + " is larger than " + num2);
            
        }
        else
        {
            System.out.print( num2 + " is larger than " + num1);
        }
    }
    
}
