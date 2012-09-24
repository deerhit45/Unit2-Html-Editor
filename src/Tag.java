import java.util.ArrayList;

public class Tag {
private String name;		//name of the tag
private String parameters;	//text for the parameter section
private String text;		//text parameter for the tag

private ArrayList<Tag> children; 

public Tag(String name, String parameter, String text) {
	super();
	children = new ArrayList<Tag>();
	this.name = name;
	this.parameters = parameter;
	this.text = text;
}

public String toString()//not correct yet, one tab per level right now
{
	String toreturn;
	toreturn = GetOpener();
	if(children.size() > 0)
	{
		for(Tag child : children)
		{
			toreturn += "\t" + child.toString();
		}
		toreturn += "\r\n" + GetCloser();
	}
	else
	{
		toreturn += GetCloser();
	}
	return toreturn;
}

private String GetOpener()
{
	String opener;
	opener = "<" + name + parameters + ">" + text;
	return(opener);
}

private String GetCloser()
{
	String closer;
	closer = "</" + name + ">";
	return(closer);
}

public void addchild(Tag child)
{
	children.add(child);
}
}
