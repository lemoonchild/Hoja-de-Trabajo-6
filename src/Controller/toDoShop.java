
package Controller; 

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 * @author 
 * Madeline Castro 22743 
 * Hoja de Trabajo #4 
 * Propósito: Realizar las acciones de usario para la compra de productos 
 */

public class toDoShop {

    /**
     * Metodo para añadir producto al Map del usuario 
     * @param addedProducts Map creado para los articulos del usuario 
     * @param MapOfProducts Mapa con lista de articulos 
     * @param product Nombre del producto a agregar 
     * @param category Categoria del producto a agregar 
     */
    public void  addProduct(Map<String,String> addedProducts, Map<String, String> MapOfProducts, String product, String category){

        String categoryOfProduct, productToAdd; 

        productToAdd = product.substring(0,1).toUpperCase() + product.substring(1); 
        categoryOfProduct = category.substring(0,1).toUpperCase() + category.substring(1); 

        if(MapOfProducts.containsValue(categoryOfProduct)){

            if(!MapOfProducts.containsKey(productToAdd)){

                addedProducts.put(productToAdd, categoryOfProduct); 

                System.out.println("\t¡El producto ha sido añadido correctamente!\n");

            } else {
                System.out.println("\t¡El producto ya se encuentra agregado!\n");
            }    
        } else {

            System.out.println("\n\tNo se encontró la categoría del producto\n");
        }

    }

    /**
     * Metodo utilizado para buscar productos dentro del Map con lista de articulos 
     * @param MapOfProducts Mapa con lista de articulos 
     * @param product Producto al cual se le quiere conocer la categoria 
     */
    public void searchProduct(Map<String, String> MapOfProducts, String product){

        String productToKnow = product.substring(0,1).toUpperCase() + product.substring(1); 
        
        if(MapOfProducts.containsKey(productToKnow)){
            System.out.println("\t\nEl producto: " + productToKnow + " se encuentra en la categoría: " + MapOfProducts.get(productToKnow));
        
        } else { 
            System.out.println("El producto: " + productToKnow + " no se encuentra dentro de ninguan categoría");
        }

    }

    /**
     * Metodo que muestra todos los articulos ingresados por el usuario 
     * @param userProductList Mapa con lista de articulos ingresados por el usuario 
     */
    public void showUserShopList(Map<String,String> userProductList){

        System.out.println("\nProductos agregados por el usuario");

        for (String keys: userProductList.keySet()) {

                String key = keys.toString();

                String value = userProductList.get(keys).toString();
                System.out.println("\tProducto: " + key + "       |       Categoría: " + value);

        }

        Map<String, Integer> collectionqty = new HashMap<>();

        for (String value : userProductList.values()) {
            if (collectionqty.containsKey(value)) {
                collectionqty.put(value, collectionqty.get(value) + 1);
            } else {
                collectionqty.put(value, 1);
            }
        }

        System.out.println("\nConteo de productos:");

        for (Map.Entry<String, Integer> entry : collectionqty.entrySet()) {
            
            System.out.println("\t" + entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("\n");


    }   

    /**
     * Metodo que ordena por categoria la lista de articulos del usuario 
     * @param userProductList Mapa con lista de articulos ingresados por el usuario  
     */
    public void sortShopList(Map<String,String> userProductList){
        
        List<Map.Entry<String, String>> toSortProductList = new LinkedList<Map.Entry<String, String>>(userProductList.entrySet());

        Collections.sort(toSortProductList, new Comparator<Map.Entry<String, String>>() {

            public int compare(Map.Entry<String, String> category1, Map.Entry<String, String> category2) {
                return category1.getValue().compareTo(category2.getValue());

            }
        });
        
        Map<String, String> sortedMap = new LinkedHashMap<String, String>();
        for (Map.Entry<String, String> sortedList : toSortProductList) {
            sortedMap.put(sortedList.getKey(), sortedList.getValue());
        }
        
        System.out.println("\nProductos agregados por usario ordenados por categoría: ");
        for (Map.Entry<String, String> sortedList : sortedMap.entrySet()) {
            System.out.println("\tCategoría: " + sortedList.getValue() + "     |       Producto: " + sortedList.getKey());
        }

        System.out.println("\nConteo de productos:");
        for (Entry<String, String> entry : sortedMap.entrySet()) {
            
            System.out.println("\t" + entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("\n");

    } 

    /**
     * Metodo que muestra la lista de articulos total 
     * @param mapInventary Lista de articulos 
     */
    public void showInventary(Map<String, String> mapInventary){

        System.out.println("\nProductos del inventario: \n");

        for (String keys: mapInventary.keySet()) {

                String key = keys.toString();

                String value = mapInventary.get(keys).toString();
                System.out.println("\tProducto: " + key + "   |   Categoría: " + value + "\n");

        }

        System.out.println("\n");

    }

    /**
     * Metodo que muestra la lista de articulos total 
     * @param sortInventaryCollection Lista de articulos 
     */
    public void sortInventary(Map<String, String> sortInventaryCollection){

        List<Map.Entry<String, String>> toSortProductList = new LinkedList<Map.Entry<String, String>>(sortInventaryCollection.entrySet());

        Collections.sort(toSortProductList, new Comparator<Map.Entry<String, String>>() {

            public int compare(Map.Entry<String, String> category1, Map.Entry<String, String> category2) {
                return category1.getValue().compareTo(category2.getValue());

            }
        });
        
        Map<String, String> sortedMap = new LinkedHashMap<String, String>();
        for (Map.Entry<String, String> sortedList : toSortProductList) {
            sortedMap.put(sortedList.getKey(), sortedList.getValue());
        }
        
        System.out.println("\nProductos del inventario ordenados por categoría: \n");
        for (Map.Entry<String, String> sortedList : sortedMap.entrySet()) {
            System.out.println("\tCategoría: " + sortedList.getValue() + "  |   Producto: " + sortedList.getKey() + "\n");
        }

        System.out.println("\n");
    }

}
