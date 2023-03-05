package Controller;

import java.util.Map;

/**
 * @author 
 * Madeline Castro 22743 
 * Hoja de Trabajo #4 
 * Propósito: Realizar las acciones de usario para la compra de productos 
 */

public class toDoShop {
    
    public void addProduct(Map<String, String> MapOfProducts, String product, String category){

        String categoryOfProduct, productToAdd; 

        productToAdd = product.substring(0,1).toUpperCase() + product.substring(1); 
        categoryOfProduct = category.substring(0,1).toUpperCase() + category.substring(1); 

        if(MapOfProducts.containsValue(categoryOfProduct)){

            if(!MapOfProducts.containsKey(productToAdd)){

                MapOfProducts.put(productToAdd, categoryOfProduct); 
                System.out.println("\t¡El producto ha sido añadido correctamente!\n");

            } else {
                System.out.println("\t¡El producto ya se encuentra agregado!\n");
            }    
        } else {

            System.out.println("\n\tNo se encontró la categoría del producto\n");
        }

    }
    public void searchProduct(Map<String, String> MapOfProducts, String product){

        String productToKnow = product.substring(0,1).toUpperCase() + product.substring(1); 
        
        if(MapOfProducts.containsKey(productToKnow)){
            System.out.println("\t\nEl producto: " + productToKnow + " se encuentra en la categoría: " + MapOfProducts.get(productToKnow));
        
        } else { 
            System.out.println("El producto: " + productToKnow + " no se encuentra dentro de ninguan categoría");
        }

    }
    public void showUserShopList(){

    }
    public void sortShopList(){

    } 
    public void showInventary(){

    }
    public void sortInventary(){

    }
}
