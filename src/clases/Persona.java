/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author santamaria
 */
public class Persona {
    
    private String nombre,nacionalidad;
    private int edad,cedula;

    public Persona() { //constructor vacio
    }

    public Persona(String nombre, String nacionalidad, int cedula, int edad) { //constructor de la clase
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.cedula = cedula;
        this.edad = edad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
