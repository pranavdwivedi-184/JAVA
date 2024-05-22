import java.util.ArrayList;
import java.util.Collections;

public class ArrayLissst {
    public static void main(String[] args) {
        System.out.println("\033[h\033[2J");
        // array list
        /*
         * ArrayList obj = new ArrayList<>();
         * obj.add(12);
         * obj.add("pranav");
         * System.out.println(obj);
         */

        // ArrayList<Integer> obj = new ArrayList<>();
        // obj.add(3);
        // obj.add(19);
        // obj.add(89);

        // System.out.println(obj.get(1));

        ArrayList<String> car = new ArrayList<>();
        car.add("dodge challenger");
        car.add("rolls royce");
        car.add("ford mustang");
        car.add("phantom");
        car.add("audi");
        // car.add(0, "nano");

        for (String i : car) {
            System.out.println(i);

        }

        System.out.println("-----------");

        Collections.sort(car);

        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i));
        }

    }
}
