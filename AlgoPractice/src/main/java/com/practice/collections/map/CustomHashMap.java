package com.practice.collections.map;

public class CustomHashMap<K,V> {
	
	Entry[] table = null;
	int size = 0;
	
	class Entry<K,V> {
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}

	public CustomHashMap() {
		table = new Entry[16];
	}
	
	public void put(K key, V value) {
		int hash = hash(key);
		Entry node = new Entry(key, value);
		if(table[hash] == null) {
			table[hash] = node;
		} else {
			Entry currNode = table[hash];
			
			if(key.equals(currNode.key)) {
				node.next = currNode.next;
				currNode = node;
				return;
			}
			
			while(currNode.next != null) {
				if(key.equals(currNode.key)) {
					node.next = currNode.next;
					currNode = node;
					return;
				}
				currNode = currNode.next;
			}
			currNode.next = node;
		}
		size++;
	}
	
	public int hash(K key) {
		return key.hashCode()%16;
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		
		CustomHashMap<Integer, String> map = new CustomHashMap<>();
		
		map.put(1, "Subbu");
		System.out.println(map.size);

		map.put(2, "VVS");
		System.out.println(map.size);
		
		map.put(17, "Raju");
		System.out.println(map.size);
		
		map.put(1, "KAS");
		System.out.println(map.size);
		
	}

}
