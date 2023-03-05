package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class readFile {
    
    public void readShopList(Map<String, String> typeMap, String shopPath) throws FileNotFoundException{
        
        File file = new File(shopPath); 
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){

            String productLine = sc.nextLine(); 
            String[] tempProductLine = productLine.split("\\|\t"); 

            typeMap.put(tempProductLine[1], tempProductLine[0]); 
        }
        sc.close();

        System.out.println("\nLista de Productos de Productos Existentes ");
        for (String items : typeMap.keySet()) {
            String item = items.toString(); 
            String category = typeMap.get(items).toString(); 
            
            System.out.println("\tNombre de Producto: " + item + " , Categoría:  " + category + "\n");
        }
    }
}
