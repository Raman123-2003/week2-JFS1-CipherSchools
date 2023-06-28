import java.util.Iterator;
import java.util.LinkedList;

public class Test0 {

    public static void main(String[] args) {

        LinkedList<String> myll = new LinkedList<>();

        myll.add("Ironman");
        myll.add("Thor");
        myll.add("Hulk");
        myll.add("Loki");
        System.out.println(myll.get(1));

        myll.addLast("Gamora");
        myll.addFirst("AntMan");
        myll.add(2, "Natasha");

        Iterator<String> it = myll.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("__________");
        System.out.println("who is at the top: " + myll.peek());
        System.out.println("hey first one, get out: " + myll.poll());

        it = myll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
