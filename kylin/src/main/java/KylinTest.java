import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created by jinhuai.zeng on 17年8月3日.
 */
public class KylinTest {
    public static void main(String[] args) throws Exception {
        // 加载Kylin的JDBC驱动程序
        Driver driver = (Driver) Class.forName("org.apache.kylin.jdbc.Driver").newInstance();

        // 配置登录Kylin的用户名和密码
        Properties info= new Properties();
        info.put("user","ADMIN");
        info.put("password","KYLIN");
        String sql= "select dt,count(*) from user_info group by dt order by dt;";

        System.out.println(sql);
        // 连接Kylin服务
        Connection conn= driver.connect("jdbc:kylin://localhost:7070/user_info",info);
        Statement state= conn.createStatement();

        ResultSet resultSet =state.executeQuery(sql);

        while(resultSet.next()) {
            String col1 = resultSet.getString(1);
            String col2 = resultSet.getString(2);
            //String col3 = resultSet.getString(3);
            System.out.println(col1+ "\t" + col2 );
        }
    }
}
