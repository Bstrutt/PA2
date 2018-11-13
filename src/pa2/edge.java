package pa2;

public class edge {
	int weight;
	vertex from;
	vertex to;
	edge(vertex from, vertex to, int weight){
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
}
