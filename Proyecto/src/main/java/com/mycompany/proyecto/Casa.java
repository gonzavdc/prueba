/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author sebas
 */  
import java.util.ArrayList;
import java.util.Scanner;
public class Casa{
    private int cantHabitantes;
    private double consumoMaximo;
    private int necesitaContenedor;
    private int Contacto;
    private String Direccion;
    private Contenedor contenedorCasa;
            
    public Validacion validar = new Validacion();
    public Casa()
    {
        
    }
    
    // Constructor casa
    public Casa(Contenedor contenedorCasa) {
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de habitantes de la casa");
        this.cantHabitantes = validar.validarEntero();
        while(cantHabitantes < 1)
        {
            System.out.println("Ingrese cantidad de habitantes de la casa, debe ser mayor a 0");
            this.cantHabitantes = validar.validarEntero();
        }
        System.out.println("Ingrese consumo máximo del hogar");
        this.consumoMaximo = validar.validarDouble();
        while(consumoMaximo < 1)
        {
            System.out.println("Ingrese consumo máximo del hogar, debe ser mayor a 1 y con punto");
            this.consumoMaximo = validar.validarDouble();
        }
        System.out.println("Ingrese 1 si necesita contenedor, 0 en caso contrario");
        this.necesitaContenedor = validar.validarEntero();
        while(necesitaContenedor < 1)
        {
            System.out.println("Ingrese 1 si necesita contenedor, 0 en caso contrario");
            this.necesitaContenedor = validar.validarEntero();
        }
        System.out.println("Ingrese número de contacto");
        this.Contacto = validar.validarEntero();
        while(Contacto < 1)
        {
            System.out.println("Ingrese número de contacto");
            this.Contacto = validar.validarEntero();
        }
        System.out.println("Ingrese dirección");
        this.Direccion = validar.validarCadena();
        while(Direccion == (null))
        {
            System.out.println("Ingrese número de contacto");
            this.Direccion = validar.validarCadena();
        }
        this.contenedorCasa = contenedorCasa;
    }
    
    // Constructor casa con sobrecarga, recibiendo nuevo parametro dirección
    public Casa(Contenedor contenedorCasa, String direccion)
    {
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de habitantes de la casa");
        this.cantHabitantes = validar.validarEntero();
        while(cantHabitantes < 1)
        {
            System.out.println("Ingrese cantidad de habitantes de la casa");
            this.cantHabitantes = validar.validarEntero();
        }
        System.out.println("Ingrese consumo máximo del hogar");
        this.consumoMaximo = validar.validarDouble();
        while(consumoMaximo < 1)
        {
            System.out.println("Ingrese consumo máximo del hogar");
            this.consumoMaximo = validar.validarDouble();
        }
        System.out.println("Ingrese 1 si necesita contenedor, 0 en caso contrario");
        this.necesitaContenedor = validar.validarEntero();
        while(necesitaContenedor < 1)
        {
            System.out.println("Ingrese 1 si necesita contenedor, 0 en caso contrario");
            this.necesitaContenedor = validar.validarEntero();
        }
        System.out.println("Ingrese número de contacto");
        this.Contacto = validar.validarEntero();
        while(Contacto < 1)
        {
            System.out.println("Ingrese número de contacto");
            this.Contacto = validar.validarEntero();
        }
        
        
        this.Direccion = direccion;
        this.contenedorCasa = contenedorCasa;
    }

    
    // Getters
    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public double getConsumoMaximo() {
        return consumoMaximo;
    }

    public int getNecesitaContenedor() {
        return necesitaContenedor;
    }

    public int getContacto() {
        return Contacto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public Contenedor getContenedorCasa() {
        return contenedorCasa;
    }

    // Setters 
    public void setCantHabitantes(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }

    public void setConsumoMaximo(double consumoMaximo) {
        this.consumoMaximo = consumoMaximo;
    }

    public void setNecesitaContenedor(int necesitaContenedor) {
        this.necesitaContenedor = necesitaContenedor;
    }

    public void setContacto(int Contacto) {
        this.Contacto = Contacto;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setContenedorCasa(Contenedor contenedorCasa) {
        this.contenedorCasa = contenedorCasa;
    }
    
    
    /*
    Se crea un arreglo tipo Casa el cual va a almacenar las
    la cantidad de casas establecidas desde la consola
    Al asignarle a una casa auxiliar todos los datos necesarios,
    esta se agrega al array Coleccion Casas, repitiendose la cantidad
    de casas ingresadas por consola.
    Luego retornamos la población auxiliar, que será quien contenga
    la colección completa de nuestras casas.
    */
    public Poblacion armarPoblacion()
    {
        Poblacion poblacionAux = new Poblacion();
        Casa casaAux = new Casa();
        int cantCasas;
        ArrayList <Casa> ColeccionCasas;
        Poblacion objetoPoblacion = new Poblacion();
        ColeccionCasas = objetoPoblacion.getCasas();
        Contenedor contenedores = new Contenedor();
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de habitantes en la población");
        cantCasas = Entrada.nextInt();
        
        
        for(int i = 0;i < cantCasas; i++)
        {
           
            casaAux = new Casa(casaAux.getContenedorCasa());
            ColeccionCasas.add(casaAux);
        }
        
        poblacionAux.setCantCasas(cantCasas);
        poblacionAux.setCasas(ColeccionCasas);
        
        return poblacionAux;
    }
    
    /*
    Función que se encarga de preguntar si es que se necesita una
    recarga el contenedor de agua, se indica la dirección de la casa 
    que necesite la recarga y el contacto de la persona
    */
    public void necesitaRecarga()
    {
        System.out.println("¿Necesita un nuevo contenedor? "+ necesitaContenedor);
        System.out.println("Dirección :" + Direccion);
        System.out.println("Contacto :" + Contacto);
    }
    
    
    
    
    
}
