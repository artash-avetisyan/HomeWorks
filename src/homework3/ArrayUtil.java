package homework3;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 15, -3, 52, 8};

        // 1.Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով։
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }

        // 2.Տպել մասիվի առաջին էլեմենտը
        System.out.println(numbers[0]);

        //3.Տպել մասիվի վերջին էլեմենտը
        System.out.println(numbers[numbers.length - 1]);

        //4.Տպել մասիվի երկարությունը
        System.out.println(numbers.length);

        //5.Տպել մասիվի ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println(min);

        //6.Տպել մասիվի մեջտեղի թիվը, ստուգել որ 2-ից մեծ լինի երկարությունը, եթե փոքր կամ հավասար էղավ,
        // տպեք որ can't print middle values. եթե զույգ է մասիվի մեջի էլեմենտների թիվը, տպեք մեջտեղի երկու էլեմենտները,
        // եթե կենտ է մի հատը։
        if (numbers.length > 2) {
            int num = numbers.length / 2;
            if (numbers.length % 2 == 0) {
                System.out.println(numbers[num] + " " + numbers[num - 1]);
            } else {
                System.out.println(numbers[num]);
            }
        } else if (numbers.length <= 2) {
            System.out.println("can't print middle values");
        }

        //7.Հաշվել ու տպել մասիվում զույգերի քանակը։
        int sumCouples = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumCouples++;
            }
        }
        System.out.println(sumCouples);

        //8.Հաշվել ու տպել մասիվում կենտերի քանակը։
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sumOdd++;
            }
        }
        System.out.println(sumOdd);

        //9.Տպել մասիվում էլեմենտների գումարը։
        int sumOfElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfElements = sumOfElements + numbers[i];
        }
        System.out.println(sumOfElements);

        //10.Տպել մասիվում թվերի միջին թվաբանականը։
        int sumOfElement = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfElements = sumOfElements + numbers[i];
        }
        System.out.println(sumOfElements);
        System.out.println(sumOfElements / numbers.length);
    }
}
