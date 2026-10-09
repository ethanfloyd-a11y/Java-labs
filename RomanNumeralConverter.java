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
public class RomanNumeralConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 10: ");
        int num = input.nextInt();
        
        if (num < 1)
        {
            System.out.print("Your number can not be converted");
        }
        
        if (num == 1) 
        {
            System.out.print("You entered: " + num + "\n" + "The Roman Numeral Equivalent is: I ");
        }
        else if (num == 2) 
        {
            System.out.print("You entered: " + num + "\n" + "The Roman Numeral Equivalent is: II ");
        }
        else if (num == 3) 
        {
            System.out.print("You entered: " + num + "\n" + "The Roman Numeral Equivalent is: III ");
        }
        else if (num == 4) 
        {
            System.out.print("You entered:" + num + "\n" + "The Roman Numeral Equivalent is: IV ");
        }
        else if (num == 5) 
        {
            System.out.print("You entered:" + num + "\n" + "The Roman Numeral Equivalent is: V ");
        }
        else if (num == 6) 
        {
            System.out.print("You entered:" + num + "\n" + "The Roman Numeral Equivalent is: VI ");
        }
        else if (num == 7) 
        {
            System.out.print("You entered:" + num + "\n" + "The Roman Numeral Equivalent is: VII ");
        }
        else if (num == 8) 
        {
            System.out.print("You entered:" + num + "\n" + "The Roman Numeral Equivalent is: VIII ");
        }
        else if (num == 9) 
        {
            System.out.print("You entered:" + num + "\n" + "The Roman Numeral Equivalent is: IX ");
        }
        else if (num == 10) 
        {
            System.out.print("You entered:" + num + "\n" + "The Roman Numeral Equivalent is: X ");
        }
        else
        {
            System.out.print(num + " Cant be converted");
        }








    }
    
    
}
