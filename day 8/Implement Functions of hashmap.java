import java.util.*;

class MyHashMap<K, V> {

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V>[] buckets;
    private int size;
    private static final int CAPACITY = 16;

    public MyHashMap() {
        buckets = new Node[CAPACITY];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public void create(K key, V value) {
        insert(key, value);
    }

    public void insert(K key, V value) {
        int index = hash(key);
        Node<K, V> current = buckets[index];

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        Node<K, V> current = buckets[index];

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    public V getOrDefault(K key, V defaultValue) {
        V value = get(key);
        return value != null ? value : defaultValue;
    }

    public boolean exists(K key) {
        return get(key) != null;
    }

    public V remove(K key) {
        int index = hash(key);
        Node<K, V> current = buckets[index];
        Node<K, V> previous = null;

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                size--;
                return current.value;
            }

            previous = current;
            current = current.next;
        }

        return null;
    }

    public int size() {
        return size;
    }

    public List<K> keys() {
        List<K> result = new ArrayList<>();

        for (Node<K, V> bucket : buckets) {
            Node<K, V> current = bucket;

            while (current != null) {
                result.add(current.key);
                current = current.next;
            }
        }

        return result;
    }

    public List<V> values() {
        List<V> result = new ArrayList<>();

        for (Node<K, V> bucket : buckets) {
            Node<K, V> current = bucket;

            while (current != null) {
                result.add(current.value);
                current = current.next;
            }
        }

        return result;
    }

    public List<Map.Entry<K, V>> entries() {
        List<Map.Entry<K, V>> result = new ArrayList<>();

        for (Node<K, V> bucket : buckets) {
            Node<K, V> current = bucket;

            while (current != null) {
                result.add(new AbstractMap.SimpleEntry<>(current.key, current.value));
                current = current.next;
            }
        }

        return result;
    }

    public void clear() {
        buckets = new Node[CAPACITY];
        size = 0;
    }

    public static void main(String[] args) {

        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.create("Annu", 90);
        map.insert("Rahul", 85);
        map.insert("Aman", 95);

        System.out.println(map.get("Annu"));
        System.out.println(map.getOrDefault("XYZ", 0));
        System.out.println(map.exists("Rahul"));
        System.out.println(map.remove("Aman"));
        System.out.println(map.size());
        System.out.println(map.keys());
        System.out.println(map.values());
        System.out.println(map.entries());

        map.clear();

        System.out.println(map.size());
    }
}