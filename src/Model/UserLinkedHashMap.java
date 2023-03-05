package Model;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UserLinkedHashMap implements Map {

    public LinkedHashMap<Object, Object> myLinkedHashMap; 

    public UserLinkedHashMap(){
        myLinkedHashMap = new LinkedHashMap<>();
    }
    @Override
    public int size() {
        return myLinkedHashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return myLinkedHashMap.isEmpty(); 
    }

    @Override
    public boolean containsKey(Object key) {
        return myLinkedHashMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return myLinkedHashMap.containsValue(value); 
    }

    @Override
    public Object get(Object key) {
        return myLinkedHashMap.get(key); 
    }

    @Override
    public Object put(Object key, Object value) {
        return myLinkedHashMap.put(key, value); 
    }

    @Override
    public Object remove(Object key) {
        return myLinkedHashMap.remove(key); 
    }

    @Override
    public void putAll(Map m) {
        myLinkedHashMap.putAll(m);
    }

    @Override
    public void clear() {
        myLinkedHashMap.clear();
    }

    @Override
    public Set keySet() {
        return myLinkedHashMap.keySet(); 
    }

    @Override
    public Collection values() {
        return myLinkedHashMap.values(); 
    }

    @Override
    public Set entrySet() {
       return myLinkedHashMap.entrySet(); 
    }
    
}