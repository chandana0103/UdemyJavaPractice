package com.practice;

import java.sql.*;
/*
steps::
1)import packages
2)load driver
3)register driver
4)create connection
5)create statement
6)execute statement
7)close
 */
public class DemoJDBC {

	public static void main(String[] args) throws Exception {

		String url="jdbc:postgresql://localhost:5432/JDBCdemo";//database name=JDBCdemo
		String uname="postgres";	//username 
		String pass="chandu";
		
		String query="select sname from student where sid=3";
		String query1="select* from student";
		String query2="insert into student values(5,'sruti',59)";
		String query3="update student set  sname='vani' where sid=3";
		
		Class.forName("org.postgresql.Driver");
	
		Connection con=DriverManager.getConnection(url,uname,pass);
		System.out.println("connection established");

		Statement st=con.createStatement();						//statement creation
		
		/************getting particular data based on id****************** */
		ResultSet rs=st.executeQuery(query);					//executing query
		//System.out.println(rs.next());
		rs.next(); //serach for the next line in table
		
		String name=rs.getString("sname");			//column name sanme present in student table
		System.out.println("name of the stuent is: "+name);
		
		/************getting all rows of a table based on columns****************/
		ResultSet rs1=st.executeQuery(query1);					//executing query
		while(rs1.next()) {//put point to next row
			System.out.print(rs1.getInt(1)+" - "); 	//fetching data based on column
			System.out.print(rs1.getString(2)+" - ");
			System.out.println(rs1.getInt(3));
		}
		
		/**********inserting data into table***********/
//		boolean status=st.execute(query2);
//		System.out.println(status);			//prints true or false,it gives false when data inserted.
		
		/**********for update,delete,insert same************/
	//	st.execute(query3);
		
		/********prepared statements******************/
		//we can also use this for updating deleting inserting
		int sid=101;
		String sname="arun";
		int marks=23;
		
		String query4="insert into student values(?,?,?)";
		PreparedStatement pt=con.prepareStatement(query4);
		pt.setInt(1,sid);	//(column no,data)
		pt.setString(2, sname);
		pt.setInt(3, marks);
		pt.execute();
		
		con.close();
		System.out.println("connection closed");
		System.out.println("data fetched");
		
	}

}
