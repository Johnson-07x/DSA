package Revision.Collections.Map;

import java.util.*;
import java.util.stream.Collectors;

public class GroupWords {
    public static void main(String[] args) {
        List<String> words = List.of("go", "java", "code", "map", "stream");

        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByLength); // {2=[go], 3=[map], 4=[java, code], 6=[stream]}
    }
}
