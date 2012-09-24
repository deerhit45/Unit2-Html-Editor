import java.util.ArrayList;

public class Tag {
private String name;		//name of the tag
private String parameters;	//text for the parameter section
private String text;		//text parameter for the tag
protected int level;

private ArrayList<Tag> children; 

public Tag(String name, String parameter, String text) {
	super();
	children = new ArrayList<Tag>();
	this.name = name;
	this.parameters = parameter;
	this.text = text;
	level = 0;
}

public String toString()//not correct yet, one tab per level right now
{
	String toreturn;
	toreturn = GetOpener();
	if(children.size() > 0)
	{
		toreturn += "\r\n";
		for(Tag child : children)
		{
			for(int i = 0; i < level; i++)
			{
				toreturn += "\t";
			}
			toreturn += child.toString();
			toreturn += "\r\n";
		}
		toreturn += GetCloser();
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
	child.level = this.level + 1;
}
}
