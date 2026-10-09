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
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        System.out.print("Enter Purchase Price: ");
        double PPrice = input.nextDouble();
        
        System.out.print("Enter State Tax %: ");
        double STax = input.nextDouble();
        
        System.out.print("Enter County Tax: ");
        double CTax = input.nextDouble();
        
        double STaxA = (STax / 100.0) * PPrice;
        double CTaxA = (CTax / 100.0)* PPrice;
        double TTaxO = STaxA + CTaxA;
        
        System.out.print("Purchase Price: $" + PPrice);
        System.out.print(" State Tax %:" + STax + "%");
        System.out.print(" State Tax Amount: $" + STaxA );
        System.out.print(" County Tax %:" + CTax + "%" );
        System.out.print(" County Tax Amount: $" + CTaxA);
        System.out.print(" Total Tax Owed: $" + TTaxO);
        
        
        
    }
    
}
