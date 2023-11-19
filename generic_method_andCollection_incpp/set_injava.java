import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class set_injava {
    public static void main(String[] args) {
        Collection<Integer> s = new TreeSet<>(); // stores in sorted manner.
        s.add(4);
        s.add(16);
        s.add(9);
        s.add(1);

        Iterator<Integer> it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        Collection<Integer> nums = new HashSet<>();
        nums.add(4);
        nums.add(8);
        nums.add(8);
        nums.add(4);
        nums.add(4);

        System.out.println(nums);  // set contains unique values only and not in sorted manner.
    }
}
