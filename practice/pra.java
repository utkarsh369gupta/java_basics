// class newclass{
//     int n;
//     public void hi(){
//         System.out.println("hello, utkarsh boss");
//     }
// }
// public class pra {
//     public static void main(String[] args) {
//         System.out.println("hello");
//         newclass obj = new newclass();
//         obj.hi();
//     }
// }

// import java.util.List;

// public class pra {
//     public static void main(String[] args) {

//         // StringBuffer sb1 = new StringBuffer("java");
//         // StringBuffer sb2 = new StringBuffer("java");
//         // boolean stmt1 = sb1.equals(sb2);
//         // boolean stmt2 = sb1 == sb2;
//         // String s1 = new String("java");
//         // String s2 = new String("java");
//         // boolean stmt3 = s1.equals(s2);
//         // boolean stmt4 = s1 == s2;
//         // System.out.println(stmt1);
//         // System.out.println(stmt2);
//         // System.out.println(stmt3);
//         // System.out.println(stmt4);

//     }
// }

// import java.util.*;
// class pra {
//     public void printVarargs(String... names) {
//         System.out.println(Arrays.toString(names));
//     }

//     public void printArray(String[] names) {
//         System.out.println(Arrays.toString(names));
//     }

//     public void stormy() {
//         printVarargs("Arlene");
//         printVarargs(new String[] { "Bret" });
//         printVarargs(null);
//         // printArray("Cindy");
//         printArray(new String[] { "Don" });
//         printArray(null);
//     }
// }
// package threater;
// class Cinema {
//     private String name = "Sequel";

//     public Cinema(String name) {
//         this.name = name;
//     }
// }

// public class pra extends Cinema {
//     private String name = "adaptation";

//     public pra(String movie) {
//         this.name = "Remake";
//     }

//     public static void main(String[] showing) {
//         System.out.print(new pra("Trilogy").name);
//     }
// }

// public class pra {
//     public static void main(String[] args) {
//         StringBuffer st = new StringBuffer("hello utkarsh boss");
//         String s = st.toString();
//         System.out.println(s);
//     }
// }

// import java.util.*;
// class Student{
//     String Name, address, UG_degree, college, aos;
//     int age, yoc;
//     double percentage;
//     public void Read(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Name: ");
//         Name = sc.next();
//         System.out.println("Enter age");
//         age = sc.nextInt();
//         System.out.println("Enter percentage: ");
//         percentage = sc.nextInt();
//         System.out.println("Enter UG-degree: ");
//         UG_degree = sc.next();
//         System.out.println("Enter area of specialization: ");
//         aos = sc.next();
//         System.out.println("Enter College");
//         college = sc.next();
//         System.out.println("Enter year of completion: ");
//         yoc = sc.nextInt();
//         System.out.println("Enter Address: ");
//         address = sc.next();
//         sc.close();;
//     }
//     public void display(){
//         System.out.println("Name: "+ Name);
//         System.out.println("age"+ age);
//         System.out.println("percentage: "+percentage);
//         System.out.println("UG-degree: "+UG_degree);
//         System.out.println("area of specialization: "+aos);
//         System.out.println("year of completion: "+yoc);
//         System.out.println("College"+college);
//         System.out.println("Address: "+address);
//     }
// }
// class PostGraduateStudent extends Student{
//     String PG_degree, college, aos;
//     int nobw, nopp, noca, yoc;
//     public void Read(){
//         System.out.println("Reading!");
//     }
//     public void display(){
//         System.out.println("Name: "+ Name);
//         System.out.println("age"+ age);
//         System.out.println("percentage: "+percentage);
//         System.out.println("PG-degree: "+PG_degree);
//         System.out.println("area of specialization: "+aos);
//         System.out.println("number of books written: "+nobw);
//         System.out.println("number of paper published: "+nopp);
//         System.out.println("number of conferences attended: "+noca);
//         System.out.println("year of completion: "+yoc);
//         System.out.println("College"+college);
//         System.out.println("Address: "+address);
//     }
// }
// class DoctralStudent extends PostGraduateStudent{
//     String PHD_degree, aos;
//     int yoc;
//     boolean Thesis_submitted;
//     public void Read(){
//         System.out.println("Reading!");
//     }
//     public void display(){
//         System.out.println("Name: "+ Name);
//         System.out.println("age"+ age);
//         System.out.println("percentage: "+percentage);
//         System.out.println("PHD-degree: "+PHD_degree);
//         System.out.println("Thesis submitted: "+Thesis_submitted);
//         System.out.println("area of specialization: "+aos);
//         System.out.println("year of completion: "+yoc);
//         System.out.println("College"+college);
//         System.out.println("Address: "+address);
//     }
// }
// public class pra{
//     public static void main(String[] args) {
//     }
// }

