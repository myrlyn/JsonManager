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
@Path("/")
public class JerseyService {
	public static String[] versions = {"v1"};
	public static String[] environments = {"dev","ftest","ptest","staging","production","entlocal","entremote","eval"};
	public static String[] roles = {"eras","pdws","amcas","mec","mcat","convey"};
	public static String hieraDir = "C:/cygwin64/home/jwalker/fake_hiera"; 
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
