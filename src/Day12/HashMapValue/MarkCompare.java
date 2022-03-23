package Day12.HashMapValue;

import java.util.Comparator;
import java.util.Map;

public class MarkCompare implements Comparator<Map.Entry<String,Student>> {

    @Override
    public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
        Student s1 = o1.getValue();
        Student s2 = o2.getValue();

        return s1.getMark() > s2.getMark() ? +1 : -1;
    }
}
