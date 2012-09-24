import java.util.Date;

/**
 * 
 */

/**
 * @author glp7951
 *
 */
public class Document {
private String name;
private Date timestamp;
private Tag treeOfTags;
private final int closetagoffset = 3;

//public static void main(String[] args)
//{
//	String testhtml = "<html><body><h1>My First Heading</h1><p>My first paragraph.</p></body></html>";
//	Document doc = new Document("test",testhtml);
//	System.out.println("");
//}

public Document(String name,String htmlstring) 
{
	this.name = name;
	timestamp = new Date();
	CreateDocument(htmlstring);
}
public String getName() {
	return name;
}
public void setName(String name)
{
	this.name = name;
}
public Date getTimestamp() {
	return timestamp;
}
public void updateDocument(String html)
{
	CreateDocument(html);
}

private void CreateDocument(String htmlstring)
{
	StringBuilder stripedhtml = new StringBuilder(htmlstring.replaceAll("\r \n \t", ""));
	treeOfTags = CreateFromString(stripedhtml);
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

public String toString()
{
	return treeOfTags.toString();
}

}
