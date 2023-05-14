
package hotel.management.system;

    import java.sql.*;


public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try {

//            Class.forName("com.sql.cj.jdbc.Driver");
//it will call it internally
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root","yash");
            s=c.createStatement();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

