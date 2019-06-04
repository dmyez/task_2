import java.util.Scanner;

public class CyclesExample {

    public static void main(String[] args) {

        int sum = 1;

        for (int i = 1; i <= 10; i++) {

            System.out.println(sum);

            sum = sum * i ;

        }
        System.out.println(sum);
    }
}
