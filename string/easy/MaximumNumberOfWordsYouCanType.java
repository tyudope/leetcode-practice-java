package string.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MaximumNumberOfWordsYouCanType {
    public static void main(String[] args) {

        // Give a string text of words separated by a single space(no leading or trailing spaces) and string
        // brokenLetters of all distinct letter keys that are broken, return the number of words in text
        // you can fully type using this keyboard.

        String text = "hello world";
        String brokenLetters = "ad";
        // we cannot type 'world' because the 'd' key is broken.
        System.out.println(canBeTypeWords(text,brokenLetters));

    }
    public static int canBeTypeWords(String text, String brokenLetters){
        int count = 0;
        HashSet<Character> brokenSet = new HashSet<>();
        for(Character c : brokenLetters.toCharArray()){
            brokenSet.add(c);
        }
        for(String word : text.split(" ")){
            count++;
            for(Character c : word.toCharArray()){
                if (brokenSet.contains(c)){
                    count--;
                    break;
                }
            }
        }
        return count;




    }
}
