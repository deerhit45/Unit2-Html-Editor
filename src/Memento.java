public class Memento
{
    private Document snapshot;
    
    public Memento()
    {
        
    }
    
    public Memento(Document snap)
    {
        snapshot = snap;
    }
    
    public SetState(Document state)
    {
        snapshot = state;
    }
}