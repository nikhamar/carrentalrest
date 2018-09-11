package com.example.demo.service;

import com.example.demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceJdbc {

JdbcTemplate jdbcTemplate;

@Autowired
    public  AccountServiceJdbc(DataSource dataSource){
    jdbcTemplate= new JdbcTemplate(dataSource);

}

public List<Account> getAllAccounts(){
    List<Account> accounts=new ArrayList<>();
    accounts=jdbcTemplate.query("select * from accounts", ((resultSet, i) -> getAccountMapper(resultSet)));
    return accounts;
}
public Account getAccount(String accountnumber){
    String sql="select * from accounts where accountnumber= ?";

    return  jdbcTemplate.queryForObject(sql, new String[]{accountnumber},
            new RowMapper<Account>() {
                @Override
                public Account mapRow(ResultSet resultSet, int i) throws SQLException {
                    return getAccountMapper(resultSet);
                }
            });

}

private Account getAccountMapper(ResultSet resultSet) throws SQLException{
    Account account = new Account();
    account.setAccountnumber(resultSet.getInt("accountnumber"));
    account.setAmount(resultSet.getFloat("amount"));
    account.setAccountType(resultSet.getString("accounttype"));
    account.setAccountdescription(resultSet.getString("accountdescription"));
    return account;
}
 public  Account createAccount(Account account){
    String sql="insert into accounts (amount,accounttype,accountdescription) values (?, ?, ?)";
     KeyHolder holder= new GeneratedKeyHolder();
     jdbcTemplate.update(new PreparedStatementCreator() {
         @Override
         public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
             PreparedStatement preparedStatement=
                     connection.prepareStatement(sql, new String[]{"accountnumber"});
             preparedStatement.setString(3,account.getAccountdescription());
             preparedStatement.setString(2, account.getAccountType());
             preparedStatement.setFloat(1,account.getAmount());
             return preparedStatement ;
         }
     }, holder);
     int accountnumber = holder.getKey().intValue();
     account.setAccountnumber(accountnumber);
     return account;
 }


 public  void deleteAccount(int accountnumber){

    String sql= "select* from account where accountnumber=?";
    jdbcTemplate.update(sql,accountnumber);
 }
}


