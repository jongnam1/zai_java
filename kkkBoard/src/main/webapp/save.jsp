<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException" %>
<%@ 

try{

st=conn.createStatement();
rs=st.executeQuery(sql);
if(){
response.sendredirect("board.jsp");
return;


PreparedStatement pt = null;

sql= "insert into kkkBoard(title, guest, contents, dateling))"+"values(?,?,?,?)";
try{
    
      pt = conn.prepareStatement(sql);
      pt.setString(1,title);
      pt.setString(2,guest);
      pt.setString(3,contents);
      pt.setString(dateling);   
      pt.executeUpdate();
      
    }catch(SQLException e){
    System.out.println("등록 저장 안됨");
    e.printStaackTrace();
   }



%>