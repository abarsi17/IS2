
package Modelo;

import java.io.*;

/**
 *
 * @author amadeo
 */
public class LeerFichero 
{
    public LeerFichero() throws IOException
    {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      String nombreJug, apellidosJug;

      try 
      {
         archivo = new File ("./src/fichero.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         String linea;
         while((linea=br.readLine())!=null)
         {
             //Leer hasta una coma
            if(br.readLine() == ",")
            {
                linea = br.readLine();  
            }
            
            
            //Leer hasta el final de linea
            else if(br.readLine() == "\n")
            {
                linea = br.readLine();
            }
            
            linea = "";
         }
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      
      finally
      {
         try
        {                    
            if( null != fr )   
               fr.close();          
        }
         
        catch (Exception e2)
        { 
            e2.printStackTrace();
        }
      }
    }
      
  }
