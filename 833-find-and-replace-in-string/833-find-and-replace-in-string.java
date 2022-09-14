class Solution {

    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
         TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], sources[i] + " " + targets[i]);
        }

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (map.containsKey(i)) {
                String[] str = map.get(i).split(" ");
                if (s.substring(i, i + str[0].length()).equals(str[0])) {
                    sb.append(str[1]);
                    i += str[0].length();
                } else {
                    sb.append(s.charAt(i));
                    i++;
                }
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();

    }
}
