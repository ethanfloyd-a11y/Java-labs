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
public class AnnualPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter pay amount: ");
        double PayAmt = input.nextDouble(); 
        
        System.out.print("Enter number of pay periods: ");
        double PayPeriod = input.nextDouble();
        
        double annualPay = PayAmt * PayPeriod;
        
        System.out.println(
                "==================================\n"+
                "Employee's Annual Paystub\n"+
                "==================================\n"+
                "Amount Earned per Pay Peroids: $" + PayAmt +"\n"+
                "Total Number of Pay Peroids: " + PayPeriod +"\n"+ 
                "Employee's Annual Pay: $" + annualPay + "\n"+
                "=================================="
        );
       
        
       
    }
    
}
