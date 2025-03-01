package hello.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("이나연"));
        hashSet.add(new String("김태민"));
        hashSet.add(new String("이정민"));
        hashSet.add(new String("이정민"));
        hashSet.add(new String("김건우"));
        hashSet.add(new String("도건민"));

        System.out.println(hashSet);
    }
}
