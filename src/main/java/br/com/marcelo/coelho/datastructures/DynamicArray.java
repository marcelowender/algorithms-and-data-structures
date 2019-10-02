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

        //The insert algorithm consists in run the array in a kind of reverse mode
        //The intention here is copy up all elements
        for (int j = size; j > index; j--) {
            data[j] = data[j-1];
        }

        //Do the insert
        data[index] = value;
        size++;

    }

    public void delete(int index) {
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains() {
        return false;
    }

    public void resize() {
    }

    public int size() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                break;
            }
            size++;
        }
        return size;
    }

    public void add() {


    }
}
