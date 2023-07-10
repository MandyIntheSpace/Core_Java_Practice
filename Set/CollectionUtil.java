package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionUtil {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(7);
        numbers.add(10);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer no = it.next();
            System.out.println(no);
        }
    }
}
