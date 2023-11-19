package mostfrequentpackage;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    public static char mostFrequent(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Text cannot be null or empty.");
        }

        char[] chars = text.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : chars) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentChar;
    }
}