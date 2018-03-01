package jsonmanager;
import java.io.File;
import java.nio.file.Files;
import java.io.FileReader;
import com.google.gson.*;

public class pmpReader {
	
	public pmpReader() {

	}
	public static String getPasswords(String env)  {
		Gson gson = new Gson();
		pmpEntries s = new pmpEntries();
		try {
			s = gson.fromJson(new FileReader(jsonmanager.JerseyService.hieraDir + File.separator + env + File.separator + "acctdata.json"), pmpEntries.class);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		
	return gson.toJson(s);	
	}

}
