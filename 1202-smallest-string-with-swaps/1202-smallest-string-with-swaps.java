
class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        //Step1: Create UF
        UnionFind uf = new UnionFind(n);
        //Step2: create connected components
        for (List<Integer> edge : pairs) {
            uf.union(edge.get(0), edge.get(1));
        }
        //Step3 : Create map
        HashMap<Integer, PriorityQueue<Character>> componentMap = new HashMap<>();
        //Step4 : populate the map
        for (int i=0; i<n; i++) {
            int rootNode = uf.find(i);
            componentMap.putIfAbsent(rootNode, new PriorityQueue<>((ch1, ch2)->ch1-ch2));
            componentMap.get(rootNode).add(s.charAt(i));
        }
        //Step5 : construct the answer using the map
        StringBuilder sbr = new StringBuilder("");
        for (int i=0; i<n; i++) {
            int rootNode = uf.find(i);
            sbr.append(componentMap.get(rootNode).remove());
        }
        return sbr.toString();
    }
    
    private static class UnionFind {
        private int numComponents;
        private int[] sz;
        private int[] root;
        
        UnionFind(int n) {
            root = new int[n];
            sz = new int[n];
            numComponents = n;
            for (int i=0; i<n; i++) {
                root[i] = i;
                sz[i] = 1;
            }
        }
        
        public int find(int node) {
            int pointer  = node;
            while (root[pointer] != pointer) {
                pointer = root[pointer];
            }
            int rootNode = pointer;
            pointer = node;
            while (pointer != rootNode) {
                int next = root[pointer];
                root[pointer] = rootNode;
                pointer = next;
            }
            return rootNode;
        }
        
        public void union(int node1, int node2) {
            int root1 = find(node1);
            int root2 = find(node2);
            
            if (root1 == root2) return;
            
            if (sz[root1] >= sz[root2]) {
                root[root2] = root1;
                sz[root1] = sz[root1] + sz[root2];
            } else {
                root[root1] = root2;
                sz[root2] = sz[root2] + sz[root1];
            }
            numComponents--;
        }
        
        public int getNumComponents() {
            return numComponents;
        }
    } 
    
}
// Note: Since UF uses path compression, union, find are amortized constant time.

// n - string length
// m - number of pairs.

// Algo
// 1. Create a general UF impl - O(n)
// 2. Form connected components: iterate through the pairs, treating each pair as an edge, perform union of the 2 nodes connected by the edge. - O(m)
// 3. Create a hashmap, storing mapping : component root -> priority queue of characters contained in the connected component represented by that root.
// - O(1)
// 4. iterate through 0:n-1, here each node is essentially a index, so retrieve the character, find the root of node, 
// add the character in the queue for that root. - O(nlogn)
// 5. Now, again iterate through 0:n-1, retrieve the root of each node, use the root to retrieve queue, then remove the item from the queue and assign it to the current index. - O(nlogn)

// Total TC : n+m+nlogn+nlogn = n+m+2nlogn
// Total SC : O(n), all queues will have only n items, UF impl stores n items in its internal array.