/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author V1C70R MU3N735
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada=new Scanner(System.in);
    
    ArrayList<String> elemX= new ArrayList<String>();
    ArrayList<String> elemY= new ArrayList<String>();
        
    System.out.println("Ingrese el Valor de X:");
    int x=entrada.nextInt();
    
    System.out.println("Ingrese el Valor de Y:");
    int y=entrada.nextInt();
    
        if (x>255||y>255||x==0||y==0||x<0||y<0) 
        {
            System.out.println("La función es: -1");
        }
        else
        {
            
         int n1=6;
         
            
             
        
    
        for (int i = n1; i==255; i++) 
        {
            String h=String.valueOf(i);
            elemX.add(h);
        }
        
        
        for (int i =0; i <= elemX.size(); i++) 
        {
            System.out.printf("%s", elemX.get(i));
        }
        }
    }
    
}
