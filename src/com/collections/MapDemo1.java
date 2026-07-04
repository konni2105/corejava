package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 MAP: map consists entity i.e {key=value}
   -when ever we want to represent keyvalue pairs we choose MAP interface
   -we use put method to add the values with keys
   -map is not a sub interface of collection inetrface 
   -one of the imp concept in collections frame work to add key value pairs
   - key can be anything value can be anything if u not use generic types but key must be unique values can be duplicate
  - not follow insertion order
  map implemented classes are:
  		-HashMap
  		-LinkedHshMap
  		-IdentityHashMap
  		-weakHashMap
  		-ConcurrentHashMap
  		
  Hashtable in maps:
  			-map will not allow dupli keys but allow dupli values
  			-null insertion for key possible only once but for values we can pass any numbr of times.
  			-homo & hetro elemts are allowed.
  			
  		
                          
   
 
 */
public class MapDemo1 {

	public static void main(String[] args) {
	/*	Map m=new HashMap();
		m.put("A", "Apple");
		m.put(1,101);
		m.put("B", 102);
		m.put(103, "C");
		m.put(1, "c");
		System.out.println(m); */
		
		
		/*class Node<K,V> {
		    int hash;
		    K key;
		    V value;
		    Node<K,V> next; // for collisions
			}*/
		
		
		Map<String,String> states=new HashMap<>();
		states.put("TG", "TELANGANA");
		states.put("AP", "ANDHRA PRADESH");
		states.put("MP", "MADHYA PRADESH");
		states.put("RJ", "RAJASTHAN");
		states.put("UP", "UTTAR PRADESH");
		states.put("WB", "WEST BENGAL");
		states.put("PB", "PUNJAB");
		states.put("HR", "HARYANA");
		states.put("OR", "ODISHA");
		states.put("AS", "ASSAM");
		states.put("JH", "JHARKHAND");
		states.put("BR", "BIHAR");
		states.put("HP", "HIMACHAL PRADESH");
		
		System.out.println(states);//o/p stores based on hashing(bucket),not order

		System.out.println(states.containsKey("HR"));//true
		System.out.println(states.containsValue("ASSAM"));//true
		System.out.println(states.containsValue("GR"));//false
		
		Set<Entry<String,String>> entries=states.entrySet();
		
		for(Entry<String,String> entry : entries) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
	}

}
