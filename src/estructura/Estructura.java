package estructura;
import java.io.*;
import javax.swing.JOptionPane;


/**
 * @author Angel
 */

public class Estructura {
    
        
    public static void BURBUJA(String[] args) {
        int elegir = 0;
        
        int nNumeroEstudiantes = 0;
        
        nNumeroEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos: "));
        
        String sListaMensaje = "";
        String borrar="";
        int [] edadesordenadas=new int [nNumeroEstudiantes];        
        int [] edades = new int [nNumeroEstudiantes];
        
        for (int i = 0; i < edades.length; i++) {
                edades [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número: " + (i+1) + " "));
            
        }
        for (int i = 0; i <= edadesordenadas.length - 1; i++) {
            
            sListaMensaje+= (i+1) + ". " + " - Edad " + edades[i] + "\n";
            
        }
        
        // Instanciar mi Clase Ordenamiento
        //Tipode nombre de  =   palabra reservada Tipode
        //Dato  Variable    = new       Dato
        
        Ordenamiento oClsOrdernamiento = new Ordenamiento();
        
        //Ordenando el Arreglo
        /** HACER UN inputDialog
         * ordenar por burbuja, ordenar shell, hash
         * si presionamos 1 que nos ordene por burbuja, 2 en shell y 3 en hassh
         */
        edadesordenadas = oClsOrdernamiento.burbuja(edades);
        
        // Impresión
        sListaMensaje+= "NÚMEROS ORDENADOS------" + "\n";
        
        for (int i = 0; i <= edadesordenadas.length - 1; i++) {
            
            sListaMensaje+= (i+1) + ". " + " - Edad " + edadesordenadas[i] + "\n";
            
        }
        
        JOptionPane.showMessageDialog(null, sListaMensaje);

        
            
                nNumeroEstudiantes = 0;
                nNumeroEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de datos: "));
                                       
                sListaMensaje = "";
                borrar="";
                edadesordenadas=new int [nNumeroEstudiantes];    
                edades = new int [nNumeroEstudiantes];
        
                for (int i = 0; i < edades.length; i++) {
                    edades [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: " + (i+1) + " "));
            
                }
                for (int i = 0; i <= edadesordenadas.length - 1; i++) {
            
                    sListaMensaje+= (i+1) + ". " + " -- " + edades[i] + "\n";
            
                }
                
                
    }
    
    
    public static void SHELL(String[] args) {
        
        
        
        
        
    } 
}    

