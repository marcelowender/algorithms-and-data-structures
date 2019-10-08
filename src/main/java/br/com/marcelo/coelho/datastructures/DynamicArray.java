package br.com.marcelo.coelho.datastructures;

public class DynamicArray<T> {

    private Object[] data;
    private int size;
    private int initialCapacity;


    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    //The main feature in arrays is the randon access with the order O(1)
    public T get(int index) {
        return (T) data[index];
    }

    //The main feature in arrays is the randon access with the order O(1)
    public void set(int index, T value) {
        this.data[index] = value;
    }

    public void insert(int index, T value) {
        //Check the size
        if (size == initialCapacity) {
            resize();
        }
        //The insert algorithm consists in run the array in a kind of reverse mode
        //The intention here is copy up all elements
        for (int j = size; j > index; j--) {
            data[j] = data[j - 1];
        }

        //Do the insert
        data[index] = value;
        size++;

    }

    public void delete(int index) {
        for (int j = index; j < size; j++) {
            data[j] = data[j + 1];
        }
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T value) {
        for (Object objValue : data) {
            return value.equals(objValue);
        }
        return false;
    }

    public void resize() {
        int newCapacity = initialCapacity * 2;
        Object[] newData = new Object[newCapacity];
        for (int i = 0; i < initialCapacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = newCapacity;

    }

    public int size() {
        return size;
    }

    public void add(T value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = value;
                size++;
                break;
            }
        }


    }
}
