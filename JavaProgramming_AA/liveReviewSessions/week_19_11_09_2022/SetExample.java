package week_19_11_09_2022;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        String str = "uuuuuuuuuuoooooooooeeeeeeeeejjjjjkkkkkkkkkkllllaaaaaaaaaiurs";
        //remove duplicates

        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(str.split("")));

        System.out.println("list = " + list);

        Set<String> setHash = new HashSet<>();

        setHash.addAll(list);

        System.out.println("setHash = " + setHash); // no insertion order

        Set<String> setLinked = new LinkedHashSet<>();

        setLinked.addAll(list);

        System.out.println("setLinked = " + setLinked); // keeps insertion order

        Set<String> setTreee = new TreeSet<>();

        setTreee.addAll(list);

        System.out.println("setTreee = " + setTreee); // order a - z

        List<String> strList = new LinkedList<>();

        strList.addAll(Arrays.asList("abc", "cbd", "java", "js", "abc", "htm", null, null, null));

        // sort this list and take out duplicates and null values

        Set<String> set = new HashSet<>();
        set.addAll(strList);
        set.remove(null);
        Set<String> sortedSet = new TreeSet<>();
        sortedSet.addAll(set);
        System.out.println("sortedSet = " + sortedSet);


    }

}
