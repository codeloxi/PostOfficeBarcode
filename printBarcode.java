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
public class printBarcode {
    private final int DIVISOR = 10000;
    
    /**
     * 
     * @param zipcode is needed for all of the calculations to determine how to 
     * print the barcode. 
     */
    public void printBarcode(int zipcode){
        
        int compareZip = zipcode;
        int i, temp, checkZip;
        int divisor = DIVISOR;
        System.out.print("|");
        
        for(i=0; i<5; i++){
            temp = compareZip / divisor;
            barcodeChoice(temp);
            compareZip = compareZip % divisor;
            divisor /= 10;
        }
        
        checkZip = encodeZip(zipcode);
        barcodeChoice(checkZip);
        System.out.print("|");
        
    }
    /**
     * 
     * @param digit is only used for if statements to print out a barcode.
     */
    public void barcodeChoice(int digit){
        
        if(digit == 0){
            System.out.print("||:::");
        }
        if(digit == 1){
            System.out.print(":::||");
        }
        if(digit == 2){
            System.out.print("::|:|");
        }
        if(digit == 3){
            System.out.print("::||:");
        }
        if(digit == 4){
            System.out.print(":|::|");
        }
        if(digit == 5){
            System.out.print(":|:|:");
        }
        if(digit == 6){
            System.out.print(":||::");
        }
        if(digit == 7){
            System.out.print("|:::|");
        }
        if(digit == 8){
            System.out.print("|::|:");
        }
        if(digit == 9){
            System.out.print("|:|::");
        }
    }
        

    /**
     * 
     * @param zipcode is needed to calculate the POSTNET "binary".
     * @return returns the POSTNET "binary".
     */
    public int encodeZip(int zipcode){

        int sum = 0;
    
        while (zipcode > 0){
            int remainder = zipcode % 10;
            zipcode = zipcode / 10;
            sum += remainder;
            
        }
        return 10 - (sum % 10);
    }
}
