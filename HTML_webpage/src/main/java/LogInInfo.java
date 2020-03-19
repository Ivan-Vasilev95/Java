import java.io.IOException;
import java.io.PrintWriter;

import Data.DataCollection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LogInInfo")
public class LogInInfo extends HttpServlet {

	private String docType;
	private String title;
	private String format;
	private String error;

	public void init() throws ServletException {
		docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
		title = "Accaunt Data";
		error="%s <html>\n<head><title>%s</title></head>\n<body bgcolor=\"#ccc\">\n<h1 align=\"center\">%s</h1>\n<ul>\n<li><b>Error</b>:%s\n</ul>\n</body></html>";
		format = "%s <html>\n<head><title>%s</title></head>\n<body bgcolor=\"#ccc\">\n<h1 align=\"center\">%s</h1>\n<ul>\n<li><b>Name</b>:%s\n<li><b>Email</b>:%s\n</ul>\n</body></html>";
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		String name="";
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");

		DataCollection data = new DataCollection();

		
		name = data.CheckData(email, pass);
		if(name.isEmpty()) {
			String message="Wrong Input";
			PrintWriter out = response.getWriter();
			out.println(String.format(error, docType, title, title,message));
		}else {
		PrintWriter out = response.getWriter();
		out.println(String.format(format, docType, title, title, name, email));}

	}
}
