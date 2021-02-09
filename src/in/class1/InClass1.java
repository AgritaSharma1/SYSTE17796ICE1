/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package in.class1;

/**
 *
 * @author agrit
 */
public class InClass1 {

    /**
     * @param args the command line arguments
     */
    public static double calcAvg(int[] aRRay){
        double total = 0;
        for(int i=0; i<aRRay.length; i++){
           total+=aRRay[i]; 
        }
        double avg = total/aRRay.length;
        return avg;
    }
    
    public static double calcMax(int[] aRRay){
        double max=0;
        for(int i=0; i<aRRay.length; i++){
            if( max > aRRay[i]){
                max = max;
            }
            else{
            max = aRRay[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        
        int[] grades = {45,89,56,87,49,64,54,87,95,45};
        System.out.println("The average mark is " + calcAvg(grades));
        System.out.println("The maximum grade is " + calcMax(grades));

    }

}
