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
        info.put("user","jinhuai.zeng");
        info.put("password","");
        String sql="select \n" + "  busi_type,\n" + "  pay_way,\n" + "  count(distinct unique_key) \n" + "from \n"
                + "  fact_payinfo t1 \n" + "  join dim_busi t2\n" + "  on(t1.busi_key=t2.busi_key) \n"
                + "  join dim_payway t3\n" + "  on(t1.pay_way_key=t3.pay_way_key)\n" + "group by \n"
                + "  t2.busi_type,\n" + "  t3.pay_way\n" + "order by \n" + "  t2.busi_type,\n" + "  t3.pay_way;";

        System.out.println(sql);
        // 连接Kylin服务
        Connection conn= driver.connect("jdbc:kylin://kylin.corp.qunar.com/paydev_mods",info);
        Statement state= conn.createStatement();

        ResultSet resultSet =state.executeQuery(sql);

        while(resultSet.next()) {
            String col1 = resultSet.getString(1);
            String col2 = resultSet.getString(2);
            String col3 = resultSet.getString(3);
            System.out.println(col1+ "\t" + col2 + "\t" + col3);
        }
    }
}
