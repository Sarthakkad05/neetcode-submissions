class MyHashMap {

    private List<int[]> map;

    public MyHashMap() {
        map = new ArrayList<>();
    }

    public void put(int key, int value) {

        for (int[] pair : map) {
            if (pair[0] == key) {
                pair[1] = value;
                return;
            }
        }

        map.add(new int[]{key, value});
    }

    public int get(int key) {

        for (int[] pair : map) {
            if (pair[0] == key) {
                return pair[1];
            }
        }

        return -1;
    }

    public void remove(int key) {

        for (int i = 0; i < map.size(); i++) {
            if (map.get(i)[0] == key) {
                map.remove(i);
                return;
            }
        }
    }
}