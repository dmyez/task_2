import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        int number = 123;
        System.out.println(number);
        number = 1234;
        System.out.println(number);

        double range = 123.113113;
        System.out.println(range);

        boolean flag = true;
        boolean anotherFlag = false;

        int a = 12;
        int b = 24;

        int summa = a + b + 12;
        System.out.println(summa);

        int sub = a - b;
        System.out.println(sub);

        int div = b / a;
        System.out.println(div);

        int mod = a % b;
        System.out.println(mod);

        double first = 1; // дробь //
        double second = 3;
        System.out.println(first / second);

        Math.abs(-1232);
        System.out.println(Math.round(123.2215));
        System.out.println(Math.floor(123.888 * 100.0) / 100.0);

        int x = 4;
        int value = x * x + 2 * x + 1;
        System.out.println(value);

        String name = "Dmitriy";
        String welcome = " Welcome";

        System.out.println(name + welcome);

        String substring = welcome.substring(2, 4); // вывод символа с 2 по 4 индекс ( 2 искл. 4 вкл.)//
        System.out.println(substring);

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
        String firstWord = sc.next();
        int nextNumber = sc.nextInt();
        System.out.println(firstWord + " " + nextNumber);

        MethodsExample example = new MethodsExample();
        System.out.println(MethodsExample.f(x));

    }
}