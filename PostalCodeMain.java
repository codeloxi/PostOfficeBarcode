/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postalcodemain;

/**
 *
 * @author jacob
 */
public class PostalCodeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        printBarcode printBarcode = new printBarcode();
        setZip setZip = new setZip();
        setBarcode setBarcode = new setBarcode();
        printZip printZip = new printZip();
        
        setZip.checkZip();
        
        printBarcode.printBarcode(setZip.getZip());
        System.out.println();
        
        setBarcode.setBarcode();
        printZip.splitString(setBarcode.getBarcode());
        
        System.out.println();
        
    }
    
}
