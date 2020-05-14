
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloForm")
public class HelloForm extends HttpServlet {

	private String docType;
    private String title;
    private String format;

    public void init() throws ServletException{
        docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
        title = "Using GET Method to Read Form Data";
        format = "%s <html>\n<head><title>%s</title></head>\n<body bgcolor=\"#ccc\">\n<h1 align=\"center\">%s</h1>\n<ul>\n<li><b>First Name</b>:%s\n<li><b>Last Name</b>:%s\n</ul>\n</body></html>";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        response.setContentType("text/html");

        String fName = request.getParameter("first_name");
        String lName = request.getParameter("last_name");

        PrintWriter out = response.getWriter();
        
        out.println(String.format(format, docType, title, title, fName, lName));
    }
	
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html");

        String fName = request.getParameter("first_name");
        String lName = request.getParameter("last_name");

        PrintWriter out = response.getWriter();
        
        out.println(String.format(format, docType, title, title, fName, lName));
    }
}
