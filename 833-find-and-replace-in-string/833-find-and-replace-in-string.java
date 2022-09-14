class Solution {

    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], sources[i] + " " + targets[i]);
        }

        // Sort
        Arrays.sort(indices);

        // Replace
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            if (j < indices.length && i == indices[j]) {
                String[] strs = map.get(indices[j]).split(" ");
                if (s.substring(i, i + strs[0].length()).equals(strs[0])) {
                    sb.append(strs[1]);
                    i += strs[0].length();
                } else {
                    sb.append(s.charAt(i));
                    i++;
                }
                j++;
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }
}
