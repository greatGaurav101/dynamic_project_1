package com.org.controller;

import java.io.IOException;

import com.ems.model.DBServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String passwd = req.getParameter("password");

		DBServiceImpl service = new DBServiceImpl(); // Controller is calling the Model/service layer
		service.connectDB();

		boolean status = service.verifyLogin(email, passwd);

		req.setAttribute("error msg", "wrong credentials");

		if (status) {
			HttpSession session = req.getSession(true);// true means create a new session object good parctice //not
														// mandatory
			session.setAttribute("emaill", email);// this session obj will have data per user i.e for each user it will
													// differernt

			// RequestDispatcher rd = req.getRequestDispatcher("reg");//calling reg
			// controller directly
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/registration.jsp");
			rd.forward(req, resp);

		} else {
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
		}
	}
// index.jsp -- >logincontroller --> DB -->false -- index.jsp
//                                         true -- > set session -- reg.jsp --> regController -get session
}
