package chemistry;

import maths.Edge;
import maths.Graph;
import maths.Vertex;

public class Molecule extends Graph
{
    public Molecule(String name)
    {
        super(name);
    }
    
    public void addVertex(Atom a)
    {
        super.addVertex(a);
    }
    
    @Override
    public void addVertex(Vertex v)
    {
        try
        {
            addVertex((Atom) v);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void addEdge(Edge a, Vertex v1, Vertex v2)
    {
        try
        {
            addEdge((Bond) a, (Atom) v1, (Atom) v2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void addEdge(Bond b, Atom a1, Atom a2)
    {
        super.addEdge(b, a1, a2);
    }
}
