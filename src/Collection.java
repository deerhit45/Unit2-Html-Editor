//an interface for collections that store html data 
public interface Collection
{
	void addIterator();         //adds an iterator for moving though a collcetion
	void removeIterator();      //removes an iterator 
	void createCollection(String str);    //creates the collection from a string
}