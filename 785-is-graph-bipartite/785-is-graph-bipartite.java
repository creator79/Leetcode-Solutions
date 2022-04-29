class Solution {
    public boolean isBipartite(int[][] graph) {
        
        // two sets
        s1 = new boolean[graph.length];
        s2 = new boolean[graph.length];
        
        // for already visited
        boolean vis[] = new boolean[graph.length];
        
        for(int i = 0; i < graph.length; i++) {
            if(!vis[i]) {
                s1[i] = true;
                boolean res = dfs(graph, i, vis);
                if(!res) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    boolean s1[];
    boolean s2[];
    
    public boolean dfs(int[][] graph, int i, boolean[] vis) {
        vis[i] = true;
        if(s1[i]) {
            for(int ni = 0; ni < graph[i].length; ni++) {
                int v = graph[i][ni];
                if(s1[v]) {
                    return false;  
                } else {
                    s2[v] = true;
                }
            }
        } else {
            for(int ni = 0; ni < graph[i].length; ni++) {
                int v = graph[i][ni];
                if(s2[v]) {
                    return false;  
                } else {
                    s1[v] = true;
                }
            }
        }
        
        for(int ni = 0; ni < graph[i].length; ni++) {
            if(!vis[graph[i][ni]]) {
                boolean res = dfs(graph, graph[i][ni], vis);
                if(!res) {
                    return false;
                }
            }
        }
        
        return true;
    }
}