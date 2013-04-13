package maths;

import java.util.HashSet;

public class Graph
{
    private String name;
    private HashSet<Vertex> vertice;
    private HashSet<Edge> edges;

    public Graph(String name)
    {
        this.name = name;
        vertice = new HashSet<Vertex>();
        edges = new HashSet<Edge>();
    }

    public Graph()
    {
        vertice = new HashSet<Vertex>();
        edges = new HashSet<Edge>();
    }

    public void addVertex(Vertex v)
    {
        this.vertice.add(v);
        v.bindGraph(this);
    }

    public void removeVertex(Vertex v)
    {
        this.vertice.remove(v);
        v.unbindGraph();
    }

    public void addEdge(Edge e, Vertex v1, Vertex v2)
    {
        e.bindVertice(v1, v2);
        this.edges.add(e);
    }

    public void removeEdge(Edge e)
    {
        this.edges.remove(e);
        e.unbindGraph();
    }

    

    public HashSet<Edge> getEdges()
    {
        return edges;
    }


    public String toString()
    {
        return String.format("%s \nV = %s \nE = %s", name, vertice, edges)
                .replace('[', '{').replace(']', '}');
    }
}