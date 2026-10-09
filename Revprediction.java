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
public class Revprediction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter total Revenue: ");
        double TRev = input.nextDouble();
        
        System.out.print("Enter online retail perecnt: ");
        double OPerRev = input.nextDouble();
        
        double ORev = TRev * (OPerRev / 100.0);
        
        System.out.print( "Amazon's Total Revenue: $" + TRev + "M" );
        System.out.print( "Online Retail % of Total Revenue:" + OPerRev + "%" );
        System.out.print("Online Retail's Revenue: $" + ORev + "M");
        
       
    }
    
}
