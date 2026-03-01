public class Node {
    private Obj data;
    private Node next;

    public Node(Obj data) {
        this.data = data;
        this.next = null;
    }

    public Obj getData() {
    return data;
}

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
