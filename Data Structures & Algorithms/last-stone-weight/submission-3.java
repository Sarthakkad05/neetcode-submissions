class Solution {
    public int lastStoneWeight(int[] stones) {
        
       PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

       for(int stone: stones) maxheap.offer(stone);

       while(maxheap.size() > 1){

            int firstHeavy = maxheap.poll();
            int secondHeavy = maxheap.poll();

            if(firstHeavy > secondHeavy){
                maxheap.offer(firstHeavy - secondHeavy);
            }
       }

       return maxheap.isEmpty() ? 0 : maxheap.peek();
    }
}
