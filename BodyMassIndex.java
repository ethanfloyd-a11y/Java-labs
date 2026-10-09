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
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your height in Inches: ");
        double height = input.nextDouble();
        
        System.out.print("Enter your Weight in lbs: ");
        double weight = input.nextDouble();
        
        double BMI = (weight * 703)/(height * height);
        
        if (BMI < 18.5)
        {
            System.out.print(BMI + " is underweight for your height.");
        }
        else if (BMI > 25)
        {
            System.out.print(BMI + " is overweight for your height.");
        }
        else
        {
            System.out.print( BMI + " is optimal for your height.");
        }
    }
    
}
