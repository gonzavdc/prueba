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
public class Empresa extends Contenedor{
    private Contenedor contenedores;
    private int contenedoresDisponibles;
    private String Nombre;
    private ArrayList<Contenedor> ColeccionContenedor;
    
    Validacion validar = new Validacion();
    Scanner Entrada = new Scanner(System.in);
  
    public Empresa(Contenedor contenedores) {
        System.out.println("Ingrese nombre de la empresa");
        Nombre = validar.validarCadena();
        while (Nombre == (null))
        {
            System.out.println("Ingrese nombre de la empresa");

            Nombre = validar.validarCadena();
        }
        this.contenedores = contenedores.getContenedorCasa();
        System.out.println("Ingrese cantidad de contenedores Disponibles");
        this.contenedoresDisponibles = validar.validarEntero();
        while(this.contenedoresDisponibles < 1)
        {
            System.out.println("Ingrese cantidad de contenedores Disponibles");
            this.contenedoresDisponibles = validar.validarEntero();
        }
               
        this.ColeccionContenedor = crearContenedores();
        
        
    }

    

    public ArrayList<Contenedor> getColeccionContenedor() {
        return ColeccionContenedor;
    }

    

    public void setColeccionContenedor(ArrayList<Contenedor> ColeccionContenedor) {
        ColeccionContenedor = ColeccionContenedor;
    }

    

    

    

    
    public Contenedor getContenedores() {
        return contenedores;
    }

    public int getContenedoresDisponibles() {
        return contenedoresDisponibles;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setContenedores(Contenedor contenedores) {
        this.contenedores = contenedores;
    }

    public void setContenedoresDisponibles(int contenedoresDisponibles) {
        this.contenedoresDisponibles = contenedoresDisponibles;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public ArrayList<Contenedor> crearContenedores()
    {
        ArrayList<Contenedor> array = new ArrayList();
        
        for (int i = 0;i < this.contenedoresDisponibles; i++)
        {
            Contenedor objetoContenedor = new Contenedor();
            array.add(objetoContenedor);
        
        }
        return array;
    }
    
    public void verEmpresa()
    {
        System.out.println("Nombre empresa :"+ Nombre);
        for(int i= 0;i < ColeccionContenedor.size();i++)
        {
            
            ColeccionContenedor.get(i).verContenedor();
        }
    }
    
    /**
     *
     */
    @Override
    public void verContenedor()
    {
        System.out.println("Contenedor de la empresa" + Nombre);
        System.out.println("Capacidad máxima : "+ super.getCapacidadContenedor());
        System.out.println("Agua restante : "+ super.getAguaRestante());
    }
    
    public void crearDatos(String nombreEmpresa,ArrayList<Contenedor> coleccionContenedor)
    {
        
        
        EscribirCSV reporte = new EscribirCSV("Empresa.csv");
        
        
        
        

            
        String[] header = {"Nombre Empresa : "+nombreEmpresa," Cantidad de contenedores : "+coleccionContenedor.size()};
        reporte.escribirDatoEmpresa(header, ColeccionContenedor);
    }
}
