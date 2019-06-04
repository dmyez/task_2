import java.util.ArrayList;
import java.util.Random;

public class Task_4 {
    public static void main (String[] args) {
        ArrayList<Integer> data = new ArrayList<>();

        Random r = new Random();
        int n = 15;
        int a = 5;

        for (int i =0; i < n; i++) {
            data.add(r.nextInt( 10));
    }
        System.out.println(data);

        if ( a == n ){

            System.out.println( a );
        }


        }
}
