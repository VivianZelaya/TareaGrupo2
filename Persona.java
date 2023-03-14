/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author Vivian Zelaya
 */
public class Persona {
    
    //Atrubutos
    private String Nombre;
    private int Edad;
    private String Genero;
    
    //Constructor sin parametros
    public Persona(){
        
    }
    
    //set and get
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getNombre(){
        return this.Nombre;
    }
    
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    public int getEdad(){
        return this.Edad;
    }
    
    public void setGenero(String Genero){
        this.Genero = Genero;
    }
    public String getSexo(){
        return this.Genero;
    }
    
    //Retornar Información
    public void imprimir(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Género: " + Genero);
    }
}
