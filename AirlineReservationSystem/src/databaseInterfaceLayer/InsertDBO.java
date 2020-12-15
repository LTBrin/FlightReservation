package databaseInterfaceLayer;

import java.sql.*;
import java.util.ArrayList;
import businessLogicLayer.Account;
import businessLogicLayer.Flight;
import graphicUserInterface.AlertBox;
import businessLogicLayer.Booking;

@SuppressWarnings("unused")
public class InsertDBO {
	// location of database //set verify certificate to false to not use SSL to get
	// rid of the verification error
	static final String databaseURL = "jdbc:mysql://localhost:3306/JavaProject";
	static final String databaseUsername = "root";
	static final String databasePassword = "NBAlover33/";
	
	public static Boolean success;
	public ArrayList<Object> returnList;

	public static void main(String[] args) {
	}

	public void insertAccount(Account acct) {
		// TODO Auto-generated method stub
		
	}

	public static void insertBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	public static void insertFlight(Flight flight) {
		// TODO Auto-generated method stub
		
	}
}


