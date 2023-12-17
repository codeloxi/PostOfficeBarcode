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
public class setZip {
    int zip = 0;
    
    public void checkZip(){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a 5 digit zipcode: ");
        zip = in.nextInt();
        
        if(zip < 500 || zip > 99999){
            System.out.println("Error - Zipcode must be between 00501 and 99999");
            System.out.print("Enter a 5 digit zip: ");
            zip = in.nextInt();
        }
         
    }
    
    public int getZip(){
        return zip;
    }
}
