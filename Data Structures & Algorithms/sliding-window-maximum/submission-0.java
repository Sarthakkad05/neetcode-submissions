class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Max heap: larger values first
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        for (int i = 0; i < n; i++) {

            // Add current element and its index
            maxHeap.offer(new int[] {nums[i], i});

            // Remove elements outside the current window
            while (maxHeap.peek()[1] <= i - k) {
                maxHeap.poll();
            }

            // Record answer when window size reaches k
            if (i >= k - 1) {
                result[i - k + 1] = maxHeap.peek()[0];
            }
        }

        return result;
    }
}