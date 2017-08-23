package jackrabbit;

import org.apache.jackrabbit.core.TransientRepository;
import org.h2.engine.Session;
import javax.jcr.Repository;
import javax.security.auth.login.LoginException;
import java.io.IOException;

/**
 * Created by jinhuai.zeng on 17年8月22日.
 */
public class JackrabbitPlugin implements PlugIn{
    public static Session session;
    public void destroy() {
        session.logout();
    }
    public void init(ActionServlet actionServlet, ModuleConfig moduleConfig)
            throws ServletException {
        try {
            System.setProperty("org.apache.jackrabbit.repository.home",
                    "c:/temp/Blogging");
            Repository repository = new TransientRepository();
            session = repository.login(new SimpleCredentials("username",
                    "password".toCharArray()));
        } catch (LoginException e) {
            throw new ServletException(e);
        } catch (IOException e) {
            throw new ServletException(e);
        } catch (RepositoryException e) {
            throw new ServletException(e);
        }
    }
    public static Session getSession() {
        return session;
    }
}
