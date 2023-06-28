import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();
        Set<String> uniqueItems = new HashSet<>();

        for (int i = 1; i <= 5; i++) {
            String item = sc.next();

            if (uniqueItems.contains(item)) {
                continue;
            }

            uniqueItems.add(item);
            myList.add(item);
        }

        System.out.println(myList);
    }
}
