import maths.Edge;
import maths.Graph;
import maths.Vertex;
import chemistry.Atom;


public class Main
{
    public static void main(String[] args)
    {
        Graph g = new Graph("G1");
        
        Vertex v1 = new Atom('a');
        Vertex v2 = new Vertex('b');
        g.addVertex(v1);
        g.addVertex(v2);

        Edge e1 = new Edge(v1, v2);
        //g.removeEdge(e1);
                
        //g.removeVertex(v1);
        
        System.out.println(g);
    }
}
