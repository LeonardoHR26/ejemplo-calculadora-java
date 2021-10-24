package com.mycompany.mavenproject1;

public class Animal {
    
    // Esta propiedad es para especificar si el animal está vivo.
    public boolean estaVivo;
    public int cantidad;
    public Integer cantidad2;
    /*
    Aqui se pueden expresar el tipo de animal. Por ejemplo: 
        - Terrestre
        - Acuatico
    */
    public String tipoAnimal;
    private int latidosCorazon = 1;
    
    private int getLatidosCorazon(){
    
        return latidosCorazon+2;
    
    }
    
    public int getRealesLatidos(){
        return getLatidosCorazon() * 3;
    }

}