package chemistry;

import exceptions.ChimereException;
import maths.Edge;
import maths.Vertex;


public class Bond extends Edge
{
    public Bond(Atom a1, Atom a2)
    {
        super(a1, a2);
    }
    
    @Override
    protected void checkTypesBeforeBinding(Vertex a1, Vertex a2) throws ChimereException
    {
        if (!(a1 instanceof Atom && a2 instanceof Atom))
            throw new ChimereException("Il me faut des atomes pas des chips");
    }
}
