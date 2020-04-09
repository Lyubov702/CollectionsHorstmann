package com.mycode.collection;

import java.util.*;
/*6. I encouraged you to use interfaces instead of concrete data structures—for
* example, a Map instead of a TreeMap. Unfortunately, that advice goes only
* so far. Suppose you have a method parameter of type Map<String,
* Set<Integer>>, and someone calls your method with a HashMap<String,
* HashSet<Integer>>. What happens? What parameter type can you use instead?
* */

public class Check {
    public static void main(String[] args) {
/*
        *  Map<String, Set<Integer>> map = new TreeMap<String, HashSet<Integer>>();
        *  Получаем ошибку компиляции из-за того, что Set<Integer> и HashSet<Integer> не имеют родственных связей, в отличии от Set и HashSet
        *
        *  Можно сделать вот так
        *  Map<String, Set<Integer>> map2 = new TreeMap<String, Set<Integer>>();
        *  Map<String, LinkedHashSet<Integer>> map2 = new HashMap<String, LinkedHashSet<Integer>>();
        *
        *  Для увеличения гибкости программы лучше пользоваться интерфейсами, но есть случаи, когда надо задать явно, используя имя класса.
        *
        */
    }
}
