package homework2;

public class ForExamples {
    public static void main(String[] args) {
        //1.Տպել 1-ից 1000 թվերը իրար կողք, արանքում դնելով - սինվոլը։ Այնպես գրեք, որ վերջում - չլինի։
        for (int i = 0; i <= 1000; i++) {
            System.out.print(i);
            if (i < 1000) {
                System.out.print("-");
            }
        }
        System.out.println();
//        //2.Տպել 1-ից 100 թվերի մեջ ընկած զույգերը օգտագործելով % գործողությունը։
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //3.Հայտարարել թվերի մասիվ՝ int[] array = {2,5,8,4,9,3,7}, ֆոր- օգտագործելով գտնել մասիվի ամենամեծ թիվը ու տպել։
        int[] array = {512, 5, 25, 4, 9, 3, 22, 33};
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    num = array[i];
                    array[j] = num;

                }
            }
        }
        System.out.println(num);
    }
}
