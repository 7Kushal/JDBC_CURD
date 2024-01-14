import java.sql.*;
import java.lang.*;
public class demoJDBC {
    public static void main(String[] args) throws Exception{
        /*
            7 Steps
            1. Import package
            2. Load and register
            3. create connection
            4. execute statement
            5. process the results
            6. close
         */
        // load the driver
        System.out.println("Hello");
        Class.forName("org.postgresql.Driver");

        //now create connection
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String uname ="postgres";
        String pass = "9672";
        String sql = "select * from public.student";
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection established \n>--------------------");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
//        rs is an cursor we more to read data, so intially it is at -1 index, rs.next() move it to first row
//        System.out.println(rs.next()); // it resturn true because we have at least one row

//        --------------Reading data from an postgreSQL----------------------
        System.out.println("SID - Name - Marks");
        while(rs.next()) {
            System.out.print(rs.getInt(1)+ " - ");
            System.out.print(rs.getString(2)+ " - ");
            System.out.print(rs.getInt(3));
            System.out.println();
        }
        con.close();
        System.out.println("Connection closed \n>---------------------");

        // ------------ Inserting data into an table------------------

    }
}
