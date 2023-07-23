package com.practice.collections;

public class CustomHashMap<K, V> {

	private static final int INITIAL_CAPACITY = 16;
	private int size = 0;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public CustomHashMap() {
		table = new Entry[INITIAL_CAPACITY];
	}

	private Entry<K, V>[] table;

	public void put(K key, V value) {

		Entry<K, V> newEntry = new Entry<K, V>(key, value, null);
		int hash = hash(key);
		if (table[hash] == null) {
			table[hash] = newEntry;
			size++;
		} else {
			Entry<K, V> currentEntry = table[hash];
			while (currentEntry != null) {
				if (currentEntry.key.equals(newEntry.key)) {
					newEntry.next = currentEntry.next;
					currentEntry = newEntry;
				} else {
					if (currentEntry.next == null) {
						currentEntry.next = newEntry;
						size++;
					}
				}
				currentEntry = currentEntry.next;
			}
		}

	}

	public V get(K key) {
		int hash = hash(key);

		if (table[hash] != null) {
			Entry<K, V> currentEntry = table[hash];
			while (currentEntry != null) {
				if (currentEntry.key.equals(key)) {
					return currentEntry.value;
				}
				currentEntry = currentEntry.next;
			}
		}

		return null;
	}

	public boolean remove(K key) {
		int hash = hash(key);

		if (table[hash] != null) {
			Entry<K, V> currentEntry = table[hash];
			Entry<K, V> previous = null;
			while (currentEntry != null) {
				if (currentEntry.key.equals(key)) {
					if (previous == null) { // got element in first place
						table[hash] = currentEntry.next;
						size--;
						return true;
					} else {
						previous.next = currentEntry.next;
						size--;
						return true;
					}
				}
				previous = currentEntry;
				currentEntry = currentEntry.next;
			}
		}

		return false;
	}

	private int hash(Object key) {
		return key != null ? key.hashCode() % 16 : 0;
	}

	public int size() {
		return size;
	}

}