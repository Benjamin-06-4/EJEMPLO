/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

/**
 *
 * @author Angel
 * Nombre Clase: Ordenamiento
 * Descripción: Esta clase tendrá todos los métodos de ordenamientos posibles
 */
public class Ordenamiento {
    
    //Método de burbuja
    
    public int [] burbuja(int[] P_arreglo){
        
        int[] ordenamiento = new int [P_arreglo.length];
        int [] oArregloOrdenado = new int [P_arreglo.length];
        
        int aux=0;
        
        int nTerminoAreglo= P_arreglo.length;
        
        
        
            for (int i = 0; i < nTerminoAreglo - 1; i++) {
                                              
                for (int j = 0; j < nTerminoAreglo - 1; j++) {
                    
                if (P_arreglo[j] > P_arreglo[j+1]) {    
                    
                    aux= P_arreglo[j];
                    P_arreglo[j] = P_arreglo[j+1];
                    P_arreglo[j+1] = aux;               
                    
                    
                }                    
                    
                    
                }

            }
            
        
        oArregloOrdenado = P_arreglo;
        
        return oArregloOrdenado;
    }
    
}
