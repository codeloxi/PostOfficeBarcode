/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postalcodemain;
import java.util.Scanner;

/**
 *
 * @author jacob
 */
public class setBarcode {
    String barcode = "";
    
    public void setBarcode(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Every 5 characters in the barcode please enter a "
                + "comma(,) with no spaces");
        System.out.println("Please remove first and last characters in the barcode");
        System.out.println("Remove the last 5 characters in your barcode - Then:");
        System.out.print("Please enter your barcode: ");
        barcode = in.next();
        
        
    }
    
    public String getBarcode(){
        return barcode;
    }
    
}
