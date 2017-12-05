import java.util.Stack;

/*Non-recursive DFS*/
public class DFS {
	boolean[] marked;
	int[] edgeTo;

	

	private void dfs(Graph G, int V) {
        
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(V);
		marked[V] = true;

		while (!myStack.empty()) {
			int Vertex = myStack.pop();
			for (int w : G.adj(Vertex)) {
				if (!marked[Vertex]) {
					marked[Vertex] = true;
					myStack.push(Vertex);
				}
			}
		}

	}

}
