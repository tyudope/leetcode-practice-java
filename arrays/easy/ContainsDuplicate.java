package arrays.easy;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println("Hashset solution : " + containsDuplicate(nums));
        System.out.println("Sorting solution : " + SortingContainsDuplicate(nums));

    }

    // Runtime Efficient Solution ( SET )
    // Runtime complexity O(n)
    // Space complexity O(n) -> In the worst case, if not duplicates are found , you store all n numbers.
    // If we care about speed.
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (Integer num : nums) {
            if (seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }

    // SORTING SOLUTION.
    // O(n log n) time complexity
    // O(1) (ignoring sort space)
    // When to use : If we want to save space.
    public static boolean SortingContainsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}

