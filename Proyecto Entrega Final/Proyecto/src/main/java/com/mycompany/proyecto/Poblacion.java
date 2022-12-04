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

    public Poblacion() {
    }

    public Poblacion(int cantCasas, ArrayList<Casa> Casas) {
        this.cantCasas = cantCasas;
        this.Casas = Casas;
    }

    
    

    
    public int getCantCasas() {
        return cantCasas;
    }

    public ArrayList<Casa> getCasas() {
        return Casas;
    }

    public void setCantCasas(int cantCasas) {
        this.cantCasas = cantCasas;
    }

    public void setCasas(ArrayList<Casa> Casas) {
        this.Casas = Casas;
    }
    
    
    public void verPoblacion(ArrayList<Casa> ColeccionCasas)
    {
        for(int i= 0;i<ColeccionCasas.size();i++)
        {
            System.out.println("Casa: "+(i+1)+" Tiene "+ColeccionCasas.get(i).getCantHabitantes()+"Habitantes");
        }
        
    }
    
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
        System.out.println("No se pudo eliminar el contenedor");
    }
    
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
