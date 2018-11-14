package pa2;

public class Vertex {
	int xcoord;
	int ycoord;


	Vertex(int x, int y){
		xcoord = x;
		ycoord = y;

	}
	public String toString(){
		String output = "(" + xcoord + "," + ycoord + ")";
		return output;
	}
}
