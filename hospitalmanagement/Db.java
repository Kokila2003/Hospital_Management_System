
package hospitalmanagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
    public static Connection mycon(){
        Connection con = null;
        
        String url, uname, password;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306/hospital";
            uname = "kokila";
            password = "kokilabca";
            con = DriverManager.getConnection(url, uname, password);
        } catch (Exception ex) {

        }
        return con;
    }
}
