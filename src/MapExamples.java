import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExamples {
    public static void main (String[] args) throws FileNotFoundException {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Buy");
        map.put(3, "World");
        System.out.println(map);
        String oldValue = map.put(1, "vgbsdfbdfb");
        System.out.println(map);

        Scanner sc = new Scanner( new File( "input.txt"));
        int n = sc.nextInt();
        Map<Integer, Integer> dayToTempereture = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int temper = sc.nextInt();
            dayToTempereture.put (day, temper);
            System.out.println(sc.nextInt() + " " + sc.nextInt());

        }
    }
}
