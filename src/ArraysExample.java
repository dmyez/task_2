public class ArraysExample {
    public static void main (String[] args) {
        int [] a = new int [10];

        System.out.println(a [4]);
        a[4] = 123;
        System.out.println(a [4]);
        a[4] ++;
        System.out.println(a [4]);
        int value = a[1] + a[3]  + a[4];
        System.out.println(value);

        int [] temp = new int [365];
        for (int i=0; i < temp.length; i++) {
     //       temp[i] = r.nextInt ( bound: 40);
        }
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        System.out.println(" sum of elements: " + sum);

    }
}
