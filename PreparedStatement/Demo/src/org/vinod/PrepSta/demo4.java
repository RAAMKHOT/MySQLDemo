package org.vinod.PrepSta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo4 {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		String qry="update emp123 set name=? where id=?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "krutika");
			pstmt=con.prepareStatement(qry);

			pstmt.setString(1,"sangu");
			pstmt.setString(2, "4");
			
			int no=pstmt.executeUpdate();
			System.out.println(no+" Records updated successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
