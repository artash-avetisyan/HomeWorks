package dynamicarray;

public class DynamicArray {

    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք

    public void add(int value) {
        array[size] = value;
        size++;
        if (array.length == size) {
            extend();
        }
    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] newArray = new int[size * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index > size) {
            System.out.println("-1");
            return -1;
        }
        System.out.println(array[index]);
        return array[index];
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //ջնջել մասիվի index-երորդ էլեմենտը
    //եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.err.println("no such element exists");
            return;
        }
        int[] newArray = new int[size];
        int tmp = 0;
        for (int i = 0; i <= size; i++) {
            if (i == index) {
                size--;
                newArray[i] = array[tmp++];
            }
            newArray[i] = array[tmp++];
        }
        array = newArray;
    }

    //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
    //Հին արժեքը կկորի
    //եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։
    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.err.println("no such element exists");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (i == index) {
                array[i] = value;
            }
        }
    }

    //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։
    //Եթե չկա նման ինդեքս, տպել որ չկա
    public void add(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.err.println("no such element exists");
            return;
        }
        int[] newArray = new int[size + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = value;
        size++;
        for (int i = index + 1; i < size; i++) {
            newArray[i] = array[i - 1];
        }
        array = newArray;
    }

    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false
    public boolean exists(int value) {
        for (int el : array) {
            if (value == el) {
                System.out.println("True " + el);
                return true;
            }
        }
        System.out.println("False");
        return false;
    }

    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
    //եթե չկա, -1
    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }

}