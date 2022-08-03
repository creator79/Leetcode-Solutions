class MyCalendar {
    private final TreeMap<Integer, Integer> treeMap; // [key: start, value: end]

    public MyCalendar() {
        treeMap = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prevStart = treeMap.floorKey(start);
        Integer nextStart = treeMap.ceilingKey(start);

        if ((prevStart == null || treeMap.get(prevStart) <= start) && (nextStart == null || end <= nextStart)) {
            treeMap.put(start, end);
            return true;
        }
        return false;
    }
}
/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
