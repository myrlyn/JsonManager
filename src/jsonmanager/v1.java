/**
 * 
 */
package jsonmanager;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.google.gson.*;
import java.util.Set;
/**
 * @author jwalker
 *
 */
@Path("/v1")
public class v1 {

	/**
	 * 
	 */
	public static String[] endpoints = {"/environments"};
	
	public v1() {

	}
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public static String [] endpoints(){
		return endpoints	;
	}
	
	
	
	@GET
	@Path("/environments")
	@Produces(MediaType.APPLICATION_JSON)
	public static String [] getEnvs(){
		return jsonmanager.JerseyService.environments;	
	}
	@GET
	@Path("/roles")
	@Produces(MediaType.APPLICATION_JSON)
	public static String [] getRoles(){
		return jsonmanager.JerseyService.roles;	
	}
	@GET
	@Path("/roleinfo")
	@Produces(MediaType.APPLICATION_JSON)
	public static String [] getRoleInfo(){
		return null;	
	}
	@GET
	@Path("/pmpResources")
	@Produces(MediaType.APPLICATION_JSON)
	public static String[] getPmpResources(){
			Gson gson = new Gson();
			pmpEntries p = gson.fromJson(pmpReader.getPasswords("eval"), pmpEntries.class);
			String[] s = p.pmp.keySet().toArray(new String[0]);
			return s;
	}
	
}
