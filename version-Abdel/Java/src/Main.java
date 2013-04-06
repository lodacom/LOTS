import chemistry.Atom;
import exceptions.NotSameGraphException;
import maths.*;

public class Main
{
    public static void main(String[] args)
    {
        Graph g = new Graph("G1");
        
        Vertex v1 = new Atom('a');
        Vertex v2 = new Vertex('b');
        g.addVertex(v1);
        g.addVertex(v2);

        try
        {
            Edge e1 = new Edge(v1, v2);
            //g.removeEdge(e1);
        }
        catch (NotSameGraphException e)
        {
            e.printStackTrace();
        }
        
        //g.removeVertex(v1);
        
        System.out.println(g);
    }
}
