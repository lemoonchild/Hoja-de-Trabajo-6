package Model;

import java.util.Map;

import Controller.ListToMap;


public class MapFactory {

    ListToMap mapselected = new ListToMap(); 

    public Map getTypeMap(String ShopListpath, int userOp){

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
