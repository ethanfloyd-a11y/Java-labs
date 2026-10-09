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
public class RestBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Enter Meal cost: ");
        double Bill = input.nextDouble();
        
        System.out.print(" Enter Tax amount: ");
        double Taxper = input.nextDouble();
        
        System.out.print(" Enter Tip amount: ");
        double Tipper = input.nextDouble();
        
        double TaxAmt = (Taxper / 100.0) * Bill;
        double TipAmt = (Tipper / 100.0) * ( TaxAmt + Bill);
        double TotalBill = TipAmt + TaxAmt + Bill;
        
        System.out.println(
                "================================\n"+ 
                "Meal Receipt\n" +
                "================================\n"+
                "Meal Cost: $"+ Bill + "\n"+
                "Tax Amount: $"+ TaxAmt + "\n"+
                "Tip Amount: $"+ TipAmt + "\n"+
                "Total Bill: $"+ TotalBill+ "\n"+
                "=================================" 
        );
        
    }
    
}
