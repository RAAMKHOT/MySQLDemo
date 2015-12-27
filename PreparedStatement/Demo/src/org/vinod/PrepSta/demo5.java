package org.vinod.PrepSta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo5 {
	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		String qry="update emp123 set salary=? where id=?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "krutika");
			pstmt=con.prepareStatement(qry);

			pstmt.setInt(1,5000);
			pstmt.setString(2, "5");
			
			int no=pstmt.executeUpdate();
			System.out.println(no+" Records updated successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
