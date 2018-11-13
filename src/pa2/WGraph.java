package pa2;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class WGraph {
	int numVertex;
	int numEdges;
	LinkedList<LinkedList<edge>> adjList;		//array of linked lists representing edges of each vertex
	LinkedList<vertex> vertexList; 	//known vertices list
	boolean unknownVertex;
	
	WGraph(String FName) throws FileNotFoundException{
		File f = new File(FName);
		Scanner s = new Scanner(f);
		
		numVertex = s.nextInt();				// gets the number of vertices
		numEdges = s.nextInt();					// gets the number of edges (doesn't do much yet)
		
		adjList = new LinkedList<>();
		for(int i = 0; i <numVertex; i++) {
			adjList.set(i, new LinkedList<edge>());	// Populates the array with empty LinkedLists
		}
		
		
		while(s.hasNextInt()) {
			unknownVertex = true;
			
			// Create a temporary vertex for the newest edge
			vertex tempVertex = new vertex(s.nextInt(), s.nextInt());
			
			/* 		Checks to see if the vertex is previously known
			 		Probably more efficent ways to do this, see if there is a fix
					Maybe something native to LinkedLists I don't know about?
					Declare i outside of the for loop so we can use it for referencing vertices later
			*/
			int i;
			for(i = 0; i < vertexList.size(); i++) {
				if (vertexList.get(i).xcoord == tempVertex.xcoord && vertexList.get(i).ycoord == tempVertex.ycoord) {
					unknownVertex = false;
					break;
				}
			}
			if(unknownVertex) {
				//This ugly fothermucker adds a vertex to the vertex list, then appends a new edge to the corresponding 
				//edge list of that vertex. Only if we didn't previously know the vertex; 
				vertexList.add(tempVertex);
				adjList.get(adjList.size()).add(new edge(tempVertex, new vertex(s.nextInt(), s.nextInt()), s.nextInt()));
			} else {
				//This guy adds a new edge at the location of the known vertex.
				adjList.get(i).add(new edge(tempVertex, new vertex(s.nextInt(), s.nextInt()), s.nextInt()));
			}
			
			
			
														
		}
	}
}
