import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DbConnect {

    static String uname;
    static String pswd;
    public DbConnect(){

    }

    public DbConnect(String uname, String pswd) {
        this.uname = uname;
        this.pswd = pswd;

    }

    public Connection createConnection() {

        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Nikhiladmin1");

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }

    public void setValue(Connection connection) {


        try {

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into Registrationtable(uname,pswd) values (?,?)");
            preparedStatement.setString(1, uname);
            preparedStatement.setString(2, pswd);
            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("inside set value");

        }

    }

    public Map getValue(Connection connection) {

        try {

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT  uname,pswd FROM Registrationtable WHERE uname=(?)");
            preparedStatement.setString(1, uname);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                uname = resultSet.getString("uname");
                pswd = resultSet.getString("pswd");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("inside get value");

        }

        Map hashmap = new HashMap();
        hashmap.put("uname", uname);
        hashmap.put("pswd", pswd);
        return hashmap;
    }


//public void deleteValue(Connection connection)throws Exception{
//        PreparedStatement preparedStatement= connection.prepareStatement("DELETE FROM ")
//
//}
}

