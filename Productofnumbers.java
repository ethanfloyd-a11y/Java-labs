/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repetitionlabs;

/**
 *
 * @author EDFlo
 */
public class Productofnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 1;
        for(int x = 1; x <= 5; x++ ){
            sum *= x;
        }
        System.out.print("The product of the numbers from 1-5 is: " + sum);
    }
    
}
