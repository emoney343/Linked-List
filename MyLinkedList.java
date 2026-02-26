public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public Node getHead() { return head; }

    public void addLast(Obj value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public void addFirst(Obj value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void add(int index, Obj value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + size);
        }
        if (index == 0) { addFirst(value); return; }
        if (index == size) { addLast(value); return; }

        Node nodeBefore = getNode(index - 1);
        Node newNode = new Node(value);
        newNode.next = nodeBefore.next;
        nodeBefore.next = newNode;
        size++;
    }

    public Obj get(int index) {
        return getNode(index).data;
    }

    public Obj removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + (size - 1));
        }

        if (index == 0) {
            Obj removed = head.data;
            head = head.next;
            size--;
            return removed;
        }

        Node prev = getNode(index - 1);
        Node toRemove = prev.next;
        prev.next = toRemove.next;
        size--;
        return toRemove.data;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + (size - 1));
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}