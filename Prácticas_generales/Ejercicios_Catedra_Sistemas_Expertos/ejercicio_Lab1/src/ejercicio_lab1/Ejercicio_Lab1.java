/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_lab1;

import java.util.Scanner;

/**
 *
 * @author edwin
 */
public class Ejercicio_Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
       int num;
       
        System.out.println("Introduzaca un número: ");
        
        num=teclado.nextInt(); // con esta linea de codigo lo que hacemos es basicamente almacenar
        //el valor ingresado por teclado en la variable num
        
        System.out.println("El factorial de "+ num + " es " + factorial(num));
        
    }
    
    public static int factorial( int num){
        //Aca aclaramos que si el numero que se escribe es 0 retorne 1
        if(num == 0){
            return 1;
        } else {
            return num * factorial(num - 1 );
            //de lo contrario returnara el numero almacenado en num y lo multiplicara por num -1
        }
    }
    
}
