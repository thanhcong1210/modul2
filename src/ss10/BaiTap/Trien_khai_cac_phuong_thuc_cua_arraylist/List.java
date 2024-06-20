package ss10.BaiTap.Trien_khai_cac_phuong_thuc_cua_arraylist;

import java.util.Arrays;

public class List<C> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 1;
    C[] elements;

    public List() {
        elements = (C[]) new Object[DEFAULT_CAPACITY];
    }

    public List(int capacity) {
        if (capacity > 0) {
            elements = (C[]) new Object[capacity];
        } else {
            throw new IndexOutOfBoundsException("capacity: " + capacity);
        }
    }

    public boolean add(C o) {
        if (size == elements.length) {
            ensureCapacity(DEFAULT_CAPACITY);
        }
        elements[size] = o;
        size++;
        return true;
    }

    public void add(int index, C element) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Index: " + index);
        } else if (size == elements.length) {
            ensureCapacity(DEFAULT_CAPACITY);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
            size++;
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacitty: " + minCapacity);
        }
    }

    public C remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (index == size - 1) {
            C temp = elements[index];
            elements[index] = null;
            size--;
            return temp;
        } else {
            C temp = elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
            return temp;
        }
    }

    public int size() {
        return size;
    }

    public boolean contains(C o) {
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(C o) {
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    public C get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index: " + index);
        } else {
            return elements[index];
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public List<C> clone() {
        List<C> v = new List<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = size;
        return v;
    }
}
