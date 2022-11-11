package LeetCode;

import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {

                if ( nums[i] != nums[i-1]){
                    nums[count] = nums[i];
                    count++;
                }

        }
        System.out.println(Arrays.toString(nums));
        return count;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates obj = new RemoveDuplicates();
        System.out.println(obj.removeDuplicates(nums));
    }
}
