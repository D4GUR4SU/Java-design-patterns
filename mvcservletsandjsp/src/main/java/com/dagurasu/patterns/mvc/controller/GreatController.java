package com.dagurasu.patterns.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dagurasu.patterns.mvc.model.GreatModel;

@WebServlet("/greatController")
public class GreatController extends HttpServlet {
		private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			int num1 = Integer.parseInt(request.getParameter("number1"));
			int num2 = Integer.parseInt(request.getParameter("number2"));

			GreatModel model = new GreatModel();
			int result = model.greatNumber(num1, num2);
			request.setAttribute("great-result", result);

			RequestDispatcher dispatcher = request.getRequestDispatcher("great-result.jsp");
			dispatcher.forward(request, response);
		}
}
