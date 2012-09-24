//invoker
public class CommandInvoker {
	
	private Command command;
	private Editor model;
	private SaveCommand sc = new SaveCommand();
	
	public void CommandInvoker(Editor model){
		this.model = model;
	}//Coon
	
	public void setCommand(Command command){
		this.command = command;
	}//set
	
	public void runCommand(String nameCommand){
		if (nameCommand == "Save"){
			System.out.println("Got here");
			sc.excute();
		}
	}//run
}
