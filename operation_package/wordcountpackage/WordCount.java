package wordcountpackage;

public class WordCount {
    public static int wordCount(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }
}
