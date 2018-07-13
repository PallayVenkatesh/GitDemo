package USA_amaravathi;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumbers extends HttpServlet {

	// Method to handle GET method request.
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		int sum = num1 + num2;

		response.setContentType("text/html");
		// Writing the message on the web page
		PrintWriter out = response.getWriter();
		out.println("<h1>" + sum + "</h1>");
		out.println("<p>" + "Hello Friends!" + "</p>");

	}
}