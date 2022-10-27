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
public class Contenedor extends Casa{
    private double limiteBajoNivel;
    private double capacidadContenedor;
    private double AguaRestante;
    Scanner Entrada = new Scanner(System.in);
    
    Validacion validar = new Validacion();
    
   
    // Getters
    public double getLimiteBajoNivel() {
        return limiteBajoNivel;
    }

    public double getCapacidadContenedor() {
        return capacidadContenedor;
    }

    public double getAguaRestante() {
        return AguaRestante;
    }

    //Setters 
    public void setLimiteBajoNivel(double limiteBajoNivel) {
        this.limiteBajoNivel = limiteBajoNivel;
    }

    public void setCapacidadContenedor(double capacidadContenedor) {
        this.capacidadContenedor = capacidadContenedor;
    }

    public void setAguaRestante(double AguaRestante) {
        this.AguaRestante = AguaRestante;
    }
    
    // constructor de contenedor
    public Contenedor() {
        
        System.out.println("Ingrese la capacidad máxima del contenedor, debe ser mayor a 1");
        this.capacidadContenedor = validar.validarDouble();
        while (capacidadContenedor < 1)
        {
            System.out.println("Ingrese la capacidad máxima del contenedor, debe ser mayor a 1");
            this.capacidadContenedor = validar.validarDouble();
        }
        System.out.println("Ingrese el agua restante en el contenedor");
        this.AguaRestante = validar.validarDouble();
        while (AguaRestante < 1)
        {
            System.out.println("Ingrese el agua restante en el contenedor, debe ser mayor a 1");
            this.AguaRestante = validar.validarDouble();
        }
        this.limiteBajoNivel = (this.capacidadContenedor * 0.20);
    }
    
    /* Constructor de contener con sobrecarga, 
    recibiendo capacidadMaxima como nuevo parametro */
    public Contenedor(double capacidadMaxima)
    {
        this.capacidadContenedor = capacidadMaxima;
        System.out.println("Ingrese el agua restante en el contenedor");
        this.AguaRestante = validar.validarDouble();
        while (AguaRestante < 1)
        {
            System.out.println("Ingrese el agua restante en el contenedor, debe ser mayor a 1");
            this.AguaRestante = validar.validarDouble();
        }
        this.limiteBajoNivel = (this.capacidadContenedor * 0.20);
    }
    
    // Muestra el contenido del contenedor
    public void verContenedor()
    {
        System.out.println("Contenedor");
        System.out.println("Capacidad máxima : "+ this.capacidadContenedor);
        System.out.println("Agua restante : "+ this.AguaRestante);
    }
    

    /*
    Versión sobreescrita de necesitaRecarga en la clase Casa
    En esta versión también se muestran los datos del contenedor de agua 
    */
    public void necesitaRecarga()
    {
        
        System.out.println("Dirección :" + super.getDireccion());
        System.out.println("Contacto :" + super.getContacto());
        System.out.println("Datos contenedor : ");
        System.out.println("Límite bajo nivel de agua :" + limiteBajoNivel);
        System.out.println("Capacidad del contenedor :" + capacidadContenedor);
        System.out.println("Agua restante :" + AguaRestante);
    }
}
