import java.util.ArrayList;
public class Editor {
	private ArrayList<Session> listOfSessions;
	private int currentsession;
	private EditorView viewGUI;
	public Editor() {
		super();
		viewGUI = new EditorView();
		viewGUI.setVisible(true);
		listOfSessions = new ArrayList<Session>();
		currentsession = 0;
	}
	public static void main(String[] args){
		Editor myEditor = new Editor();
		System.out.println("done");
	}
	public void setCurrentsession(int currentsession) {
		this.currentsession = currentsession;
	}
	
	public String getCurrentError()
	{
		return listOfSessions.get(currentsession).getErrorLog();
	}
	
	public String getCurrentDoc()
	{
		return listOfSessions.get(currentsession).getDoc(); 
	}
	
	public void updateSession(String html)
	{
		listOfSessions.get(currentsession).updateDocument(html);
	}
}
