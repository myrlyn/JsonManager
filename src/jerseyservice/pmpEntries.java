package jsonmanager;
import java.util.*;

public class pmpEntries {

	public pmpEntries() {
	//TODO new Constructor
	}
	
	class GlobalEntry{
		String ENVNAME;
		String PMP;
		String[] RESOURCES;
		String USERNAME;
		String currentFile;
		String currentResource;
		String currentResourceFile;
	}
	public GlobalEntry global;
	public Map<String, Map<String, String>> pmp;
	
}
