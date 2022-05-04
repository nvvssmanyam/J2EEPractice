package com.practice.collections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoadFactorOnMaps {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalAccessException, NoSuchMethodException {
		
		Map<Integer, Integer> map = new HashMap<>();

		Field tableField = map.getClass().getDeclaredField("table");
		tableField.setAccessible(true);
		Object[] table = (Object[]) tableField.get(map);
		
		Method capacityMethod = map.getClass().getDeclaredMethod("capacity", null);
		capacityMethod.setAccessible(true);
		System.out.println(capacityMethod.getReturnType());
		System.out.println("Capacity :: "+capacityMethod);
		System.out.println("Table length :: "+ (table == null ? 0 : table.length));
		
		
		int key = 1;
		for(int i=0; i<9; i++) {
			map.put(key, key);
			key = key+16;
			
			if(i==5) {
				table = (Object[]) tableField.get(map);
				System.out.println("Table length :: "+ (table == null ? 0 : table.length));
			}
			
			System.out.println("Hash of key : "+key+" is : "+hash(key));
		}
		
		table = (Object[]) tableField.get(map);
		System.out.println("Table length :: "+ (table == null ? 0 : table.length));

		System.out.println(map);
		
	}
	
	private static int hash(Object key) {
        int h;
        System.out.println("Hash of key "+ key + " and hash :: "+ ((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16)));
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

}
