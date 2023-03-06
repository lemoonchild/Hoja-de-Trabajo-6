package View;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

import Controller.readFile;
import Controller.toDoShop;
import Model.MapFactory;

/**
 * @author 
 * Madeline Castro 22743 
 * Hoja de Trabajo #4 
 * Propósito: Interfaz del usuario 
 */

public class UI {
    
    Scanner sc = new Scanner(System.in); 
    static readFile readFile = new readFile();
    static MapFactory mapFactory = new MapFactory(); 
    static toDoShop toDo = new toDoShop();
    
    /**
     * Menu de compra de usuario además de seleccion de tipo de implementación de Map 
     * @throws FileNotFoundException 
     */
    public void menuCompra() throws FileNotFoundException{

        int statusShop = 1; 

        String shopList = "C:\\Users\\ncast\\OneDrive\\Documentos\\Universidad\\Semestres\\Tercer Semestre\\Algoritmos y Estructura de Datos\\Hojas de Trabajo\\Hoja-de-Trabajo-6\\src\\ListadoProducto.txt"; 
        
        System.out.println("\n¡Bienvenido al mercado El Mero Mero!");
        System.out.println("¿Cómo qué implementación MAP desea realizar su compra?");
        System.out.println("\t1. HashMap");
        System.out.println("\t2. TreeMap");
        System.out.println("\t3. LinkedHashMap");

        int type = sc.nextInt(); 

        Map<String,String> typeUserMap = mapFactory.getTypeMap(type); 
        Map<String,String> collectionUserMap = mapFactory.getTypeMap(type); 
        readFile.readShopList(typeUserMap, shopList);
        
        while(statusShop == 1){

            Scanner sc1 = new Scanner(System.in); 

            System.out.println("\n¿Qué le gustaría realizar hoy?");
            System.out.println("\t1. Agregar producto");
            System.out.println("\t2. Buscar producto por categoría");
            System.out.println("\t3. Ver lista de compras");
            System.out.println("\t4. Mostrar inventario");

            int op = sc.nextInt(); 

            switch(op){

                case 1: 
                    
                    String product, category; 

                    System.out.println("\nEscriba el producto que quiere agregar: ");
                    product = sc1.nextLine();

                    System.out.println("Escriba la categoría del producto: ");
                    category = sc1.nextLine(); 

                    toDo.addProduct(collectionUserMap, typeUserMap, product, category);

                    break; 
                case 2: 
                    String productToKnow; 

                    System.out.println("Escriba el producto para conocer su categoría: ");
                    productToKnow = sc1.nextLine(); 
                    
                    toDo.searchProduct(typeUserMap, productToKnow);

                    break; 
                case 3:
                    System.out.println("¿Cómo desea ver la lista de compras?");
                    System.out.println("\t1. Ver toda la lista \n\t2. Ver la lista ordenada por tipo");
                    int opShopList = sc.nextInt(); 
                    
                    switch(opShopList){
                        case 1: 
                            toDo.showUserShopList(collectionUserMap);
                            break; 
                        case 2: 
                            toDo.sortShopList(collectionUserMap);
                            break; 
                        default: 
                            System.out.println("¡Opción inválida!");
                            break; 
                    }
                    break; 
                case 4: 
                    System.out.println("¿Cómo desea ver el inventario?");
                    System.out.println("\t1. Ver todo el inventario \n\t2. Ver el inventario ordenado por tipo");
                    int opInventary = sc.nextInt(); 
                    switch(opInventary){
                        case 1: 
                            toDo.showInventary(typeUserMap);
                            break; 
                        case 2: 
                            toDo.sortInventary(typeUserMap);
                            break; 
                        default: 
                            System.out.println("¡Opción inválida!");
                            break; 
                    }
                    break; 

                default: 
                    System.out.println("¡No has seleccionado una opción dentro del rango!");
                    break; 
            }
            System.out.println("¿Desea seguir realizando acciones?");
            System.out.println("\t1. Sí \n\t2. No");
            statusShop = sc.nextInt(); 
        } 
        System.out.println("¡Gracias por realizar compras!");
    }
}