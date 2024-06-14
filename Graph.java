import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {

    private HashMap<String, List<String>> adjList = new HashMap<>();

    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public void printGraph(){
        System.out.println(adjList);
    }

    public boolean addEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null){
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(adjList.get(vertex ) ==null) return false;
        for(String string : adjList.get(vertex)){
            adjList.get(string).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }
}
