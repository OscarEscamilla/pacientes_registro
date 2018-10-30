/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author dani
 */
public class Pacientes {

    

    public static void main(String[] args) throws IOException {
        
    
        LinkedList lista_clave = new LinkedList();
        LinkedList lista_nombre = new LinkedList(); 
        LinkedList lista_direccion = new LinkedList(); 
        LinkedList lista_email = new LinkedList(); 
        LinkedList lista_telefono = new LinkedList(); 
        Scanner pu = new Scanner(System.in);
        BufferedReader variable = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("***MENU***");
            System.out.println("1 Registrar ");
            System.out.println("2 Modificar");
            System.out.println("3 Eliminar ");
            System.out.println("4 Mostrar ");
            System.out.println("5 Salir ");
            
            int opcion = pu.nextInt();

            if (opcion == 1) {
                
                System.out.print("ingrese sus datos...\n");
                System.out.println("Clave: ");
                String clave = variable.readLine();
                System.out.println( "Nombre: ");
                String nombre = variable.readLine();
                System.out.println( "Dirección: ");
                String direccion = variable.readLine();
                System.out.println("Correo : ");
                String email = variable.readLine();
                System.out.println("Telefono: ");
                String telefono = variable.readLine();                        
                        
           
                
                lista_clave.add(clave); 
                lista_nombre.add(nombre); 
                lista_direccion.add(direccion);  
                lista_email.add(email); 
                lista_telefono.add(telefono); 
                System.out.print("Registro guardado");
                
            } else if (opcion == 2) {
                
                System.out.print("Ingrese el número de paciente que desea actualizar: \n");
                int posicion_u = pu.nextInt();
                System.out.println("      PACIENTE " + (posicion_u) + ":"); 
                System.out.println("Nombre: " + lista_nombre.get((posicion_u-1)) );
                System.out.println( "Dirección: " + lista_direccion.get((posicion_u-1)) );
                System.out.println("Correo electronico: " + lista_email.get((posicion_u-1)) );
                System.out.println("Telefono: " + lista_telefono.get((posicion_u-1)) );

                System.out.println("Ingrese la actualizacion de datos: \n");
                System.out.print("Nombre: ");
                String nuevo_nombre = variable.readLine();
                System.out.print("Direccion: ");
                String nueva_direccion = variable.readLine();
                System.out.print("Correo Electronico: ");
                String nuevo_email = variable.readLine();
                System.out.print("Telefono: ");
                String nuevo_telefono = variable.readLine();
            
                lista_nombre.set((posicion_u - 1), nuevo_nombre); 
                lista_direccion.set((posicion_u - 1), nueva_direccion); 
                lista_email.set((posicion_u - 1), nuevo_email); 
                lista_telefono.set((posicion_u -1),nuevo_telefono);
                System.out.print("registro guardado \n");
            } else if (opcion == 3) {
                 
                System.out.print( "Ingrese la posicion del paciente que desea eliminar:\n"
                        + " ");
                int posicion = pu.nextInt();
             
                lista_clave.remove((posicion - 1)); 
                lista_nombre.remove((posicion - 1)); 
                lista_direccion.remove((posicion - 1));
                lista_email.remove((posicion - 1));
                lista_telefono.remove((posicion - 1));
                 System.out.print("eliminado...\n");
            } else if (opcion == 4) {
              
                 int tamano_l = lista_nombre.size();
                int po;
                for (po = 0; po < tamano_l; po++) {
                
                    System.out.println("      Datos Generales  " + (po + 1) + ":");
                    System.out.println("Clave: " +lista_clave.get(po));
                    System.out.println( "Nombre: " + lista_nombre.get(po));
                    System.out.println("Direccion: " + lista_direccion.get(po));
                    System.out.println("Correo electronico: " + lista_email.get(po));
                    System.out.println("Telefono: " + lista_telefono.get(po));
                }
              
               

            } else if (opcion == 5) {
                System.exit(0);
            }
        }

    }

}
                        

      
