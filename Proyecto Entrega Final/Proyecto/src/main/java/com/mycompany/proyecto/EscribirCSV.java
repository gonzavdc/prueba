package com.mycompany.proyecto;
import au.com.bytecode.opencsv.CSVWriter;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class EscribirCSV {
    
    private String ruta;
    
    
    public EscribirCSV(String ruta)
    {
        this.ruta = ruta;
    }
    
    public void escribirDatoEmpresa(String [] header,ArrayList<Contenedor> coleccionContenedor)
    {
        File file = new File(this.ruta);
        
        
        try{
            
            FileWriter salida = new FileWriter(file);
            
            CSVWriter escritura = new CSVWriter (salida);
            //header = {NombreEmpresa, Cant Contenedores]
            escritura.writeNext(header);
            
            for(int i= 0;i<coleccionContenedor.size();i++)
            {
                String[] datos = {"Capacidad Contenedor :"+Double.toString(coleccionContenedor.get(i).getCapacidadContenedor()),"Limite bajo nivel de agua"+Double.toString(coleccionContenedor.get(i).getLimiteBajoNivel())};
                escritura.writeNext(datos);
                
            }
            
            
            escritura.close();
        }catch(IOException E)
        {
            E.printStackTrace();
        }
    }
}
