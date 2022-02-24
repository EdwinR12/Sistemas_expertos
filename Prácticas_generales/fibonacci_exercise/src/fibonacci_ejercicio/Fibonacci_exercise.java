/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci_ejercicio;

import java.util.Scanner;

/**
 *
 * @author edwin
 */
public class Fibonacci_exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el limite de la serie fibonacci que desee ver: ");
        long limite = sc.nextLong();
        
        System.out.println("los primeros " + limite + " de la serie Fibonacci son: ");
        seriefibonacci(limite, 0, 1);
    }
    
    public static void seriefibonacci(long limite, long anterior, long actual){
        if(limite > 0){
            System.out.println(actual);
            seriefibonacci(limite - 1, actual, anterior + actual);
        }
    }
    
}
