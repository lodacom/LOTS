package exceptions;

@SuppressWarnings("serial")

public class NotSameGraphException extends Exception
{    
    public NotSameGraphException(String message)
    {
        super(message);
    }
}