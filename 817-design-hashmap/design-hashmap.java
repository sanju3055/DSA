class MyHashMap {

    // Node class to store key-value pairs
    private static class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10000;   // number of buckets
    private Node[] buckets;          // array of linked lists

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    // Helper: get the bucket index
    private int getBucketIndex(int key) {
        return key % SIZE;
    }

    // Helper: find the previous node of the target key in a linked list
    private Node find(Node head, int key) {
        Node prev = head;
        Node curr = head.next;
        while (curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }

    public void put(int key, int value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null)
            buckets[index] = new Node(-1, -1); // dummy head

        Node prev = find(buckets[index], key);
        if (prev.next == null) { // not found → insert new node
            prev.next = new Node(key, value);
        } else { // found → update value
            prev.next.value = value;
        }
    }

    public int get(int key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null)
            return -1;

        Node prev = find(buckets[index], key);
        if (prev.next == null)
            return -1;
        return prev.next.value;
    }

    public void remove(int key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null)
            return;

        Node prev = find(buckets[index], key);
        if (prev.next != null)
            prev.next = prev.next.next;
    }
}
