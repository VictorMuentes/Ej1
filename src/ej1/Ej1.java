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
       int n1=7, n2=6, resultFuncion=0;
        int[] s1=new int[255];
        int[] s2=new int[255];
        int[] sResult=new int[255];
        for (int i = 0; i <= 254; i++) 
        {            
            s1[i]=n1;
            n1++;
            
        }
        for (int j = 0; j <= 254; j++) 
        {            
            s2[j]=n2;
            n2=n2-2;
            
        }
        n1=0;
        for (int i = 0; i < 255; i++) 
        {
            
            if (i%2==0)
            {
             sResult[i]=s1[n1];
             
            }
            else
            {                
                sResult[i]=s2[n1]; 
                n1++;
            }
                 
            
        }
        System.out.println("Ingrese Valor X");
        int x = entrada.nextInt();
        System.out.println("Ingrese Valor Y");
        int y= entrada.nextInt();
        
        if (x<=0 || y<=0 || x>255 || y>255)
        {
            resultFuncion=-1;
        }
        else
        {
            for (int i = 0; i <255; i++) 
            {
                if (x==(i+1))
                {
                    n1=sResult[i];
                }
                else
                {
                    if (y==(i+1))
                    {
                        n2=sResult[i];
                    }
                    
                }
            }
            resultFuncion=n1+n2;
        }
        System.out.println("El valor de la función es: " +resultFuncion);
      
       
        
    }
    
}
