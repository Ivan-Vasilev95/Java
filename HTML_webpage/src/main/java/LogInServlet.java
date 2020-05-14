import java.io.IOException;
import java.io.PrintWriter;

import Data.Repository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.User;

@WebServlet(name = "LogInServletName", urlPatterns = { "/index.html", "/LogInServlet" })
public class LogInServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	Repository users;

	public void init() throws ServletException {
		users = Repository.getInstance();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * HttpSession oldSession = request.getSession(false); User sessionUser =
		 * (oldSession != null) ? (User) oldSession.getAttribute("user") : null;
		 */

		/*
		 * if ((sessionUser != null)) { response.sendRedirect("user?id=" +
		 * sessionUser.getId()); } else {
		 */
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/LogIn.jsp");
		rd.forward(request, response);
		// }

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User userBean = new User(request.getParameter("email"), request.getParameter("pass"));

		if (users.hasExist(userBean)) {
			User user = users.getUserByEmail(userBean.getEmail());

	
		HttpSession oldSession = request.getSession(false);
			if (oldSession != null) {
				oldSession.invalidate();
			}
			HttpSession newSession = request.getSession(true);
			newSession.setAttribute("user", user);

			response.sendRedirect("user?id=" + user.getId()+"&action=edit");

		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/");
			PrintWriter out = response.getWriter();
			out.println("<font color=red>Wrong credention.</font>");
			rd.include(request, response);
		}

	}
}
