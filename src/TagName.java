//the concrete base of the decorator pattern has the name of the tag
public class TagName extends HTMLTag
{
    private string name;
    //default constructor that takes in the name of the tag
    public TagName(string namein)
    {
        name = namein;
    }
    
    //returns the text of the tag
    public string getText()
    {
        //should return the formatted html that can be decorated with a decorator
        return name;
    }
}