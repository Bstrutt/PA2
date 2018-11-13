package pa2;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class WGraph {
	int numVertex;
	int numEdges;
	ArrayList[] adjList;


	WGraph(String FName) throws FileNotFoundException{
		File f = new File(FName);
		Scanner s = new Scanner(f);

		numVertex = s.nextInt();				// gets the number of vertices
		numEdges = s.nextInt();					// gets the number of edges (doesn't do much yet)
		adjList = new ArrayList[numVertex];		// creates an array of arraylists as big as the number of vertices



		while(s.hasNextInt()) {
			new Vertex(s.nextInt(), s.nextInt());	//This will parse the txt file to get vertex coords and edges

		}
	}
}
