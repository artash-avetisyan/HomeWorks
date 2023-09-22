package dynamicarray;

public class dynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(45450);
        dynamicArray.add(125);
        dynamicArray.add(5452);
        dynamicArray.add(125);
        dynamicArray.add(0, 777);
        dynamicArray.exists(7771);
        dynamicArray.getIndexByValue(125);
        dynamicArray.print();

    }
}
