import java.util.Date;

/**
 * 
 */

/**
 * @author glp7951
 *
 */
 
//document object that stores the collection of html data and the timestamp of the data as well as the name of the file
//is the originator for the mimento pattern
public class Document {
private String name;            //name of the file of html
private Date timestamp;         //the timestamp of teh data  
private Collection datacollection;//collection of html data, can choose from multiple concrete implementations of collection
private final int closetagoffset = 3; //some offset constant for something

//main for debugging document creation and stuff
public static void main(String[] args)
{
	String testhtml = "<html><body><h1>My First Heading</h1><p>My first paragraph.</p></body></html>";
	Document doc = new Document("test",testhtml);
	System.out.println(doc.toString());
}

//Constructor for a Document, needs a name and a html string to build a new docuemnt
public Document(String name,String htmlstring) 
{
	this.name = name;
	timestamp = new Date();
	datacollection = new TreeCollection();
    datacollection.createCollection(htmlstring);
}

//returns the name of the doucment
public String getName() {
	return name;
}

//sets the name of the domeucment to the provided name
public void setName(String name)
{
	this.name = name;
}

//gets the most recient time stamp of the document
public Date getTimestamp() {
	return timestamp;
}

//updates the docment collection to reflect the provided html string
public void updateDocument(String html)
{
    datacollection.createCollection(html);
}

//returns a string representation of the data stored in the data collection
public String toString()
{
	return datacollection.toString();
}

//returns the state of the object to a caretaker
public Memento SaveToMemento()
{
    return new Memento(datacollection.toString());
}

}
