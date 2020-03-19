import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Data.DataCollection;

@WebServlet("/RegistrationInfo")
public class RegistrationInfo extends HttpServlet {

	private String docType;
	private String title;
	private String format;

	public void init() throws ServletException {
		docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
		title = "Wrong Input";
		format = "%s <html>\n<head><title>%s</title></head>\n<body bgcolor=\"#ccc\">\n<h1 align=\"center\">%s</h1>\n<ul>\n<li><b>Error</b>:%s\n</ul>\n</body></html>";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		DataCollection data = new DataCollection();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String check_pass = request.getParameter("check_pass");

		
		if (pass.equals(check_pass) && !pass.isEmpty()) {
			data.AddData(email, pass, name);
			response.setContentType("text/html;charset=UTF-8");
			request.getRequestDispatcher("/LogIn.jsp").include(request, response);
		}else {
			String error="Passwords dont match";
			PrintWriter out = response.getWriter();
			out.println(String.format(format, docType, title, title,error));
		}

	}
}
