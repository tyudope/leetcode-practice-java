package math.easy;

public class PalindromeNumber {
    // Problem : Palindrome Number
    // LeetCode #9.
    //Given an integer x, return true if x is a palindrome, and false otherwise.
    // -121 , -> 121- it's not palindrome
    // 121, -> 121 it's palindrome.
    public static void main(String[] args) {
        System.out.println(isPalindrome(120));
    }
    public static boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }
        int tmp = x; // storage x before calculations.
        int reversedNum = 0;
        while(x != 0){
            int digit = x % 10;
            x = x / 10;
            reversedNum = reversedNum * 10 + digit;

        }
        return reversedNum == tmp;
    }
}
