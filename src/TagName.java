//the concrete base of the decorator pattern has the name of the tag
public class TagName implements HTMLTag
{
    private String name;
    //default constructor that takes in the name of the tag
    public TagName(String namein)
    {
        name = namein;
    }
    
    //returns the text of the tag
    public String getText()
    {
        //should return the formatted html that can be decorated with a decorator
        return name;
    }
}