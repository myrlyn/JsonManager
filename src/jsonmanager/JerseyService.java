/**
 * 
 */
package jsonmanager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
/**
 * @author myrlyn
 *
 */
@Path("/versions")
public class JerseyService {

	/**
	 * 
	 */
	public JerseyService() {
		// TODO Auto-generated constructor stub
	}
	@GET
	public String getVersions(){
		return "v1";
	}

}
