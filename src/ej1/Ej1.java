/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej1;

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
    
    int [] f1=new int[255];
    int [] f2=new int[255];
    int [] result=new int [255]  ;      
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
            
         int n1=6,h=6,j=0,k=0;
         
   

        
    
        for (int i = 0; i<=f1.length; i++) 
        {
            f1[i]=n1;
            //System.out.println(f1[i]);
           
            n1++;
                       
            f2[i]=h;
            h--;
            
        }
        for (int i = 0; i==result.length; i++) {
            if (i%2==0) 
            {
               result[i]=f2[j];
               j=j+2;
            }else
            {
            result[i]=f1[k];
            k++;
            }
            System.out.println(result[i]);
        }
            for (int num:result)
            {
                System.out.println(num); 
                
                
            }
            
        
        
        }
    }
    
}
