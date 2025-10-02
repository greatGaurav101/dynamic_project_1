package com.org.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet {
	public RegistrationController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession sessi = req.getSession(false);// refer that session obj and get it's user loggedin userId
		String str = (String) sessi.getAttribute("emaill");

		req.setAttribute("session", str);
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/registration.jsp");
		rd.forward(req, resp);

	}

}
