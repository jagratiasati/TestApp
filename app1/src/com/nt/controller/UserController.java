package com.nt.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.UserDAO;
import com.nt.model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/getUserList")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher  rd=request.getRequestDispatcher("/result.jsp");
		UserDAO dao=new UserDAO();
		try {
			List<User> users=dao.getAllUserInfo();
			request.setAttribute("userInfo",users);
		} catch (SQLException | ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
