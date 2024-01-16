class RandomizedSet {
    ArrayList<LinkedList<Integer>> set;
    final double LOAD_FAC = 0.75;
    int buckets;
    int size;
    public RandomizedSet() {
        set = new ArrayList();
        for(int i = 0; i < 10; i++) {
            set.add(new LinkedList<Integer>());
        }
        buckets = 10;
    }
    private int hashFunction(Integer i, int b) {
        return ((int) Math.abs(i.hashCode() % (b - 1)));
    }
    private double loadFac() {
        if(buckets == 0) {
            return 0;
        }
        return ((double) size)/buckets;    
    }
    private void resize() {
        ArrayList<LinkedList<Integer>> temp = new ArrayList();
        for(int i = 0; i < 2 * buckets; i++) {
            temp.add(new LinkedList<Integer>());
        }
        for(LinkedList<Integer> buck : set) {
            for(Integer elem : buck) {
                temp.get(hashFunction(elem, buckets * 2)).addLast(elem);
            }
        }
        buckets *= 2;
        set = temp;
    }
    public boolean insert(int val) {
        if(loadFac() > LOAD_FAC) {
            resize();
        }
        if(!set.isEmpty() && set.get(hashFunction(val, buckets)).contains(val)) {
            return false;
        }
        set.get(hashFunction(val, buckets)).addLast(val);
        size++;
        return true;
    }
    
    public boolean remove(int val) {
        if(!set.get(hashFunction(val, buckets)).isEmpty()) {
            for(Integer elem : set.get(hashFunction(val, buckets))) {
                if(elem.equals(val)) {
                    set.get(hashFunction(val, buckets)).remove(elem);
                    size--;
                    return true;
                }
            }
        }
        return false;
    }
    
    public int getRandom() {
        Random ran = new Random();
        int buck = ran.nextInt(buckets - 1);
        while(set.get(buck).isEmpty()) {
            buck = ran.nextInt(buckets - 1);
        }
        return set.get(buck).get(ran.nextInt(set.get(buck).size()));
    }
}