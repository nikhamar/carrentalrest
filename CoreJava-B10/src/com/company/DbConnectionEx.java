package com.company;

import org.postgresql.core.SqlCommand;

import java.sql.*;

public class DbConnectionEx {
    public static void main(String[] args) throws SQLException {

        Connection con = null;


       try{
           Class.forName("org.postgresql.Driver");

         con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Nikhiladmin1");

//        Statement statement= con.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from student");
//        while (resultSet.next()) {
//            System.out.println("name" + resultSet.getString("name"));
//            System.out.println("id"+resultSet.getString("id"));
//        }

DbConnectionEx obj=new DbConnectionEx();
//obj.setValue(con);
//obj.getValue(con);
           obj.deleteValue(con);

        }catch (Exception e){
           System.out.println(e);
       }


    }

    public void setValue(Connection con )throws SQLException{


        PreparedStatement preparedStatement=con.prepareStatement("insert into student(id, name) values (? ,? )");
        preparedStatement.setInt(1, 5);
        preparedStatement.setString(2,"Harish");
        preparedStatement.execute();
    }

    public void getValue(Connection con) throws SQLException{

        Statement statement= con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student");
        while (resultSet.next()) {
            System.out.println("name" + resultSet.getString("name"));
            System.out.println("id"+resultSet.getString("id"));
        }
    }

    public void deleteValue(Connection con) throws SQLException{
        PreparedStatement preparedStatement=con.prepareStatement("delete from student where name='Harish' ");
        preparedStatement.execute();

        getValue(con);
    }
}
