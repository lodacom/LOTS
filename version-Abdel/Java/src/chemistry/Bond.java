package chemistry;

import exceptions.NotSameGraphException;
import maths.Edge;

public class Bond extends Edge
{
    public Bond(Atom a1, Atom a2) throws NotSameGraphException
    {
        super(a1, a2);
    }
}
