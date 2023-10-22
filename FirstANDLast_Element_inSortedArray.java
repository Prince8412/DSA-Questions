// 34. Find First and Last Position of Element in Sorted Array

// Solved
// Medium
// Topics
// Companies
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums is a non-decreasing array.
// -109 <= target <= 109


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = findLeft(nums, target);
        int right = findRight(nums, target);
        
        if (left <= right) {
            return new int[]{left, right};
        } else {
            return new int[]{-1, -1};
        }
    }
    
    private int findLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] >= target) {
                right = mid - 1;
                if (nums[mid] == target) {
                    index = mid;
                }
            } else {
                left = mid + 1;
            }
        }
        
        return index;
    }
    
    private int findRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= target) {
                left = mid + 1;
                if (nums[mid] == target) {
                    index = mid;
                }
            } else {
                right = mid - 1;
            }
        }
        
        return index;
    }
}
