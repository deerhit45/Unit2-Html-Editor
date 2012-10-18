//the memento class that stores states of the docuemnt for the undo command
public class Memento
{
    private String snapshot; //the saved state of a document
    
    //constructor for a blank momento
    public Memento()
    {
        
    }
    
    //constructor for a memento that has a given defualt state
    public Memento(String snap)
    {
        snapshot = snap;
    }
    
    //changes the state fo the memento to the provided state
    public void SetState(String state)
    {
        snapshot = state;
    }
    
    //returns the state stored in the memento
    public String GetState()
    {
        return snapshot;
    }
}