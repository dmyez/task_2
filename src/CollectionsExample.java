import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class CollectionsExample {
    public static void main (String[] args) {
        LinkedList<Integer> data = new LinkedList<>();
        System.out.println("Internal size = " + data.size());
        Random r = new Random();
        int n = 15;
        for (int i =0; i < n; i++) {
            data.add(r.nextInt( 10));
        }
        System.out.println(data);

        int sum = 0;
        for ( int i = 0; i < data.size(); i++) {
            sum += data.get(i); // data [i}
        }
        System.out.println(sum);

        sum = 0;
        for (Integer element : data) {
            sum += element;
            System.out.println(element);
        }
        boolean result = false;
        for (Integer curent : data) {
      //) {
      //      return true;

            }
        }
}
