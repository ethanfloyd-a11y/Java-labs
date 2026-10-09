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
public class RepeatingMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String User = "";
        
        System.out.print("Please select an item. Enter {Q} or {q} to quit: ");
        User = input.nextLine();
        
        
        while(!User.equalsIgnoreCase("Q"))
        {
         System.out.println("You entered: " + User);
         System.out.print("Please select an item. Enter {Q} or {q} to quit: ");
         User = input.nextLine();
        }
    }
    
}
