/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.apartmentapplication.assignment1;
/**
 *
 * @author Yazak
 */
public class Main {
    public static void main(String args[]){
        
        /*Implement a multidimensional array using Mr., Mrs., Ms.,
          Smith and Jones to obtain an output displaying:
          I.  Mr. Smith
          II. Ms. Jones*/
        
        
        String[][] arr = new String[][]{{"Mr.", "Ms.","Mrs."},{"Smith","Jones"}};
        
        int size = arr.length;
        
        for(int i =0; i<size;i++){
            String dataset1 = arr[0][i];
            if(!"Mrs.".equals(dataset1)){
                System.out.print(arr[0][i]+" ");
            }
            System.out.print(arr[1][i]);
            System.out.println();
        }
        
        
    }
    
}
