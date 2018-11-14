package pa2;

public class Edge {
	int weight;
	Vertex from;
	Vertex to;
	Edge(Vertex from, Vertex to, int weight){
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
	public String toString() {
		String output = "From:" + from + " To:" + to + " Weight: " + weight;		
		return output;
	}
}
