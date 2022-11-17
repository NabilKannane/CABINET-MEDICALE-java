import java.sql.*;

public class Database {
    public Database() throws Exception{
        String url = "jdbc:oracle:thin:@//localhost:1521/xe";
        String username = "system";
        String password = "system";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from medecins");

            while (rs.next()) {
                System.out.println(rs.getString("nom") + "|" + rs.getString("prenom") + "|" + rs.getString("titre"));
            }
        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}