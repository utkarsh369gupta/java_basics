import arraytostringpackage.ArrayToString;
import mostfrequentpackage.MostFrequent;
import wordcountpackage.*;

public class Operations {
    public static void main(String[] args) {
        String text = "This is a sample text for demonstration purposes.";
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        // Word Count
        int wordCount = WordCount.wordCount(text);
        System.out.println("Word Count: " + wordCount);

        // Array to String
        String charArrayAsString = ArrayToString.arrayToString(charArray);
        System.out.println("Array to String: " + charArrayAsString);

        // Most Frequent Character
        char mostFrequentChar = MostFrequent.mostFrequent(text);
        System.out.println("Most Frequent Character: " + mostFrequentChar);
    }
}