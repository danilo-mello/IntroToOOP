package collections.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class MyArrayList implements List, RandomAccess {
  private static final int DEFAULT_SIZE = 10;
  private Object[] elementData;
  private int size;

  public MyArrayList() {
    elementData = new Object[DEFAULT_SIZE];
    size = 0;
  }

  public MyArrayList(int initialCapacity) {
    if (initialCapacity >= 0) {
      elementData = new Object[initialCapacity];
    } else {
      throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
    }
  }

  public MyArrayList(Collection c) {
    elementData = c.toArray();
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(Object o) {
    if (isEmpty()){
      return false;
    } else {
      for (int i = 0; i < size; i++) {
        if (elementData[i] == o) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Iterator iterator() {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public Object[] toArray() {
    return elementData;
  }

  @Override
  public Object[] toArray(Object[] a) {
    // DO NOT NEED TO IMPLEMENT
    return new Object[0];
  }

  @Override
  public boolean add(Object o) {
    if (size == elementData.length) {
      elementData = grow(elementData.length);
    }
    elementData[size] = o;
    size++;
    return true;
  }

  private Object[] grow(int minCapacity) {
    return elementData = Arrays.copyOf(elementData, minCapacity + minCapacity / 2);
  }

  @Override
  public boolean remove(Object o) {
    if (contains(o)) {
      int index = 0;
      for (int i = 0; i < size; i++) {
        if (elementData[i] == o) {
          index = i;
        }
      }
      for (int i = index; i < size - 1; i++) {
        elementData[i] = elementData[i + 1];
      }
      elementData[size - 1] = null;
      size--;
      return true;
    }
    return false;
  }

  @Override
  public boolean containsAll(Collection c) {
    boolean flag = false;

    for (Object o : c.toArray()) {
      if (c.contains(o)) {
        flag = true;
      } else {
        return false;
      }
    }
    return flag;
  }

  @Override
  public boolean addAll(Collection c) {
    for (Object o : c.toArray()) {
      add(o);
    }
    return true;
  }

  @Override
  public boolean addAll(int index, Collection c) {
    for (Object o : c.toArray()) {
      add(index, o);
      index++;
    }
    return true;
  }

  @Override
  public boolean removeAll(Collection c) {
    for (Object o : c.toArray()) {
      remove(o);
    }
    return true;
  }

  @Override
  public boolean retainAll(Collection c) {
    for(Object o : c.toArray()) {
      if(!c.contains(o)) {
        remove(o);
      }
    }
    return true;
  }

  @Override
  public void clear() {
    for (int i = 0; i < size; i++) {
      elementData[i] = null;
    }
  }

  @Override
  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    return elementData[index];
  }

  @Override
  public Object set(int index, Object element) {
    Object temp;
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    } else {
      temp = elementData[index];
      elementData[index] = element;
    }
    return temp;
  }

  @Override
  public void add(int index, Object element) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    } else {
      for (int i = elementData.length - 1; i > index; i--) {
        elementData[i] = elementData[i - 1];
      }
      elementData[index] = element;
    }
  }

  @Override
  public Object remove(int index) {
    for (int i = index; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }
    elementData[size - 1] = null;
    size--;
    return null;
}

  @Override
  public int indexOf(Object o) {
    for (int i = 0; i < size; i++) {
      if (elementData[i] == o) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public int lastIndexOf(Object o) {
    for (int i = size - 1; i >= 0; i--) {
      if (elementData[i] == o) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public ListIterator listIterator() {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public ListIterator listIterator(int index) {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public List subList(int fromIndex, int toIndex) {
    if (fromIndex < 0|| toIndex > size) {
      throw new IndexOutOfBoundsException();
    }
    if (fromIndex > toIndex) {
      throw new IllegalArgumentException();
    }
    List<Object> sublist = new ArrayList<Object>();
    for (int i = fromIndex; i < toIndex; i++) {
      sublist.add(elementData[i]);
    }
    return sublist;
  }

}