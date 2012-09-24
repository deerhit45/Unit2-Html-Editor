/**
 * 
 */

/**
 * @author djh3315
 *
 */
public class Parser {

	/**
	 * @param args
	 */
	//public static void main(String[] args) {
	//	// TODO Auto-generated method stub
	//}
	public static String isValid(String htmlinput){
		return htmlinput;
	}
	public static String updateView(String htmlinput){
		return htmlinput;
	}
	
	private void validityCheck(StringBuilder htmlstring)
	{
		try{
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
			//Check name to ensure valid tag
			//Check parameter to ensure a valid parameter for the tag
			//Check text to ensure a valid text input
			htmlstring.delete(0,nextopen);
			while(!htmlstring.substring(0,name.length() + 3).equals("</" + name + ">"))
			{		
				validityCheck(htmlstring);
			}
			
			htmlstring.delete(0,name.length() + 3);
		} catch(Exception e){
			//throw new Exception(String error){
				
			//}
		}
	}

}

//class parserException extends Exception{
//	public parserException(){
//		
//	}
//	public parserMessage(String message){
//		super(message);
//	}
//}
