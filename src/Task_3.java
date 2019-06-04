
public class Task_3 {
    public static void main (String[] args) {
        int a = 6;
        int b = 3;
        int result = sum (a, b) ;
        int result_1 = sub (a, b);
        int result_2 = multi (a, b);
        int result_3 = div (a, b);
        int []c = {2,5,4,6,5,5,5,};



        System.out.println(result);
        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);

        System.out.println(sumOfElements(c));
    }
    public static int sum (int a, int b) {
        return a + b;
    }
    public static int sub (int a, int b) {
        return a - b;
    }

    public static int multi ( int a, int b){
            return a * b;
    }

    public static int div ( int a, int b){
            return a / b;
    }
// Второе задание сумма элементов массива
    public static int sumOfElements (int [] a) {

        int sum = 0;                               // элемент накапливающий сумму
        for (int i = 0; i < a.length; i++) {       // цикл для переборов всех элементов масива



            sum += a[i];}


            return sum;
        }


}
