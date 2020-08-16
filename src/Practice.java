import java.io.Serializable;
import java.util.*;

public class Practice extends Thread implements Serializable {
    public static void main(String[] args) {
        String[] a = {"Geeks", "code", "Practice", "Error", "Java",
                "Class", "Error", "Practice", "Java"};
        final List<String> aList = new ArrayList<>(Arrays.asList(a));
        System.out.println("Before");
        aList.forEach(System.out::println);
        aList.add("Hi");

        List<String> rm = new ArrayList<String>();
        rm.add("Error");

        Set<String> s = Collections.singleton("Error");
        // s.removeAll(rm); -> unsupported since s is immutable

        aList.removeAll(rm); //tedious method
        aList.removeAll(Collections.singleton("Error")); //quick workaround- one line

        System.out.println("\nAfter");
        aList.forEach(System.out::println);


        System.out.println("\nSet");
        s.forEach(System.out::println);
    }
}
