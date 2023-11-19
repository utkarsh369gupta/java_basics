import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student implements Comparable<Integer>{
    int age;
    int name;
    public student(int age, int name) {
        this.age = age;
        this.name = name;
    }
    public int compareTo(student o) {
        if(age > o.age){
            return 1;
        }
        return -1;
    }

    @Override
    public int compareTo(Integer o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }


}

public class list_injava {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();
        col.add(5);

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                }
                return -1;
            }
        };

        Comparator<String> compst = new Comparator<String>() {
            public int compare(String i, String j) {
                if (i.length() > j.length()) {
                    return 1;
                }
                return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();   // in list indexing can be done.
        nums.add(233);
        nums.add(49);
        nums.add(112);
        nums.add(1);

        Collections.sort(nums, comp);

        List<String> st = new ArrayList<String>();
        st.add("utkarsh");
        st.add("boss");
        st.add("hello");
        st.add("gupta");

        Collections.sort(st, compst);

        System.out.println(nums);

    }
}
