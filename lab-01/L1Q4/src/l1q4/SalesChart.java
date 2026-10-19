package l1q4;

import java.awt.*;
import javax.swing.*;
public class SalesChart {

    public static void main(String[] args) {
        
        //array
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        
        int[] amounts = {2500, 1600, 2000, 2700, 3200, 800};
        
        
        //for loop
        
        for (int i = 0; i < months.length; i++){
            System.out.println(months[i] + " : " + amounts[i]);
        }
        
        System.out.println();
        
        //string repeat
        for (int i = 0; i < months.length; i++){
            System.out.printf("%-3s %-32s %4d%n", months[i], "*".repeat(amounts[i]/100), amounts[i]);
        }
        
        System.out.println();
        
        //maximum value
        int max = amounts[0];
        int maxIndex = 0;
        
        for (int i = 1; i < amounts.length; i++){
            if (amounts[i]>max){
            max = amounts[i];
            maxIndex = i;
            }
        }
        
        System.out.println("Highest Sales: " + max);
        System.out.println("Month: " + months[maxIndex]);
      
        
        }   
    }    
        
        

