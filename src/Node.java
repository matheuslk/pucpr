public class Node {
  private Integer value;
  private Node next;

  public Node() {
    value = null;
    next = null;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

}
