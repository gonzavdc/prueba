/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Poblacion{
    private int cantCasas;
    private ArrayList<Casa> Casas;

    
    // Constructor vacío
    public Poblacion() {
    }

    //Constructor Población
    public Poblacion(int cantCasas, ArrayList<Casa> Casas) {
        this.cantCasas = cantCasas;
        this.Casas = Casas;
    }

    
    // Getters
    public int getCantCasas() {
        return cantCasas;
    }

    public ArrayList<Casa> getCasas() {
        return Casas;
    }

    // Setters
    public void setCantCasas(int cantCasas) {
        this.cantCasas = cantCasas;
    }

    public void setCasas(ArrayList<Casa> Casas) {
        this.Casas = Casas;
    }
    
    
    // Función que muestra cada casa que posee una población
    public void verPoblacion(ArrayList<Casa> ColeccionCasas)
    {
        for(int i= 0;i<ColeccionCasas.size();i++)
        {
            System.out.println("Casa: "+(i+1)+" Tiene "+ColeccionCasas.get(i).getCantHabitantes()+"Habitantes");
        }
        
    }
    
    /*
    Función de busqueda de una casa dentro del array de casas
    Si el contacto y la dirección ingresada coincide con la información
    de una de las casas del array, hace un return para "cortar" la función
    Si no la encuentra, imprime el mensaje correspondiente
    */
    public void buscarCasa(int contacto,String direccion)
    {
        for (int i= 0; i<Casas.size();i++)
        {
            if (Casas.get(i).getContacto() == contacto && Casas.get(i).getDireccion().equals(direccion))
            {
                   System.out.println("Casa encontrada");
                   return;
            }
        }
        System.out.println("Casa no encontrada");

        
    }
    
    /*
    Función similar a buscarCasa, pero cuando encuentra una coincidencia
    según los parametros enciados, la elimina del array y hace un return.
    En caso contrario, indica que la casa no se puedo eliminar.
    */
    public void eliminarCasa(int contacto, String direccion)
    {
        for (int i= 0; i<Casas.size();i++)
        {
            if (Casas.get(i).getContacto() == contacto && Casas.get(i).getDireccion().equals(direccion))
            {
                   Casas.remove(i);
                   return;
            }
        }
        System.out.println("No se pudo eliminar la casa");
    }
    
    /*
    Hace la busqueda de la casa que se desea modificar, al encontrarla
    se realizan los setters para cambiar la información con la nueva
    enviada por parametros.
    */
    public void modificarCasa(int contactoActual,String direccionActual, int contactoNuevo,String direccionNueva)
    {
        for(int i = 0;i < Casas.size();i++)
        {
            if(Casas.get(i).getContacto() == contactoActual && Casas.get(i).getDireccion().equals(direccionActual))
            {
                Casas.get(i).setContacto(contactoNuevo);
                Casas.get(i).setDireccion(direccionNueva);
                return;
            }
        }
    }
    
    
}
