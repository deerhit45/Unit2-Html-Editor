public class TagName extends HTMLTag
{
    private string name;
    //default constructor that takes in the name of the tag
    public TagName(string namein)
    {
        name = namein;
    }
    
    public string getText()
    {
        //should return the formatted html that can be decorated with a decorator
        return name;
    }
}