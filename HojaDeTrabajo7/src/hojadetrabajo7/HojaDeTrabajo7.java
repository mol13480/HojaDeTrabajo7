/*
Universidad del Valle de Guatemala
Hoja de Trabajo 7 
9/09/2014
Irene Molina 13480
Jorge Garcia 13175
Moises Urias 13015
 */

package hojadetrabajo7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class HojaDeTrabajo7 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    pruebaJorge lector= new pruebaJorge();
    lector.leerArchivo();
    
    Traductor traductor = new Traductor();
    traductor.seleccionarArchivo();
        
    }
}
