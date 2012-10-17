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
private Collection datacollection;
private final int closetagoffset = 3;

public static void main(String[] args)
{
	String testhtml = "<html><body><h1>My First Heading</h1><p>My first paragraph.</p></body></html>";
	Document doc = new Document("test",testhtml);
	System.out.println(doc.toString());
}

public Document(String name,String htmlstring) 
{
	this.name = name;
	timestamp = new Date();
	datacollection = new TreeCollection();
    datacollection.createCollection(htmlstring);
}
public String getName() {S
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
    datacollection.createCollection(html);
}

public String toString()
{
	return datacollection.toString();
}

public string SaveToMemento()
{
    return Collection.toString();
}

}
