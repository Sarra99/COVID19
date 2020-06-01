
package covid_19;
import java.sql.*;
import javax.swing.JOptionPane;

public class Connexion {
    public static Connection ConJava() {
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
        return c;
    }
    catch (Exception e) 
    { JOptionPane.showMessageDialog(null, e);}
    return null;
}
    
}
