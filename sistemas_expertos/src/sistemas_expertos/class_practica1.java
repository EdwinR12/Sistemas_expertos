/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas_expertos;

/**
 *
 * @author edwin
 */
public class class_practica1 {
   
int sexo;
int gustos;
String Nombre;

public class_practica1(int gustos,int sexo, String Nombre){
    this.Nombre = Nombre;
    this.sexo = sexo;
    this.gustos = gustos;
}

public void Result(){
    System.out.println("María estima a"+Nombre+"por que es del sexo Masculino y le gusta Bailar");
}
}
