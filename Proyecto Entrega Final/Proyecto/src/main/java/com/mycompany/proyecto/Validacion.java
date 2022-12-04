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
public class Validacion {
    Scanner Entrada = new Scanner(System.in);
    
    
    
    
    public int validarEntero()
    {
        
        
        try
        {
            String entero = Entrada.next();
            if(entero.matches("[0-9]*"))
            {
                return Integer.valueOf(entero);
            }
            else {
                System.out.println("Dato invalido, vuelva a ingresarlo");
            }
            
        }catch(Exception e){
            System.out.println("Este dato no es válido"); 
        }
        return 0;
    }
    
    public String validarCadena()
    {
        
        
        try
        {
            String cadena = Entrada.next();
            if(cadena.matches("[A-Za-z]*"))
            {
                return cadena;
            }
            else {
                System.out.println("Dato invalido, vuelva a ingresarlo");
                return null;
            }
            
        }catch(Exception e){
            System.out.println("Este dato no es válido"); 
        }
        return null;
    }
    public double validarDouble()
    {
        
        
        try
        {
            String decimal = Entrada.next();
            if(decimal.matches("[0-9]{1,13}(\\.[0-9]*)?"))
            {
                return Double.valueOf(decimal);
            }
            else {
                System.out.println("Dato invalido, vuelva a ingresarlo");
            }
            
            
        }catch(Exception e){
            System.out.println("Este dato no es válido"); 
        }
        return 0;
    }
    
}
