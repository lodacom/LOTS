package maths;

import java.util.HashSet;

import exceptions.NotSameGraphException;

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
        this.bindVertex(v);
        v.bindGraph(this);
    }
    
    public void removeVertex(Vertex v)
    {
        this.unbindVertex(v);
        v.unbindGraph();
    }
    
    public void bindVertex(Vertex v)
    {
        this.vertice.add(v);        
    }
    
    public void unbindVertex(Vertex v)
    {
        this.vertice.remove(v);
    }
    
    public void addEdge(Edge e, Vertex v1, Vertex v2) throws NotSameGraphException
    {
            e.bindVertice(v1, v2);
            this.bindEdge(e);
    }
    
    public void removeEdge(Edge e)
    {
        this.unbindEdge(e);
        e.unbindGraph();
    }
   
    public void bindEdge(Edge e)
    {
        this.edges.add(e); 
    }
    
    public void unbindEdge(Edge e)
    {
        this.edges.remove(e);
    }
    
    public String toString()
    {
        return String.format("%s \nV = %s \nE = %s", name, vertice, edges)
                     .replace('[', '{')
                     .replace(']', '}');
    }
}