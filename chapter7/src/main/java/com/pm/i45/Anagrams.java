package com.pm.i45;

import java.io.File;
import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        File dictionary = new File(args[0]);
        int minGroupSize = Integer.parseInt(args[1]);

        Map<String, Set<String>> groups = new HashMap<>();
        try (Scanner sc = new Scanner(dictionary)) {
            while (sc.hasNextLine()) {
                String word = sc.next();
                groups.computeIfAbsent(alphabetize(word),
                        (unused) -> new TreeSet<>())
                        .add(word);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Set<String> group : groups.values())
            if (group.size() >= minGroupSize)
                System.out.println(group.size() + ": " + group);
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
