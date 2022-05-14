class Solution {
    
    public int total = 0; // to return the max value
    
    public class Edge  // As graph is arrayList of edges so firstly creating an edge class
    {
        int src;  // source
        int nbr; // its destination or source's neighbour
        int wt; // corresponding edge weight
        
        Edge(int src , int nbr , int wt)  // constructor to initialise the new Edge object
        {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        
        List<Edge>[] graph = new ArrayList[n+1]; // Adjacency List for representation of graph {n+1} because edge starts from **1 to N**
        
        Set<Integer> set = new HashSet(); // if all nodes are visited then return result else return -1 as mentioned
        
        for(int i=1;i<=n;i++)
        {
            graph[i] = new ArrayList();  // Creating the Adjacency list like for Node 1 ----> [] , Node 2 -----> []
        }
        
        
        
        for(int i=0;i<times.length;i++)
        {
            // Graph creation
            int v1 = times[i][0];
            int v2 = times[i][1];
            int wt = times[i][2];
            graph[v1].add(new Edge(v1, v2, wt));  // as it is directed graph obviously only one edge to be connected
            
        }
        
		// At this point our graph is ready and ready to execute this problem
		
		// As the source is K is the question and from K we need to visit all the nodes
		
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // Min PriorityQueue for Dijkstras
        
         boolean[] vis = new boolean[n+1]; //{n+1} //because 1toN nodes not 0 to N-1
        
        pq.add(new Pair(k,0)); //initialising the priorityQueue 
        
        while(pq.size() > 0)
        {
            Pair rem = pq.remove();
            
            if(vis[rem.v])  // If the node is already visited then just continue
            {
                continue;
            }
            
            vis[rem.v] = true; //else mark it as true
            set.add(rem.v); // this is for final result comparing
            total = Math.max(total , rem.wsf); // max until now
            
            for(Edge e : graph[rem.v]) // visiting the neighbours using the current node 
            {
                if(vis[e.nbr] == false)
                {
                      pq.add(new Pair(e.nbr  , rem.wsf+e.wt)); // prev wt + curr wt
                      
                }
            }
            
        }
        
        if(set.size() == n)
        {
            return total;
        }
        return -1;
        
        
    }
    
    public class Pair implements Comparable<Pair> // As pq is of type Pair we need to mention how it is been compared with hence we go on with comparable class
    {
        int v;
        int wsf;
        Pair(int v , int wsf)
        {
            this.v = v;
            this.wsf = wsf;
        }
        
        public int compareTo(Pair o) // Inbuilt method when used comparable interface and has to be compulsorily defined
        {
            return this.wsf - o.wsf;
        }
    }
}