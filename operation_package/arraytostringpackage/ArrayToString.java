package arraytostringpackage;

public class ArrayToString {
    public static String arrayToString(char[] charArray) {
        if (charArray == null || charArray.length == 0) {
            return "";
        }
        return new String(charArray);
    }
}