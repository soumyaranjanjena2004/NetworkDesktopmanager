import java.util.ArrayList;

public class GetSystemProcess {
public ArrayList<ProcessHandle> process;
GetSystemProcess(){
	this.process = new ArrayList<ProcessHandle>();
}
public ArrayList<ProcessHandle> getProcess(){
	ProcessHandle.allProcesses()
    .forEach(pro -> process.add(pro));
	return process;
	
}
}