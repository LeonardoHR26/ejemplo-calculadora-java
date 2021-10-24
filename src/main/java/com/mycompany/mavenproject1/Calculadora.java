package com.mycompany.mavenproject1;

import static java.lang.System.out;

public class Calculadora {
    
    private int valor1;
    private int valor2;
    private final static String MENSAJE_ERROR = "Valor no permitido";
    
    public Calculadora(){
        System.out.println("Se instancio la clase");
    }
    
    public Calculadora(int v1, int v2){
        
        this.valor1 = v1;
        this.valor2 = v2;
        
        int resultado = sumar();
        
        System.out.println("valor final " + resultado);
        
    }
    
    public void setValor1(int v1) throws Exception{
        this.valor1 = v1;
        
        evaluarValor(this.valor1);
        
    }
    
    public void setValor2(int v2) throws Exception{
        this.valor2 = v2;
        
        evaluarValor(this.valor2);
        
    }
    
    private void evaluarValor(int valor) throws Exception{
        
        if(valor<0){            
            System.out.println(MENSAJE_ERROR);
            throw new Exception(MENSAJE_ERROR);
        }
        
    }
    
    public int sumar(){
        
       out.println("se esta sumando");
        
        return valor1 + valor2;
    }
    public int multiplicar (){
        
        out.println("se esta multiplicando");

        return valor1 * valor2;
    }
    public int dividir(){
        
        out.println("se esta dividiendo");
        
        return valor1 / valor2;}
    
    public int restar(){
        out.println("se esta restando");
        
        return valor1 - valor2;
    }
    
}   
