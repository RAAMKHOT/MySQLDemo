package org.vinod.PrepSta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class demo2 {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		String qry="select * from emp123 where id=?";
		int i=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "krutika");
			pstmt=con.prepareStatement(qry);

			pstmt.setString(1,"5");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				i=++i;
				String eid=rs.getString("id");
				String ename=rs.getString("name");
				int sal=rs.getInt("salary");

				System.out.println(eid+" "+ename+" "+sal);
			}	
			if(i==0)
			{
				System.out.println("Record Not Found");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
