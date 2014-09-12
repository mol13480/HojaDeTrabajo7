/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class pruebaJorge {
    BinaryTree arbol= new BinaryTree();
    
    public  void leerArchivo(){
    
       
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
                String vector[]=linea.split(",");
                System.out.println(micadena);
                arbol.addNode(vector[0],vector[1]);
               
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
        
        /*Despues de leer el archivo*/
        /*Se crea un string tokenizer*/
        //System.out.println(linea);
      
        
    }
    //metodo para leer el archivo      
    
}
