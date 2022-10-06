class TimeMap {

    Map<String, TreeMap<Integer,String >> map;
    
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
            map.put(key, new TreeMap<>());
        map.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            Integer minTimestamp = map.get(key).floorKey(timestamp);
            return minTimestamp != null ? map.get(key).get(minTimestamp) : "";
        }else
            return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */