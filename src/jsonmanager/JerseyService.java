/**
 * 
 */
package jsonmanager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * @author myrlyn
 *
 */
@Path("/versions")
public class JerseyService {
	String[] versions = {"v1"};
	/**
	 * 
	 */
	public JerseyService() {
		// TODO Auto-generated constructor stub
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String[] getVersions(){
		return versions;
	}

}
