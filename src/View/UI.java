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
    
    public void menuCompra() throws FileNotFoundException{

        int statusShop = 1; 

        String shopList = "C:\\Users\\ncast\\OneDrive\\Documentos\\Universidad\\Semestres\\Tercer Semestre\\Algoritmos y Estructura de Datos\\Hojas de Trabajo\\Hoja-de-Trabajo-6\\src\\ListadoProducto.txt"; 
        
        System.out.println("\n¡Bienvenido al mercado El Mero Mero!");
        System.out.println("¿Cómo qué implementación MAP desea realizar su compra?");
        System.out.println("\t1. HashMap");
        System.out.println("\t2. TreeMap");
        System.out.println("\t3. LinkedHashMap");

        int type = sc.nextInt(); 

        readFile.readShopList(mapFactory.getTypeMap(type), shopList);
        
        while(statusShop == 1){

            System.out.println("¿Qué le gustaría realizar hoy?");
            System.out.println("\t1. Agregar producto");
            System.out.println("\t2. Buscar producto por categoría");
            System.out.println("\t3. Ver lista de compras");
            System.out.println("\t4. Mostrar inventario");

            int op = sc.nextInt(); 

            switch(op){

                case 1: 

                    break; 
                case 2: 

                    break; 
                case 3:
                    System.out.println("¿Cómo desea ver la lista de compras?");
                    System.out.println("\t1. Ver toda la lista \n\t2. Ver la lista ordenada por tipo");
                    int opShopList = sc.nextInt(); 
                    
                    switch(opShopList){
                        case 1: 

                            break; 
                        case 2: 

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

                            break; 
                        case 2: 

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