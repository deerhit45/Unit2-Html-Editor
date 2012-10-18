//one concrete extension of the Traversal interface that a collection can use to iterate though html
public class TreeTraverser
{
	private HTMLTag root;   //the root of the html
	private HTMLTag children;//the chidren of the html
    public bool has(String HTMLTag)
    {
        //returns true if the collection contains the supplied tag
        return true;
    }
}