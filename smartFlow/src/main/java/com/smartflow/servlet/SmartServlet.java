package com.smartflow.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartflow.pubsub.MQTTSubscriber;

public class SmartServlet extends HttpServlet /* implements ServletContextListener */ {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uri = request.getRequestURI();
	RequestHandler handler = new RequestHandler();
	
	switch (uri) {
	case "/smartFlow/login":
		RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/login.jsp");
		dispatcher.forward(request, response);		
		break;
		
	case "/smartFlow/dashboard":
		handler.handleDashboard(request, response);
		break;
		
	case "/smartFlow/water-quantity":
		
		dispatcher = request.getRequestDispatcher("/JSP/water-quantity.jsp");
		dispatcher.forward(request, response);	
		break;

	case "/smartFlow/water-quality":
		
		request.setAttribute("type", "quality");
		dispatcher = request.getRequestDispatcher("/JSP/water-quality.jsp");
		dispatcher.forward(request, response);	
		
		break;
		
	case "/smartFlow/voltage-data":
		request.setAttribute("type", "voltage");
		dispatcher = request.getRequestDispatcher("/JSP/water-quality.jsp");
		dispatcher.forward(request, response);	
		break;
	default:
		break;
	  }
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)  throws ServletException, IOException {

		String uri = request.getRequestURI();
	
		switch (uri) {
		
		case "/smartFlow/login":
			response.sendRedirect("/smartFlow/dashboard");
			break;
		}
		
	}

	/*
	 * @Override public void contextDestroyed(ServletContextEvent arg0) {
	 * 
	 * }
	 * 
	 * @Override public void contextInitialized(ServletContextEvent arg0) {
	 * MQTTSubscriber pub = new MQTTSubscriber(); pub.start();
	 * 
	 * }
	 */
	

}
