/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;
import ventanas.ListarGP;
//import javax.swing.DefaultListModel;

/**
 *
 * @author santamaria
 */
public class ListaPersona {
    public static List<Persona> listaPersona = new ArrayList<>(); //Creamos una lista de la clase persona con un orden como un arreglo
    static ListarGP listaG = new ListarGP();                      // instanciamos la clase ventana de listar pues asi mas adelante las actualizamos en tiempo real  
    
    

    static public void addPersona(Persona c) {     //metodo para añadir a lista y actualizar la lista en tiempo real
        listaPersona.add(c);
        listaG.setListaGrafica();
        
        
        
    }

    public ListarGP getListaG() {  
        return listaG;
    }

    public void setListaG(ListarGP listaG) {
        this.listaG = listaG;
    }

   

    public ListaPersona() {  //constructor vacio
    }

    public static List<Persona> getListaPersona() {
        return listaPersona;
    }

    public static void setListaPersona(List<Persona> listaPersona) {
        ListaPersona.listaPersona = listaPersona;
    }

    //public static DefaultListModel getMiLista() {
   //     return miLista;
   // }

    //public static void setMiLista(DefaultListModel miLista) {
    //    ListaPersona.miLista = miLista;
    //}

    
    
    
}
