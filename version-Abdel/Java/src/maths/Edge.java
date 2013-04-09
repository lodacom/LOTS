package maths;

import exceptions.NotSameGraphException;

/*
 * Invariants 
 * - x et y sont nuls tout les deux
 * - x et y sont non nuls tout les deux
 * - x, y et this sont dans le m�me graphe
 */
public class Edge
{
    private Vertex x;
    private Vertex y;
    private Graph graph;
    
    public Edge()
    {}
    
    public Edge(Vertex v1, Vertex v2)
    {
        this.bindVertice(v1, v2);
    }
    
    public void unbindGraph()
    {     
        this.graph = null;
        
        // On quitte le graphe, on ne r�f�rence donc plus les sommets x et y.
        unbindVertice();
    }
    
    public void bindVertice(Vertex v1, Vertex v2)
    {
    	try
    	{
	        if (!v1.sameGraphAs(v2) || v1.getGraph() == null || v2.getGraph() == null)
	            throw new NotSameGraphException("Les 2 sommets ne sont pas dans le m�me graphe."); 
	        
	        if (!this.sameGraphAs(v2) && graph != null)
	            throw new NotSameGraphException("L'arete n'est pas dans le m�me graphe que les 2 sommets.");
    	}
    	catch (NotSameGraphException e)
    	{
    		e.printStackTrace();
    	}
    	
        // Tout va bien on peut y aller.
        
        if (graph == null)
        {
            graph = v1.getGraph();
            graph.bindEdge(this);
        }
        
        this.x = v1;
        this.y = v2;
        
        v1.bindEdge(this);
        v2.bindEdge(this);
    }
   
    private boolean sameGraphAs(Vertex v)
    {
        return graph == v.getGraph();
    }

    public void unbindVertice()
    {
        x.unbindEdge(this);
        x = null;
        
        y.unbindEdge(this);
        y = null;
    }
    
    public String toString()
    {
        return String.format("(%s, %s)", x, y);
    }
}
