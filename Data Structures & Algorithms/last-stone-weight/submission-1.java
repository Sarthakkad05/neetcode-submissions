class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num: stones) maxHeap.offer(num);

        while(maxHeap.size() > 1){

            int firstHeavy = maxHeap.poll();
            int secondHeavy = maxHeap.poll();

            if(firstHeavy > secondHeavy){
                maxHeap.offer(firstHeavy - secondHeavy);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
