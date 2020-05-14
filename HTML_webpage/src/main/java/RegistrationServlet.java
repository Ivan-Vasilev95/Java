import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Data.Repository;
import Entity.Address;
import Entity.Skills;
import Entity.User;

@WebServlet(name = "RegistrationServletName", urlPatterns = { "/RegistrationServlet" })
public class RegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	Repository users;

	public void init() throws ServletException {
		users = Repository.getInstance();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Registration.jsp");
		rd.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		final String name = request.getParameter("name");
		final String email = request.getParameter("email");
		final String info = request.getParameter("info");
		final String job = request.getParameter("job");
		final String phone = request.getParameter("phone");

		final String cityAddress = request.getParameter("cityaddress");
		final String streatAddress = request.getParameter("streataddress");

		final String Jskill1 = request.getParameter("Jskill1");
		final int Jvalue1 = Integer.parseInt(request.getParameter("Jvalue1"));
		final String Jskill2 = request.getParameter("Jskill2");
		final int Jvalue2 = Integer.parseInt(request.getParameter("Jvalue2"));
		final String Jskill3 = request.getParameter("Jskill3");
		final int Jvalue3 = Integer.parseInt(request.getParameter("Jvalue3"));
		final String Jskill4 = request.getParameter("Jskill4");
		final int Jvalue4 = Integer.parseInt(request.getParameter("Jvalue4"));

		final String Pskill1 = request.getParameter("Pskill1");
		final int Pvalue1 = Integer.parseInt(request.getParameter("Pvalue1"));
		final String Pskill2 = request.getParameter("Pskill2");
		final int Pvalue2 = Integer.parseInt(request.getParameter("Pvalue2"));
		final String Pskill3 = request.getParameter("Pskill3");
		final int Pvalue3 = Integer.parseInt(request.getParameter("Pvalue3"));

		final String pass = request.getParameter("pass");
		final String check_pass = request.getParameter("check_pass");

		if (users.checkUserByEmail(email)) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/");
			PrintWriter out = response.getWriter();
			out.println("<font color=red>Въведеният имейл е зает.</font>");
			rd.include(request, response);

		} else if (!pass.equals(check_pass)) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/");
			PrintWriter out = response.getWriter();
			out.println("<font color=red>Въведените пароли не съвпадата.</font>");
			rd.include(request, response);
		} else {
			users.addUser(new User(email, pass) {
				{
					setName(name);
					setJob(job);
					setInfo(info);
					addJobSkills(new Skills(Jskill1, Jvalue1));
					addJobSkills(new Skills(Jskill2, Jvalue2));
					addJobSkills(new Skills(Jskill3, Jvalue3));
					addJobSkills(new Skills(Jskill4, Jvalue4));
					addPersonalSkills(new Skills(Pskill1, Pvalue1));
					addPersonalSkills(new Skills(Pskill2, Pvalue2));
					addPersonalSkills(new Skills(Pskill3, Pvalue3));
					setPhone(phone);
					setAddress(new Address(cityAddress, streatAddress));
				}
			});
			
			response.sendRedirect(request.getContextPath());
		}
	}
}
