
public class Session {
private Document doc;
private String errorLog;

public Session(String name, String html,String error) {
	super();
	doc = new Document(name,html);
	errorLog = error;
}

public String getErrorLog() {
	return errorLog;
}

public void setErrorLog(String errorLog) {
	this.errorLog = errorLog;
}

public String getName()
{
	return this.doc.getName();
}

public void setName(String newName)
{
	this.doc.setName(newName);
}

public void updateDocument(String html)
{
	this.doc.updateDocument(html);
}

public String getDoc()
{
	return doc.toString();
}
}
