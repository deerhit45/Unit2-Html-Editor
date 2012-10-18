import java.util.Stack;

//gonna need Stack lib?

//session is the class that holds the data for each of the tabs in the tab veiw
//it has a document and an error log for displaying information to the user
//it is also hte caretaker for the mentos pattern so it holds the mementos and can restore from one
 
public class Session {
private Document doc;       //the document object that holds html data
private String errorLog;    //the error log that holds error data for incorreclty formed html
private Stack<Memento> mementos;   //stack of mementos to restore from when an undo is called

//constructor for the session
//name is the name of the doucment
//html is the text of the doucment
//error is the current error log for the html
public Session(String name, String html,String error) {
	super();
	doc = new Document(name,html);
	errorLog = error;
}

//returns the error log
public String getErrorLog() {
	return errorLog;
}

//sets the error log to the provided string
public void setErrorLog(String errorLog) {
	this.errorLog = errorLog;
}

//returns the name of the session document
public String getName()
{
	return this.doc.getName();
}

//changes the name of the doucment to the provided name
public void setName(String newName)
{
	this.doc.setName(newName);
}

//updates the document to the new provided html represenetation string
public void updateDocument(String html)
{
	this.doc.updateDocument(html);
}

//returns the document as a string
public String getDoc()
{
	return doc.toString();
}

//adds a new snapshot of the document to restore to
private void addMemento()
{
    mementos.push((doc.SaveToMemento()));
}

//restores the state of document to the most recient snapshot
private void RestoreFromMemento()
{
    try
    {
        updateDocument(mementos.pop().GetState());
    }
    finally{};//catch empty stack
}
}
