import maths.Edge;
import maths.Graph;
import maths.Vertex;
import chemistry.Atom;
import chemistry.Molecule;


public class Main
{
    public static void main(String[] args)
    {
        Graph g = new Graph("G1");
        
        Vertex v1 = new Atom('a');
        Vertex v2 = new Vertex('b');
        g.addVertex(v1);
        g.addVertex(v2);

        new Edge(v1, v2); // est ajouté à g automatiquement.
        
        
        Molecule m = new Molecule("M1");
        
        
        
        
        System.out.println(g);
    }
}
