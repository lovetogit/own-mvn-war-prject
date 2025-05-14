package com.suchi;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		            res.setContentType("text/html");
			            PrintWriter out = res.getWriter();
				            out.println("<h1>Hello from sachin's WAR! this works! awmazing</h1>");
					        }
}
