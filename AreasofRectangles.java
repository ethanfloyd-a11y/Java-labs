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
public class AreasofRectangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length with rectangle 1: ");
        double Rec1L = input.nextDouble();
        
        System.out.print("Enter width with rectangle 1: ");
        double Rec1W = input.nextDouble();
        
        System.out.print("Enter length with rectangle 2: ");
        double Rec2L = input.nextDouble();
        
        System.out.print("Enter width with rectangle 2: ");
        double Rec2W = input.nextDouble();
        
        double AreaRec1 = Rec1L * Rec1W;
        double AreaRec2 = Rec2L * Rec2W;
        
        if(AreaRec1 > AreaRec2)
        {
            System.out.print("Rectangle 1's Area: "+ AreaRec1 +" Is greater than Rectangle 2's Area: "+ AreaRec2);
        }
        else if(AreaRec2 > AreaRec1)
        {
            System.out.print("Rectangle 2's Area: "+ AreaRec2 +" Is greater than Rectangle 1's Area: "+ AreaRec1);
        }
        else 
        {
            System.out.print("Your rectangles are even");
        }
    
    }
}