package Model;

import java.util.Map;

/**
 * @author 
 * Madeline Castro 22743 
 * Hoja de Trabajo #4 
 * Propósito: Creacion de Factory para distintas implementaciones de Map
 */

public class MapFactory {

    /**
     * Metodo que obtiene el tipo de mapa con el que desea trabajar el usuario 
     * @param userOp Opcion del usuario 
     * @return Mapa utilizado por el usuario 
     */
    public Map getTypeMap(int userOp){

        Map typeMap = null;  

        switch(userOp){

            case 1: 
                typeMap = new UserHashMap(); 
                break; 
            case 2: 
                typeMap = new UserTreeMap(); 
                break; 
            case 3: 
                typeMap = new UserLinkedHashMap(); 
                break;

            default: 
                typeMap = null; 
                System.out.println("¡Ha ocurrido un error!");
                break; 
        }
        return typeMap;
    }
}
