package org.vinod.PrepSta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo7 {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		String qry="delete from emp123 where salary=?";
		String MYDRIVER="com.mysql.jdbc.Driver";
		String MYURL="jdbc:mysql://localhost:3306/emp";
		String USER="root";
		String PASS="krutika";
		

		try {
			Class.forName(MYDRIVER);
			con=DriverManager.getConnection(MYURL, USER, PASS);
			pstmt=con.prepareStatement(qry);

			pstmt.setInt(1,25000);
			
			int no=pstmt.executeUpdate();
			System.out.println(no+" Records deleted successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}

}
