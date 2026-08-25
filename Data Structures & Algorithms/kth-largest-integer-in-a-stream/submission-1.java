class KthLargest {

   
   private int k;
   private PriorityQueue<Integer> minheap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minheap = new PriorityQueue<>();

        for(int num: nums){
            minheap.offer(num);
            if(minheap.size() > k) minheap.poll();
        }

    }
    
    public int add(int val) {
        
            minheap.offer(val);
            if(minheap.size() > k) minheap.poll();

        return minheap.peek();
    }
}
