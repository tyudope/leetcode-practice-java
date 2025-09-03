package arrays.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums){
        if(nums.length == 0) { return 0; }
        int i = 1;
        for(int j =1;  j<nums.length; j++){
            if(nums[j] != nums[j-1]) i++;
        }
        return i;
    }
}
