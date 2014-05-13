/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package incrmultarrayindex;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author nicholaspeterson
 */
public class Functions {
    
    // VARIABLES //
    private int[] subSetArray;
    private int[] arrayWithNines;
    
    
    
    // SETTER AND GETTER FUNCTIONS //
    
    public void setSubSetArray(int num){
        subSetArray = new int[num];
    }
    
    public int[] returnSubSetArray(){
        return subSetArray;
    }
    
    public void setArrayWithNines(int num){
        arrayWithNines = new int[num];
    }
    
        // Don't need but made anyways
    public int[] returnArrayWithNines(){
        return arrayWithNines;
    }
    
    
    
    
    // FUNCTIONS //
    
    // fills array with zeros
    public void fillArrayWithZeros(){
        Arrays.fill(subSetArray, 0);
    }
    
    // fills array with 9s
    public void fillArrayWithNines(){
        Arrays.fill(arrayWithNines, 9);
    }
    
    // prints array
    public void printArray(){
        System.out.println(Arrays.toString(subSetArray));
        
        System.out.println(Arrays.toString(arrayWithNines));
    }
    
    // compares two arrays
    public boolean compareTwoArray(int[] array1, int[] array2){
        
        boolean areEqual = Arrays.equals(array1, array2);
        
        if (areEqual == true)
            return true;
        else
            return false;
    }
    
    
    
    
    
    
    
    public int[] incrArray(int[] array){
        
        int a = Array.getLength(array) - 1 ;
        
        if(array[a] == 9){
        
            while(array[a] == 9){
                a--;
            }
            
            
        }
        
        
        
        
        // basic increase 
        array[a] = array[a] + 1;
        
        
        
        return array;
    }
    
}
