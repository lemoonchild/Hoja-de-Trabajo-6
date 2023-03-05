package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 
 * Madeline Castro 22743 
 * Hoja de Trabajo #4 
 * Propósito: Leer el archivo txt e ingresar dentro de Map seleccionado por usuario 
 */

public class readFile {
    
    /**
     * Leer el archivo txt de la lista de compras e ingresarlo a un Map 
     * @param typeMap Tipo de mapa seleccionado por usuario 
     * @param shopPath Ruta de archivo txt de la lista de compras 
     * @throws FileNotFoundException
     */
    public void readShopList(Map<String, String> typeMap, String shopPath) throws FileNotFoundException{
        
        File file = new File(shopPath); 
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){

            String productLine = sc.nextLine(); 
            String[] tempProductLine = productLine.split("\\|\t"); 

            typeMap.put(tempProductLine[1].trim(), tempProductLine[0].trim()); 
        }
        sc.close();
    }
}
