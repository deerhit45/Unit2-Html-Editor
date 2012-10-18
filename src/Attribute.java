//decorator for an html tag that has an atrtibutge
public class Attribute extends TagComponents
{
    private string attribute;   //the attribute of the tag
    
    //constrcutr that has the attribute for the tag
    public Atribute(string attributein)
    {
        attribute = attributein;
    }
    
    //returns the tag with the name and attribute properly formatted
    public String getText()
    {
        //call super.getText to get wrapped tag text
        //insert attribute into the name string and return it
        return "";
    }
}