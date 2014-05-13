/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package incrmultarrayindex;

import java.util.Scanner;

/**
 *
 * @author nicholaspeterson
 */
public class IncrMultArrayIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Functions functions = new Functions();
        
        System.out.println("Enter number of array indexs:");
        Scanner str = new Scanner(System.in);
        String userInput = str.next();
        
        int num = Integer.parseInt(userInput);
        
        functions.setSubSetArray(num);      // Makes subSetArray
        functions.fillArrayWithZeros();     // filles with zeros
        
        functions.setArrayWithNines(num);       // Makes ArrayWithNines
        functions.fillArrayWithNines();    // fills with nines
        
        functions.printArray();
        
        /*
        int[] subSetArray = new int[num];
        int[] compArray = new int[num];
        
        functions.fillArrayWithZeros(subSetArray);
        functions.fillArrayWithNines(compArray);
        
        
        
        boolean areTheyEqual = functions.compareTwoArray(subSetArray, compArray);
        System.out.println(areTheyEqual);
        
        // functions.incrArray(subSetArray);
        
        functions.printArray(subSetArray);
        functions.printArray(compArray);
        
        */
    }
    
}
