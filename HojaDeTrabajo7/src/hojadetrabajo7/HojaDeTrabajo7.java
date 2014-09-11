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
    
    
    
    
    private static List<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();
    
    
    public static void main(String[] args) {
        leerArchivo(array);
    }
    //metodo para leer el archivo de texto 
    public static void leerArchivo(List<HashMap<String,String>> imp){
    
        
       
         /*Declaracion de variables*/
        String micadena = null;
        String linea=null;
        
        
        FileReader fr;
        BufferedReader br;
                
        
        try
        {
            /*Se crea un objeto que permite abrir el archivo de texto*/
            AbrirJFileChooser abrirArchivo = new AbrirJFileChooser();
            abrirArchivo.Abrir(); /*Se slecciona el archivo de texto*/
            String ruta =abrirArchivo.getPath(); /*Se obtiene la ruta del
                                                    archivo de texto*/
           
            
            /*Lectura del archivo*/
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            
            while ((micadena = br.readLine())!=null)
            {
                linea = micadena;
               
                String[] tokens = micadena.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                for(String t : tokens) {
              
                    System.out.println("> "+t);
                
                 }
          
            }
        }
        
        /*Error en caso de que no se pueda leer el archivo*/
        catch(Exception e)
        {
            System.out.println("Hubo un error leyendo el archivo. No se"
                    + "encuentra el archivo 'datos.txt'");
            
            
             /*Si hubo error cargando el archivo, termina el programa*/
            System.exit(0);
        }
    
    }
}
