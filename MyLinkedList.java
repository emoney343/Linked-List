public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int size() { 
        return size; 

    }
    public boolean isEmpty() { 
        return size == 0; 
    }

    public Node getHead() { 
        return head; 
    }

    public void addLast(Obj value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        size++;
    }

    public void addFirst(Obj value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void add(int index, Obj value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + size);
        }
        if (index == 0) { 
            addFirst(value); return; 
        }
        if (index == size) { 
            addLast(value); return; 
        }

        Node nodeBefore = getNode(index - 1);
        Node newNode = new Node(value);

        newNode.setNext(nodeBefore.getNext());
        nodeBefore.setNext(newNode);

        size++;
    }

    public Obj get(int index) {
        return getNode(index).getData();
    }

    public Obj removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + (size - 1));
        }

        if (index == 0) {
            Obj removed = head.getData();
            head = head.getNext();
            size--;
            return removed;
        }

        Node prev = getNode(index - 1);
        Node toRemove = prev.getNext();
        prev.setNext(toRemove.getNext());
        size--;
        return toRemove.getData();
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + (size - 1));
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        int i = 0;

        while (current != null) {
            sb.append(i)
              .append(": ")
              .append(current.getData())
              .append("\n");

            current = current.getNext();
            i++;
        }

        return sb.toString();

    }
}