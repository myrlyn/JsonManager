/**
 * 
 */
package jerseyservice;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * @author myrlyn
 *
 */
@Path("/")
public class Service {
	public static String[] versions = {"v1"};
	/**
	 * 
	 */
	public Service() {
		// no public constructoractions  needed
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String[] getVersions(){
		return versions;
	}

}
