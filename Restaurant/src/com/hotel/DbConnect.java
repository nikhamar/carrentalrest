package com.hotel;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DbConnect {

    static String caramelmacchiato;
    static String frenchvanilla;
    static String hotchocolate;
    static String chailatte;
    static String mochafrappe;
    static String mangopineapplesmoothie;
    static String cookiees;
    static String chooseanamefororder;

public DbConnect(String chooseanamefororder){

}
    public DbConnect(String caramelmacchiato, String frenchvanilla, String hotchocolate, String chailatte, String mochafrappe, String mangopineapplesmoothie, String cookiees, String chooseanamefororder) {
        this.caramelmacchiato = caramelmacchiato;
        this.frenchvanilla = frenchvanilla;
        this.hotchocolate = hotchocolate;
        this.chailatte = chailatte;
        this.mochafrappe = mochafrappe;
        this.mangopineapplesmoothie = mangopineapplesmoothie;
        this.cookiees = cookiees;
        this.chooseanamefororder = chooseanamefororder;


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

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into orders(caramelmacchiato, frenchvanilla, hotchocolate, chailatte, mochafrappe, mangopineapplesmoothie, cookiees, chooseanamefororder) values (?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, caramelmacchiato);
            preparedStatement.setString(2, frenchvanilla);
            preparedStatement.setString(3, hotchocolate);
            preparedStatement.setString(4, chailatte);
            preparedStatement.setString(5, mochafrappe);
            preparedStatement.setString(6, mangopineapplesmoothie);
            preparedStatement.setString(7, cookiees);
            preparedStatement.setString(8, chooseanamefororder);
            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("inside set value");

        }

    }

    public Map getValue(Connection connection) {

        try {

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM orders WHERE chooseanamefororder=(?)");
            preparedStatement.setString(1, chooseanamefororder);
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {

                //caramelmacchiato = resultSet.getString(" caramelmacchiato");
                frenchvanilla = resultSet.getString("frenchvanilla");
                System.out.println(frenchvanilla);
                hotchocolate = resultSet.getString("hotchocolate");
                System.out.println(hotchocolate);
                chailatte = resultSet.getString("chailatte");
                System.out.println(chailatte);
                mochafrappe = resultSet.getString("mochafrappe");
                System.out.println(mochafrappe);
                mangopineapplesmoothie = resultSet.getString("mangopineapplesmoothie");
                System.out.println(mangopineapplesmoothie);
                cookiees = resultSet.getString("cookiees");
                System.out.println(cookiees);
                chooseanamefororder = resultSet.getString("chooseanamefororder");
                System.out.println(chooseanamefororder);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("inside get value");

        }

        Map hashmap = new HashMap();
        hashmap.put("caramelmacchiato", caramelmacchiato);
        hashmap.put("frenchvanilla", frenchvanilla);
        hashmap.put("hotchocolate", hotchocolate);
        hashmap.put("chailatte", chailatte);
        hashmap.put(" mochafrappe", mochafrappe);
        hashmap.put("mangopineapplesmoothie", mangopineapplesmoothie);
        hashmap.put("cookiees", cookiees);
        hashmap.put("chooseanamefororder", chooseanamefororder);

        return hashmap;
    }


public void deleteValue(Connection connection) {

   try {
       PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM orders where chooseanamefororder=(?)");
       preparedStatement.setString(1, chooseanamefororder);
       preparedStatement.executeUpdate();
   }catch (Exception e)
   {
       System.out.println(e);
   }


}
}
