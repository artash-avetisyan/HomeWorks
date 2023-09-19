package dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(55);
        dynamicArray.add(55);
        dynamicArray.add(55);
        dynamicArray.add(55);
        dynamicArray.getByIndex(1);
        dynamicArray.print();

    }
}