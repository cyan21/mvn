package org.ych.app;

import org.ych.Human;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(value="/hello")
public class MyApp extends HttpServlet {

	@Override
	public void service(ServletRequest reqest, ServletResponse response) throws ServletException, IOException {
		response.getWriter().println("Human says : Friday is good, monday is bad");
	}
}
