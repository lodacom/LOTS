package maths;

import exceptions.ChimereException;
import exceptions.NotSameGraphException;

/*
 * Invariants - x et y sont nuls tout les deux - x et y sont non nuls tout les
 * deux - x, y et this sont dans le mÔøΩme graphe
 */
public class Edge
{
    private Vertex x;
    private Vertex y;
    private Graph graph;

    public Edge()
    {
    }

    public Edge(Vertex v1, Vertex v2)
    {
        this.bindVertice(v1, v2);
    }

    public void unbindGraph()
    {
        this.graph = null;

        // On quitte le graphe, on ne référence donc plus les sommets x et
        // y.
        unbindVertice();
    }

    public void bindVertice(Vertex v1, Vertex v2)
    {
        try
        {
            if (!v1.sameGraphAs(v2) || v1.getGraph() == null
                    || v2.getGraph() == null)
                throw new NotSameGraphException(
                        "Les 2 sommets ne sont pas dans le même graphe.");

            if (!this.sameGraphAs(v2) && graph != null)
                throw new NotSameGraphException(
                        "L'arete n'est pas dans le même graphe que les 2 sommets.");
            
            checkTypesBeforeBinding(v1, v2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // Tout va bien on peut y aller.

        if (graph == null)
        {
            graph = v1.getGraph();
            graph.getEdges().add(this);
        }

        this.x = v1;
        this.y = v2;

        v1.bindEdge(this);
        v2.bindEdge(this);
    }

    protected void checkTypesBeforeBinding(Vertex v1, Vertex v2) throws ChimereException
    {
        if (!(v1 instanceof Vertex && v2 instanceof Vertex))
            throw new ChimereException("Il me faut des sommets pas des cacahuètes");
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
