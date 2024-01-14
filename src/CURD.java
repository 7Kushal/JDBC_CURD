import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CURD {
    public static void main(String[] args) throws Exception{
        Class.forName("org.postgresql.Driver");
        String url ="jdbc:postgresql://localhost:5432/postgres";
        String uname="postgres";
        String pass = "9672";
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Successfully connected to your database");

        // Insert (CREATE of CURD operations)
        String sql = "insert into student values(4,'john',30)";
        Statement st = con.createStatement();
//        boolean s0 = st.execute(sql);
//        System.out.println(s0);

        // Update Query ( U of Curd operations)

        String sql1 = "update student set name='maxi' where sid =2";
        boolean s1 = st.execute(sql1);
        System.out.println(s1);


        // Delete an entry from database is D of curd operations
        con.close();
        System.out.println("Connection closed");
    }
}
