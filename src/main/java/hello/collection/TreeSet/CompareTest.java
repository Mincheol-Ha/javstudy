package hello.collection.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class CompareTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new MyCompare());
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);
    }
}
