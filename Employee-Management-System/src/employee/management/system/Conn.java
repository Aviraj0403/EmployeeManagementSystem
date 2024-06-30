package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection con1;
    Statement stmt;

    public Conn () {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con1 = DriverManager.getConnection("jdbc:oracle:thin:@Localhost","System","aviraj");
            stmt = con1.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
