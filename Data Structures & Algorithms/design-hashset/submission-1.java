class MyHashSet {

    List<Integer> HashSet;

    public MyHashSet() {
        HashSet = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!HashSet.contains(key)){
            HashSet.add(key);
        }
    }
    
    public void remove(int key) {
        HashSet.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return HashSet.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */