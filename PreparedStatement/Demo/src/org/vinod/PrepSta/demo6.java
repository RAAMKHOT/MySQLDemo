package org.vinod.PrepSta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class demo6 {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		String qry="insert into emp123 values(?,?,?)";

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the id");
		String id=scan.next();

		System.out.println("Enter the name");
		String name=scan.next();

		System.out.println("Enter the Salary");
		int sal=scan.nextInt();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "krutika");
			pstmt=con.prepareStatement(qry);

			pstmt.setString(1, "id");
			pstmt.setString(2, "name");
			pstmt.setInt(3, sal);

			int no=pstmt.executeUpdate();
			System.out.println(no+" Records inserted");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
