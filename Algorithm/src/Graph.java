/*Graph API */
//Implement A Graph API using adjacency List 
public class Graph {
	 
	 private final int V;
	 //List of Bag to store adjacency List 
     private Bag<Integer>[] adj;
     
     //Constructor 
     @SuppressWarnings("unchecked")
	public Graph(int V){
    	 this.V = V;
    	 //Create empty Graph with V vertices 
    	 adj = (Bag<Integer>[]) new Bag[V];
    	 for(int v=0;v<V;v++){
    		 adj[v] = new Bag<Integer>();
    	 }
     }
    
     public void addEdge(int x,int y){
          adj[x].add(y);
          adj[y].add(x);
     }
     
     public Iterable<Integer> adj(int v){
    	 return adj[v];
     }
	
}
