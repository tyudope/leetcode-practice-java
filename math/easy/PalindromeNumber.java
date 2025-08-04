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
        if (x < 0){ // if given number is negative, it cannot be palindrome.
            return false;
        }
        int tmp = x; // storage x before calculations.
        int reversedNum = 0;
        while(x != 0){ // until x not equal to the zero
            int digit = x % 10; // take the last digit.
            x = x / 10; // divide x by 10
            reversedNum = reversedNum * 10 + digit; // reverse the number

        }
        return reversedNum == tmp; // returns true if the reversed number is equal to the given x
    }
}
