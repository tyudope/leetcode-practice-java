package arrays.easy;

/**
 * Problem: LeetCode #1 - Two Sum
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Explanation:
 * - Time: We traverse the array once, and each lookup in the HashMap is O(1).
 * - Space: We store up to n elements in the HashMap.
 */
//Problem Statement (Summary)
//Given an array of integers nums and an integer target,
// return the indices of the two numbers such that they add up to the target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

import java.util.HashMap;


public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums , target);
        System.out.println("Indexes are :" + result[0] + ", " + result[1]);
    }
    public static int[] twoSum(int[] nums , int target){
        // Create a HashMap to store each number and its index as we iterate.
        HashMap<Integer , Integer> map = new HashMap<>();
        // Loop through each element in the array.
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i]; // Compute the complement value needed.
            // Check if complement already exists in the map.
            if (map.containsKey(complement)){
                return new int[] {map.get(complement) , i}; // if it contains return the complement index and current index.
            }
            // Otherwise, add the current number and its index to the map
            // We do this AFTER checking to avoid using the same element twice.
            map.put(nums[i] , i);
        }
        return null;

    }
}
