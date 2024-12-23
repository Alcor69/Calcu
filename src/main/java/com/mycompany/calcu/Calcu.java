/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcu;

/**
 *
 * @author rb940
 */
public class Calcu {

    public static void main(String[] args) {
        Operaciones operacioneSuma = new Suma();
        System.out.println("Suma es: "+ operacioneSuma.calcular(5, 8));
        Operaciones operacioneResta = new Resta();
        System.out.println("Resta es: "+ operacioneResta.calcular(5, 8));
        Operaciones operacioneMultiplicacion = new Multiplicacion();
        System.out.println("Multiplicacion es: "+ operacioneMultiplicacion.calcular(5, 8));
        Operaciones operacioneDivicion = new Divicion();
        System.out.println("Suma es: "+ operacioneDivicion.calcular(5, 8));

        
                
    }
}
