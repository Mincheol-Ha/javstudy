package hello.collection.TreeSet;

import java.util.Comparator;

public class MyCompare implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return(s1.compareTo(s2)) * -1;
    }
}

