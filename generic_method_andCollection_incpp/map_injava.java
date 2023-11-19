
import java.util.HashMap;
import java.util.Map;

public class map_injava {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("utkarsh", 45);
        marks.put("boss", 50);
        marks.put("bro", 55);


        System.out.println(marks);  // order does not matters

        for(String i: marks.keySet()){
            System.out.println(marks.get(i));
        }
    }
}
