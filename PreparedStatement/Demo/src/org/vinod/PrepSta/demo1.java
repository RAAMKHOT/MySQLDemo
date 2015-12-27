package org.vinod.PrepSta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class demo1 {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		String qry="insert into emp123 values(?,?,?)";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "krutika");
			pstmt=con.prepareStatement(qry);

			pstmt.setString(1,"3");
			pstmt.setString(2,"kushal");
			pstmt.setInt(3,5000);
			pstmt.addBatch();

			pstmt.setString(1,"4");
			pstmt.setString(2,"krutika");
			pstmt.setInt(3,4000);
			pstmt.addBatch();

			pstmt.setString(1,"5");
			pstmt.setString(2,"Anushka");
			pstmt.setInt(3,3000);
			pstmt.addBatch();

			int [] arr=pstmt.executeBatch();
			for (int i : arr) {
				System.out.println(i+" "+" Records inserted");

			}	


			/*int no=pstmt.executeUpdate();
			System.out.println(no+" Records inserted");*/

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

