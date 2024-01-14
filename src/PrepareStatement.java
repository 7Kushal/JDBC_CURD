import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareStatement {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        String url ="jdbc:postgresql://localhost:5432/postgres";
        String uname="postgres";
        String pass = "9672";
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Successfully connected to your database");

        String sql = " insert into student values(?,?,?)";
        int sid = 5;
        String sname ="wick";
        int marks = 50;
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);

        st.execute();
    }
}
