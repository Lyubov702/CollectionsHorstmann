package com.mycode.collection.frequency;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*7. Write a program that reads all words in a file
and prints out how often each word occurred. Use a TreeMap<String, Integer>.*/
public class Frequency {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new TreeMap();
        map = check(map);
        System.out.println(map);
    }

    private static Map check(Map<String, Integer> map) throws IOException {
        Scanner in = new Scanner(new File("src/com/mycode/collection/frequency/note.txt"));

        Map<String, Integer> treemap = map;
        String s;
        String words[];
        while (in.hasNextLine()) {
            s = in.nextLine().toLowerCase();
            words = s.split(" ");
            put(words, treemap);
        }
        in.close();
        return treemap;
    }

    private static void put(String[] words, Map<String, Integer> map) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            Integer val = map.get(word);
            if (val != null) {
                map.put(word, new Integer(val + 1));
            } else {
                map.put(word, 1);
            }
        }
    }
}
