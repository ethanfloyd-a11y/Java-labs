/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repetitionlabs;
import java.util.Scanner;
/**
 *
 * @author EDFlo
 */
public class RepeatingPhrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = "";
        System.out.print("Enter anything, if 0 is entered program stops: ");
        user = input.nextLine();
        
        
        while(!user.equals("0"))
        {
         System.out.println("You entered: " + user);
         System.out.print("Enter anything, if 0 is entered program stops: ");
         user = input.nextLine();
        }
        
    }
    
}
