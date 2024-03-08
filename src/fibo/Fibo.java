/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibo;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Init the scanner*/
        Scanner fiboIn =new Scanner(System.in);
        System.out.println("Porgrama que ayuda a calcular el numero de fibonacci");
        System.out.println("Ingrese el numero a calcular");
        int fiboCalc = fiboIn.nextInt();
        System.out.println("La serie de Fibonnacci de " +fiboCalc+ " es ");
        /*for: to return the serie number by number*/
        for(int i=0; i<=fiboCalc; i++){
            System.out.println(FiboFunc(i)+ " ");
        }
        
        
    }
    /*func to calc fibonacci*/
    public static int FiboFunc(int fiboCalc){
        if (fiboCalc == 0){
        return 0;
        }
        if(fiboCalc == 1 || fiboCalc ==2){
        return 1;
        }
        return FiboFunc(fiboCalc-2)+FiboFunc(fiboCalc-1);
    
    }
    
}
