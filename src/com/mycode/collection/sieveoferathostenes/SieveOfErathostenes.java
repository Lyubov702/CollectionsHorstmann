package com.mycode.collection.sieveoferathostenes;

/*Implement the “Sieve of Erathostenes” algorithm to determine all prime numbers ≤ n.
        Add all numbers from 2 to n to a set. Then repeatedly find the smallest element s in the set,
        and remove s2, s · (s + 1), s · (s + 2), and so on.
        You are done when s2 > n. Do this with both a HashSet<Integer> and a BitSet.
*/
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class SieveOfErathostenes {

    public static void main(String[] args) {
        getPrimeNumbersHashSet(100);
        getPrimeNumbersBitSet(400);
    }

    private static void getPrimeNumbersHashSet(int number) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < number; i++) {
            hashSet.add(i);
        }
        for (int j = 2; j * j <= number; j++) {
            for (int i = j * j; i <= number; i += j) {
                hashSet.remove(i);
            }
        }
        System.out.println(hashSet);
    }
    private static void getPrimeNumbersBitSet(int number) {
        BitSet bitSet = new BitSet();
        for (int i = 0; i < number; i++) bitSet.set(i);
        for (int p = 2; p * p <= number; p++) {
            for (int i = p * p; i <= number; i += p) {
                bitSet.clear(i);
            }
        }
        System.out.println(bitSet);
    }
}
