public class OldCollection extends Collection
{
    private Tag root;
    public void AddIterator()
    {
        //add an iterator to the collection
    }
    
    public void removeIterator()
    {
        //remove an iterator from the collection
    }
    
    public void CreateCollection(string html)
    {
        CreateDocument(html);
    }

    private void CreateDocument(String htmlstring)
    {
        StringBuilder stripedhtml = new StringBuilder(htmlstring.replaceAll("\r \n \t", ""));
        root = CreateFromString(stripedhtml);
    }

    private Tag CreateFromString(StringBuilder htmlstring)
    {
        String name;
        String parameters;
        String text;
        
        int firstspace = htmlstring.indexOf(" ");
        int firstclose = htmlstring.indexOf(">");
        int nextopen = htmlstring.indexOf("<",firstclose);
        
        if(firstclose < firstspace)
        {
            name = htmlstring.substring(1,firstclose);
            parameters = "";
        }
        else
        {	
            name = htmlstring.substring(1,firstspace);
            parameters = htmlstring.substring(firstspace,firstclose);
        }
        text = htmlstring.substring(firstclose + 1,nextopen);
        
        Tag toReturn = new Tag(name,parameters,text);
        
        htmlstring.delete(0,nextopen);
        while(!htmlstring.substring(0,name.length() + closetagoffset).equals("</" + name + ">"))
        {		
            toReturn.addchild(CreateFromString(htmlstring));
        }
        
        htmlstring.delete(0,name.length() + closetagoffset);
        return toReturn;
    }
    
    public string toString()
    {
        return root.toString();
    }
}