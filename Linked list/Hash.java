import java.util.HashSet;

public class Test3 {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("red");
        mySet.add("orange");
        mySet.add("red");
        mySet.add("orange");
        mySet.add("green");
        System.out.println(mySet);
    }
}
