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
        
        int[] subSetArray = new int[num];
        
        functions.fillArrayWithZeros(subSetArray);
        
        
        
        
    }
    
}
