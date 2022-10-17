package deneme.MOOC_10.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> member = new ArrayList<>();
        member.add(new Member("mikael", 182));
        member.add(new Member("matti", 187));
        member.add(new Member("ada", 184));

        member.stream().forEach(m -> System.out.println(m));
        System.out.println();
// sorting the stream that is to be printed using the sorted method
        member.stream().sorted().forEach(m -> System.out.println(m));
        member.stream().forEach(m -> System.out.println(m));
        System.out.println();
// sorting a list with the sort-method of the Collections class
        Collections.sort(member);
        member.stream().forEach(m -> System.out.println(m));
    }
}
