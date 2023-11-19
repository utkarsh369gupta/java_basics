public class jagged_array {
    public static void main(String[] args) {
        String[][] st = new String[][] { new String[] { "Anu", "Priya", "Tina" },
                new String[] { "Abarna", "Zara", "Beena", "Ajay", "Java" }, new String[] { "Vishnu" },
                new String[] { "Mohan", "abijith", "Tom", "Vijay" }, new String[] { "Riya", "Yazhini" } };
        for (int i = 0; i < st.length; i++) {
            int max = st[i][0].length();
            String m = st[i][0];
            for (int j = 0; j < st[i].length; j++) {
                if (st[i][j].length() > max) {
                    max = st[i][j].length();
                    m = st[i][j];
                }
            }
            System.out.println(m);
        }
    }
}
