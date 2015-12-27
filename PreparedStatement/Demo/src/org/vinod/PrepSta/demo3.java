package org.vinod.PrepSta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class demo3 {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		String qry="delete from emp123 where salary=?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "krutika");
			pstmt=con.prepareStatement(qry);

			pstmt.setInt(1,4000);
			
			int no=pstmt.executeUpdate();
			System.out.println(no+" Records deleted successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
