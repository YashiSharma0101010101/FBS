package com.jsp.Flight_Ticket_Booking_Project.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class FlightConnection 
{
   public static Connection getFlightConnection()
   {
	   
	   
	   try {
		 Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 String url="jdbc:mysql://localhost:3306/flightbooking";
		 String user="root";
		 String password="kado";
		  
		return DriverManager.getConnection(url, user, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return null;
   }
}
