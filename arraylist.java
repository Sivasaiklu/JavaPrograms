import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add values
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // to get value at particular index
        int x = list.get(2);
        System.out.println(x);

        // to update or add values
        list.add(1, 1);
        System.out.println(list);

        // to set values
        list.set(3, 5);
        System.out.println(list);


        // remove values
        list.remove(3);
        System.out.println(list);

        // to get size
        int size = list.size();
        System.out.println(size);

        list.add(10);
        list.add(9);
        list.add(24);
        list.add(14);

        System.out.println(list);

        // to sort values
        Collections.sort(list);
        System.out.println(list);

        // looping in arraylist
        for (var val : list) {
            System.out.print(val + " ");
        }

    }
}
