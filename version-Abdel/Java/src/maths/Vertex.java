package maths;

import java.util.HashSet;

/*
 * Invariants
 * - les aretes incidentes sont dans le m�me graphe que this
 */
public class Vertex
{
    private Character label;
    private HashSet<Edge> incidentEdges;
    private Graph graph;

    public Vertex(Character label)
    {
        this.label = label;
        incidentEdges = new HashSet<Edge>();
    }
    
    public void bindGraph(Graph g)
    {
        if (graph != null)
            unbindGraph();        
        this.graph = g;
    }
    
    public void unbindGraph()
    {
        for (Edge e : incidentEdges)
            graph.removeEdge(e);
        
        this.graph = null;
    }
    
    public void bindEdge(Edge e)
    {
        this.incidentEdges.add(e);
    }
    
    public void unbindEdge(Edge e)
    {
        this.incidentEdges.remove(e);
    }
    
    public void setGraph(Graph g)
    {
        graph = g;
    }
    
    public String toString()
    {
        return Character.toString(label);
    }

    public Graph getGraph()
    {
        return graph;
    }

    public boolean sameGraphAs(Vertex v)
    {
        return graph == v.getGraph();
    }

}
