package string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class FindMostFrequentVowelANDConsonant {
    public static void main(String[] args) {
        String input1 = "successes"; // -> 6 , 's' with frequency 4, 'e' with frequency 2
        String input2 = "aieaiea"; // -> 3, ('a' frequency is 3), and there is no consonant.
        System.out.println(maxFreqSum(input2));

    }
    public static int maxFreqSum(String s){

        HashMap<Character, Integer> vowels_freq = new HashMap<>();
        HashMap<Character, Integer> consonants_freq = new HashMap<>();

        for (char c : s.toCharArray()){
            if ("aeiou".indexOf(c) !=  -1){
                // .indexOf(c)
                // Purpose: checks if a character is in the string and return its index, or -1 if not found.
                vowels_freq.put(c, vowels_freq.getOrDefault(c,0) + 1);
                // getOrDefault()
                // Purpose: get the value for a key, or return a default if the key is missing.
            }
            else{
                consonants_freq.put(c, consonants_freq.getOrDefault(c,0) + 1);
            }
        }
        // Collections.max()
        // Purpose: returns the maximum value from a collection (List, Set, Map.values() ....).
        int maxVowel = vowels_freq.isEmpty() ? 0 : Collections.max(vowels_freq.values());
        int maxConsonant = consonants_freq.isEmpty() ? 0 : Collections.max(consonants_freq.values());
        return maxConsonant + maxVowel;
    }
}
