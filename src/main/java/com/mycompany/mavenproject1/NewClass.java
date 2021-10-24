package com.mycompany.mavenproject1;

/**
 *
 * @author carlo
 */
public class NewClass {
    
    public static void main(String[] args) throws Exception{
        
        Calculadora calc = new Calculadora();
        
        calc.setValor1(56);
        calc.setValor2(6);
        
        int resultado = calc.sumar();
        System.out.println(" el resultado es " + resultado);
       
        
    }
    
}

