package com.smartflow.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartflow.enums.ErrorCode;
import com.smartflow.enums.SensorType;
import com.smartflow.logics.SmartWater;
import com.smartflow.utilities.OwnException;

public class RequestHandler {

	
	public void handleUser(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		try {
			
		SmartWater logic = new  SmartWater();
		String username =  request.getParameter("username");
		String password = request.getParameter("password");
		logic.checkPassword(username, password);

		
		response.sendRedirect("/smartFlow/dashboard");
	}catch (OwnException e) {
		if(e.getErrorCode() == ErrorCode.INVALID_USER || e.getErrorCode() == ErrorCode.WRONG_PASSWORD) {
			System.out.println("wrong password");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/login.jsp");
			dispatcher.forward(request, response);	
		}
		} 
	}
	
	public void handleDashboard(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		SmartWater logic = new SmartWater();
		request.setAttribute("voltageR", logic.getRecentSensorData(SensorType.VOLTAGE_R, 1) );
		request.setAttribute("voltageY", logic.getRecentSensorData(SensorType.VOLTAGE_Y, 1 ));
		request.setAttribute("voltageB", logic.getRecentSensorData(SensorType.VOLTAGE_B, 1 ));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/dashboard.jsp");
		dispatcher.forward(request, response);	
	}
}
