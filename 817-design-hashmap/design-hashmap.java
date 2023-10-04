class MyHashMap {
    private int[] keys;
    private int[] values;
    private int capacity;

    public MyHashMap() {
        capacity = 1000000; // Set a reasonable capacity
        keys = new int[capacity];
        values = new int[capacity];
        Arrays.fill(keys, -1); // Initialize all keys to -1 (indicating empty)
    }

    public void put(int key, int value) {
        int index = hash(key);
        keys[index] = key;
        values[index] = value;
    }

    public int get(int key) {
        int index = hash(key);
        if (keys[index] == key) {
            return values[index];
        } else {
            return -1; // Key not found
        }
    }

    public void remove(int key) {
        int index = hash(key);
        if (keys[index] == key) {
            keys[index] = -1; // Mark the slot as empty
        }
    }

    private int hash(int key) {
        return key % capacity;
    }
}
