package org.vinod.PrepSta;

import static org.vinod.PrepSta.DBConstant.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo8 {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		String qry="insert into emp123 values(?,?,?)";

		try {
			Class.forName(MYDRIVER);
			con=DriverManager.getConnection(MYURL, USER, PASS);
			pstmt=con.prepareStatement(qry);

			pstmt.setString(1,"38");
			pstmt.setString(2,"Sangeeta");
			pstmt.setInt(3,25000);

			int no=pstmt.executeUpdate();
			System.out.println(no+" Records inserted");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
