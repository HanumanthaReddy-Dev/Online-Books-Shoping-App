package com.jlcindia.bookstore.controllers;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*; 

public class LogoutController  extends JLCBaseController  { 
public String process (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException { 
System.out.println("LogoutServlet-service()"); 
String page = "login.jsp"; 
HttpSession session = req.getSession(false); 
if (session != null) 
session.invalidate(); 
String logoutMsg = "You have logged out Successfully"; 
req.setAttribute("LogoutMsg", logoutMsg); 
return page;
} 
}
 
 
 
 
 


