import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jinhuai.zeng on 17年8月14日.
 */
public class H2Test {

    public static void main(String[] args) throws SQLException {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:˜/test");
        ds.setUser("sa");
        ds.setPassword("");
        Statement statement= ds.getConnection().createStatement();;
        ResultSet result = statement.executeQuery("select count(*) as c from LOG where log = 'insert users'");
     //   result.findColumn();
    }
}
