public class List {
  private Node first;

  public List() {
    first = null;
  }

  public void setFirst(int value) {
    Node newFirst = new Node();
    newFirst.setValue(value);
    newFirst.setNext(first);
    first = newFirst;
  }

  public void setAfter(Node node, int value) {
    Node current = new Node();
    Node currentNext = node.getNext();
    current.setValue(value);
    current.setNext(currentNext);
    node.setNext(current);
  }

  public void setLast(int value) {
    if (isEmpty()) {
      System.out.println("\nA lista está vazia.");
      return;
    }

    Node oldLast = null;
    Node next = first;
    while (next != null) {
      oldLast = next;
      next = next.getNext();
    }
    Node newLast = new Node();
    newLast.setValue(value);
    oldLast.setNext(newLast);
  }

  public void removeFirst() {
    if (isEmpty()) {
      System.out.println("A lista está vazia.");
      return;
    }
    Node newFirst = first.getNext();
    first = newFirst;
  }

  public void remove(Node node) {
    Node previous = first;
    Node current = first.getNext();

    if (node == previous) {
      first = null;
      return;
    }

    while (node != current) {
      previous = current;
      current = current.getNext();
    }

    previous.setNext(current.getNext());
  }

  public void removeLast() {
    if (isEmpty()) {
      System.out.println("\nA lista está vazia.");
      return;
    }
    Node newLast = first;
    Node last = first.getNext();

    if (last == null) {
      first = null;
      return;
    }

    while (last.getNext() != null) {
      newLast = last;
      last = last.getNext();
    }
    newLast.setNext(null);
  }

  public void list() {
    if (isEmpty()) {
      System.out.println("A lista está vazia.");
      return;
    }
    int iterator = 0;
    Node current = first;
    while (current != null) {
      String divChar = iterator == 0 ? "->" : "|";
      System.out.print(String.format("%s %d ", divChar, current.getValue()));
      current = current.getNext();
      iterator++;
    }
    System.out.print('\n');
  }

  public Node findNodeByIndex(int index) {
    int iterator = 0;
    Node current = first;
    while (iterator != index && current != null) {
      current = current.getNext();
      iterator++;
    }
    return current;
  }

  private boolean isEmpty() {
    return first == null;
  }

}
