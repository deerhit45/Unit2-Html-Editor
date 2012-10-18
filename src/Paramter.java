//decorator for an html tag that als ohas a parameter
public class Parameter extends TagComponents
{
    private string parameter;   //the parameter of the html line
    
    //copnstructer hat ths hteiod  as parameter
    public parameter(string parameterin)
    {
        parameter = paramterin;
    }
    
    //the returns the dtext of the string paramter tag
    public String getText()
    {
        //call super.getText to get wrapped tag text
        //insert parameter into the name string and return it
        return "";
    }
}