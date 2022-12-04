/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto;

/**
 *
 * @author sebas
 */
import java.io.File;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.PrintWriter; 
import java.util.Scanner;
public class Proyecto
{

    //public static void main(String[] args) throws IOException{
    int opcion = -1;
    int empresaCreada;
    Validacion validar = new Validacion();
    Scanner Entrada = new Scanner(System.in);

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getEmpresaCreada() {
        return empresaCreada;
    }

    public void setEmpresaCreada(int empresaCreada) {
        this.empresaCreada = empresaCreada;
    }

    
    
    public void Menu()
    {
        while(opcion != 0)
        {
            System.out.println("Ingrese 1 si desea agregar una empresa");
            System.out.println("Ingrese 2 si desea mostrar empresa");
            System.out.println("Ingrese 3 si desea agregar una población");
            System.out.println("Ingrese 4 si desea mostrar una población"); 
            System.out.println("Ingrese 5 si desea buscar una casa");
            System.out.println("Ingrese 6 si desea el eliminar el contenedor de una casa");
            System.out.println("Ingrese 0 para terminar el proceso");
            opcion = validar.validarEntero();
            while(opcion < 0)
            {
                System.out.println("Ingrese opcion valida");
                opcion = validar.validarEntero();
            }
            switch(opcion)
            {

                    case 1:

                        Contenedor contenedorEmpresa = new Contenedor();

                        Empresa empresa = new Empresa(contenedorEmpresa); //Pide un contenedor más
                        empresa.setColeccionContenedor(empresa.crearContenedores());
                        try{
                        File archivo = new File("texto1.txt");

                        FileWriter escritura = new FileWriter(archivo);

                        PrintWriter escritura2 = new PrintWriter(escritura);

                        escritura2.println("Nombre Empresa :" + empresa.getNombre()+ "Cantidad Contenedores disponibles : "+empresa.getContenedoresDisponibles());
                        escritura2.println("Contenedores de la empresa :");
                        for(int i = 0 ;i<empresa.getColeccionContenedor().size();i++)
                        {
                            escritura2.println("Contenedor N° " + (i+1));
                            escritura2.println("Capacidad Maxima : " + empresa.getColeccionContenedor().get(i).getCapacidadContenedor());
                            escritura2.println("Agua Restante :  " + empresa.getColeccionContenedor().get(i).getAguaRestante());
                            escritura2.println("Limite bajo nivel : " + empresa.getColeccionContenedor().get(i).getLimiteBajoNivel());

                        }
                        escritura2.close();
                        }catch (IOException e)
                        {

                        }
                        break;
                    case 2:
                        contenedorEmpresa = new Contenedor();
                        empresa = new Empresa(contenedorEmpresa);
                        empresa.crearContenedores();

                        contenedorEmpresa.verContenedor();
                        empresa.verEmpresa();

                        break;

                    case 3:
                        Poblacion poblacion;
                        Casa objetoCasa = new Casa();

                        poblacion = objetoCasa.armarPoblacion();
                    case 4:
                        
                        objetoCasa = new Casa();

                        poblacion = objetoCasa.armarPoblacion();

                        poblacion.verPoblacion(poblacion.getCasas());
                        try{
                        File archivo = new File("texto2.txt");

                        FileWriter escritura = new FileWriter(archivo);

                        PrintWriter escritura2 = new PrintWriter(escritura);

                        escritura2.println("Cantidad de casas :" + poblacion.getCantCasas());
                        escritura2.println("Casas:");
                        for(int i = 0 ;i<poblacion.getCasas().size();i++)
                        {
                            escritura2.println("Casa N° " + (i+1));
                            escritura2.println("Cantidad de habitantes en casa : " + poblacion.getCasas().get(i).getCantHabitantes());
                            escritura2.println("Direccion :  " + poblacion.getCasas().get(i).getDireccion());
                            escritura2.println("Contacto : " + poblacion.getCasas().get(i).getContacto());

                        }
                        escritura2.close();
                        }catch (IOException e)
                        {

                        }
                    case 5:
                        int contacto;
                        String direccion;
                        
                        poblacion = new Poblacion();
                        objetoCasa = new Casa();
                        Validacion validar = new Validacion();
                        System.out.println("Ingrese direccion de la casa");
                        direccion = validar.validarCadena();
                        while(direccion == null)
                        {
                            System.out.println("Ingrese direccion de la casa");
                            direccion = validar.validarCadena();
                        }
                        System.out.println("Ingrese contacto de la casa");
                        
                        contacto = validar.validarEntero();
                        while(contacto < 1)
                        {
                            System.out.println("Ingrese contacto de la casa");
                        
                        contacto = validar.validarEntero();
                        }
                        poblacion = objetoCasa.armarPoblacion();
                        
                        poblacion.buscarCasa(contacto,direccion);
                    case 6:
                        
                        
                        objetoCasa = new Casa();
                        validar = new Validacion();
                        System.out.println("Ingrese direccion de la casa");
                        direccion = validar.validarCadena();
                        while(direccion == null)
                        {
                            System.out.println("Ingrese direccion de la casa");
                            direccion = validar.validarCadena();
                        }
                        System.out.println("Ingrese contacto de la casa");
                        
                        contacto = validar.validarEntero();
                        while(contacto < 1)
                        {
                            System.out.println("Ingrese contacto de la casa");
                        
                        contacto = validar.validarEntero();
                        }
                        poblacion = objetoCasa.armarPoblacion();
                        
                        poblacion.eliminarCasa(contacto,direccion);
                        
                    case 7:
                        
                        objetoCasa = new Casa();
                        validar = new Validacion();
                        int contactoNuevo;
                        String direccionNueva;
                        System.out.println("Ingrese direccion actual de la casa");
                        direccion = validar.validarCadena();
                        while(direccion == null)
                        {
                            System.out.println("Ingrese direccion actual de la casa");
                            direccion = validar.validarCadena();
                        }
                        System.out.println("Ingrese contacto actual de la casa");
                        
                        contacto = validar.validarEntero();
                        while(contacto < 1)
                        {
                            System.out.println("Ingrese contacto actual de la casa");
                        
                        contacto = validar.validarEntero();
                        }
                        
                        System.out.println("Ingrese direccion nueva de la casa");
                        direccionNueva = validar.validarCadena();
                        while(direccionNueva == null)
                        {
                            System.out.println("Ingrese direccion nueva de la casa");
                            direccionNueva = validar.validarCadena();
                        }
                        
                        System.out.println("Ingrese contacto nuevo de la casa");
                        
                        contactoNuevo = validar.validarEntero();
                        while(contacto < 1)
                        {
                            System.out.println("Ingrese contacto nuevo de la casa");
                        
                        contactoNuevo = validar.validarEntero();
                        }
                        poblacion = objetoCasa.armarPoblacion();
                        poblacion.modificarCasa(contacto, direccion, contactoNuevo, direccionNueva);
                        
                        
                    case 0:
                        System.out.println("Proceso terminado");
                        break;
                    default:
                        System.out.println("Opcion Ingresada no existe");
                        break;
            }
        }
    }
}
