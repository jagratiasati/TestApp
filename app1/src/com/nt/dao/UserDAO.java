package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nt.model.User;

public class UserDAO {

	public List<User> getAllUserInfo() throws SQLException, ClassNotFoundException {
		List<User> users = new ArrayList<User>();
		User user = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cryptology", "root", "root");
		Statement cst = con.createStatement();
		ResultSet rs = cst.executeQuery("select fname,lname,GENDER from userlogin");
		while (rs.next()) {
			user = new User();
			user.setFname(rs.getString(1));
			user.setLname(rs.getString(2));
			user.setGender(rs.getString(3));
			users.add(user);
		}
		return users;
	}
}
