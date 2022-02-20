/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Yazak
 */
public class java {
    public static void main(String args[]){
        int numberOfDisks = 3;
        String Cal = hanoiFunction(numberOfDisks, 1, 3);
        
        
        for(String step : Cal.split(";")){
            System.out.println(step);
        }
        
    }
    
    public static String hanoiFunction(int numberOfDisks, int StartRod, int EndRod){
        if(numberOfDisks ==1){
            return StartRod + " moved to " + EndRod + "\n";
        }
        else{
            String output1, output2, output3;
            int MiddleRod = 6 - (StartRod + EndRod);
            
            output1 = hanoiFunction(numberOfDisks - 1, StartRod, MiddleRod);
            output2 = StartRod + " moved to " + EndRod + "\n";
            output3 = hanoiFunction(numberOfDisks - 1, MiddleRod, EndRod);
            
            return output1 + output2 + output3;
        }
        
    }
}
