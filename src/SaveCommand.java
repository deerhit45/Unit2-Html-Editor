import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class SaveCommand implements Command {

	@Override
	public void excute() {
		String fileName = JOptionPane.showInputDialog(null, "Name of File to be Saved? dont add the .html");
		try{
			  // Create file 
			  FileWriter fstream = new FileWriter( fileName + ".html");
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write("This is a test");
			  //Close the output stream
			  out.close();
			  }catch (Exception ee){//Catch exception if any
			  System.err.println("Error: " + ee.getMessage());
			  }
		
	}

}
