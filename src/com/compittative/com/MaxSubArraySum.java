package com.compittative.com;

public class MaxSubArraySum {

    public static void main(String[] args) {
        // Input array
        int[] nums = {1, 4, 20, 3, 10, 5};
        // Target sum
        int targetSum = 33;

        // Find and print the maximum size subarray with the given sum
        int maxSize = maxSubArraySize(nums, targetSum);

        if (maxSize != -1) {
            System.out.println("Maximum size subarray with sum " + targetSum + ": " + maxSize);
        } else {
            System.out.println("No subarray found with the given sum.");
        }
    }

    // Function to find the maximum size subarray with the given sum
    static int maxSubArraySize(int[] nums, int targetSum) {
        // Get the length of the input array
        int n = nums.length;

        // Initialize variables for tracking the current subarray
        int sum = 0;  // Current sum of the subarray
        int maxSize = Integer.MIN_VALUE;  // Maximum size found so far
        int start = 0;  // Start index of the current subarray

        // Iterate through the array using a sliding window approach
        for (int end = 0; end < n; end++) {
            sum += nums[end];  // Include the current element in the subarray

            // Check if the sum is greater than the target sum
            while (sum > targetSum) {
                sum -= nums[start];  // Remove elements from the start to make the sum <= targetSum
                start++;  // Move the start index to the right
            }

            // Check if the current subarray has the target sum
            if (sum == targetSum) {
                // Calculate the size of the current subarray
                int currentSize = end - start + 1;
                // Update the maximum size found so far
                maxSize = Math.max(maxSize, currentSize);
            }
        }

        // If no subarray is found, return -1
        return (maxSize == Integer.MIN_VALUE) ? -1 : maxSize;
    }
}
