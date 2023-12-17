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
public class printZip {
  
     
    
    public void splitString(String barcode){
        
        String [] splitstring = barcode.split(",");
        
        for(String a : splitstring){
            
            if(a.equals("||:::")){
                System.out.print("0");
            }
            if(a.equals(":::||")){
                System.out.print("1");
            }
            if(a.equals("::|:|")){
                System.out.print("2");
            }
            if(a.equals("::||:")){
                System.out.print("3");
            }
            if(a.equals(":|::|")){
                System.out.print("4");
            }
            if(a.equals(":|:|:")){
                System.out.print("5");
            }
            if(a.equals(":||::")){
                System.out.print("6");
            }
            if(a.equals("|:::|")){
                System.out.print("7");
            }
            if(a.equals("|::|:")){
                System.out.print("8");
            }
            if(a.equals("|:|::")){
                System.out.print("9");
            }
            
            
        }
        
    }
    
    
    
    
}
