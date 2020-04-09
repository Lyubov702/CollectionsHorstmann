package com.mycode.collection.lines;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Lines {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> lines = getLines();
        lines = lines.stream().map(x -> x.replaceAll("\\W", " ")).map(x -> x.replaceAll("\\.", "")).collect(Collectors.toList());
        List<String[]> strings = lines.stream().map(x -> x.split(" ")).collect(Collectors.toList());
        Map<String, Integer> treeMap = new TreeMap<>();
        putToTheMap(treeMap,strings);
        System.out.println(treeMap);
    }

    private static List<String> getLines() throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        Scanner in = new Scanner(new File("src/com/mycode/collection/lines/note.txt"));
        while (in.hasNextLine()) {
            lines.add(in.nextLine().toLowerCase());
        }
        in.close();
        System.out.println(lines);

        return lines;
    }

    private static void putToTheMap(Map<String, Integer> map, List<String[]> strings) {
        int count = 0;
        for (String[] lines: strings) {
            count++;
            for (String word: lines) {
                if (!map.containsKey(word)) {
                    map.put(word,count);
                }
            }
        }
    }
}
