class Solution {

    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        //         convert map into the list for comparion
        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());

        System.out.println(list);
        //         sorting the list for the elements

        Collections.sort(list, (a, b) -> b.getValue().compareTo(a.getValue()));

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e : list) {
            int i = e.getValue();
            while (i > 0) {
                sb.append(e.getKey());
                i--;
            }
        }
        return sb.toString();
    }
}
