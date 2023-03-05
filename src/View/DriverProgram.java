package View;

import java.io.FileNotFoundException;

/**
 * @author 
 * Madeline Castro 22743 
 * Hoja de Trabajo #4 
 * Propósito: Driver del programa 
 */

public class DriverProgram {
    
    /**
     * Main del programa 
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        UI userShop = new UI(); 

        userShop.menuCompra();
    }
}
