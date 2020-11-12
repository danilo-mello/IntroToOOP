package collections.list;

import java.util.NoSuchElementException;

/**
 * Singly Linked-list (generic)
 */
public class MyLinkedList<E> {

  private Node<E> head, tail; // null
  private int size; // 0

  public MyLinkedList() { }

  // O(1)
  public void addFirst(E e) {
    final Node<E> h = head;
    final Node<E> newNode = new Node<>(e, h);
    head = newNode;
    if (h == null) {
      // adding a new node to the empty linked list
      tail = newNode;
    }
    size++;
  }

  // O(1)
  public void addLast(E e) {
    final Node<E> t = tail;
    final Node<E> newNode = new Node<>(e, null);
    tail = newNode;
    if (t == null) {
      head = newNode;
    } else {
      t.next = newNode;
    }
    size++;
  }

  // O(N)
  public void add(int index, E e) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
    }
    if (index == 0) {
      addFirst(e);
    } else if (index == size) {
      addLast(e);
    } else {
      Node<E> cur = head;
      for (int i = 0; i < index - 1; i++) {
        cur = cur.next;
      }
      cur.next = new Node<>(e, cur.next);
      size++;
    }
  }

  // O(1)
  public E removeFirst() {
    final Node<E> h = head;
    if (h == null) {
      throw new NoSuchElementException("list is empty");
    }

    E data = h.data;
    Node<E> next = h.next;
    h.data = null;
    h.next = null;
    head = next;
    if (next == null) {
      // only one element in the list
      tail = null;
    }
    size--;
    return data;
  }

  // O(1)
  public E removeLast() {
    if (tail == null) {
      throw new NoSuchElementException("list is empty");
    }
    E elem = tail.data;
    tail = getNodeAt(size - 2);
    tail.next = null;
    size--;
    return elem;
  }

  // O(1)
  public E getFirst() {
    if (head == null) {
      throw new NoSuchElementException("list is empty");
    }
    return head.data;
  }

  // O(1)
  public E getLast() {
    if (tail == null) {
      throw new NoSuchElementException("list is empty");
    }
    return tail.data;
  }

  private Node<E> getNodeAt(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
    }
    Node<E> cur = head;
    for (int i = 0; i < index; i++) {
      cur = cur.next;
    }
    return cur;
  }

  // O(N)
  public E get(int index) {
    return getNodeAt(index).data;
  }

  // O(N)
  public E set(int index, E e) {
    Node<E> cur = getNodeAt(index);
    E oldValue = cur.data;
    cur.data = e;
    return oldValue;
  }

  // O(N)
  public int indexOf(E e) {
    int index = 0;
    if (e == null) {
      for (Node<E> x = head; x != null; x = x.next) {
        if (x.data == null) {
          return index;
        }
        index++;
      }
    } else {
      for (Node<E> x = head; x != null; x = x.next) {
        if (e.equals(x.data)) {
          return index;
        }
        index++;
      }
    }
    return -1;
  }


  public boolean remove(E e) {
    int index = indexOf(e);
    return remove(index);
  }


  public boolean remove(int index) {
    if (head == null) {
      throw new NoSuchElementException("list is empty");
    }
    Node<E> copyNode = getNodeAt(index);

    Node<E> cur = head;
    if (index != 0) {
      for (int i = 0; i < index - 1; i++) {
        cur = cur.next;
      }
      cur.next = copyNode.next;

      copyNode.data = null;
      copyNode.next = null;
    } else {
      head = cur.next;
      cur.next = null;
    }
    if (cur.next == null) {
      tail = cur;
    }
    size--;
    return true;
  }

  public int lastIndexOf(E e) {
    int index = -1;
    int c = 0;
    for (Node<E> element = head; element != null; element = element.next) {
      if (element.data.equals(e)) {
        index = c;
      }
      c++;
    }
    return index;
  }

  /**
   * Reverses the current linked list
   * "A" -> "B" -> "C" -> null
   * should be
   * "C" -> "B" -> "A" -> null
   */
  public void reverse() {
    if (head == null || tail == null) {
      throw new NoSuchElementException("list is empty");
    }
    for (int i = size - 2; i >= 0; i--) {
      E data = getNodeAt(i).data;
      addLast(data);
    }
    for (int i = 0; i < size - 1; i++) {
      removeFirst();
    }
  }

  // O(N)
  public boolean contains(E e) {
    return indexOf(e) >= 0;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    for (Node<E> x = head; x != null; x = x.next) {
      s.append(x.data).append(" -> ");
    }
    s.append("null");
    return s.toString();
  }

  public int size() {
    return size;
  }

  // static nested class
  public static class Node<E> {
    E data;
    Node<E> next;

    public Node(E item, Node<E> next) {
      this.data = item;
      this.next = next;
    }
  }
}