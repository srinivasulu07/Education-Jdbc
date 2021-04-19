package com.loan.eduaction.dao;


import java.sql.*;
public class RetrievePrepared{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/mysql","root","Deepika$69");

PreparedStatement stmt=con.prepareStatement("select Id,Name from students");
ResultSet rs=stmt.executeQuery();
while(rs.next()){
System.out.println(rs.getInt(1)+" "+rs.getString(2));
}

con.close();

}catch(Exception e){ System.out.println(e);}

}
}
