
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import Data.Repository;
import Entity.User;
import Entity.Address;
import Entity.JsonResult;
import Entity.Skills;

@WebServlet(name = "UserServletName", urlPatterns = "/user")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private Gson gson;
	private Repository repository;

	public void init() throws ServletException {
		repository = Repository.getInstance();
		gson = new Gson();
	}

	private void setAccessControlHeader(HttpServletResponse resp) {
		resp.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		resp.setHeader("Access-Control-Allow-Methods", "GET , POST");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// User user = (User) request.getAttribute("users");

		int id = Integer.parseInt(request.getParameter("id"));
		String action = request.getParameter("action");

		// user = repository.getById(id);

		// request.setAttribute("user", user);

		String page = (action != null && !action.isEmpty() && action.equals("edit")) ? "EditProfilePage.jsp"
				: "ProfilePage.jsp";

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		Cookie cookies[] = request.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("message1")) {
				request.setAttribute("message", cookie.getName());
				break;
			}
		}

		HttpSession oldSession = request.getSession(false);
		User sessionUser = (oldSession != null) ? (User) oldSession.getAttribute("user") : null;

		if (sessionUser == null || sessionUser.getId() != id) {
			sessionUser = repository.getById(id);
		}

		request.setAttribute("user", sessionUser);

		RequestDispatcher requestDispacher = request.getRequestDispatcher(page);
		requestDispacher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// setAccessControlHeader(response);
		request.setCharacterEncoding("UTF-8");

		StringBuilder sb = new StringBuilder();
		String s;
		while ((s = request.getReader().readLine()) != null) {
			sb.append(s);
		}

		User newUser = (User) gson.fromJson(sb.toString(), User.class);

		JsonResult result = new JsonResult();

		User user = repository.getById(newUser.getId()).updateUserInfo(newUser);

		repository.update();

		if (user != null) {
			result.setMessage("Записа се ");
		} else {
			result.setMessage("Не се записа");
			HttpSession oldSession = request.getSession(false);
			User sessionUser = (oldSession != null) ? (User) oldSession.getAttribute("user") : null;
			result.setUser(repository.getById(sessionUser.getId()));

		}

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(gson.toJson(result));
		out.flush();

		/*
		 * int id = Integer.parseInt(request.getParameter("id")); final String name =
		 * request.getParameter("name"); final String job = request.getParameter("job");
		 * final String info = request.getParameter("info"); final String phone =
		 * request.getParameter("phone"); final String email =
		 * request.getParameter("email"); final String addressName =
		 * request.getParameter("addressName"); final String addressStreet =
		 * request.getParameter("addressStreet");
		 * 
		 * final String Jskillname1 = request.getParameter("Jskillname1"); final int
		 * Jskillvalue1 = Integer.parseInt(request.getParameter("Jskillvalue1")); final
		 * String Jskillname2 = request.getParameter("Jskillname2"); final int
		 * Jskillvalue2 = Integer.parseInt(request.getParameter("Jskillvalue2")); final
		 * String Jskillname3 = request.getParameter("Jskillname3"); final int
		 * Jskillvalue3 = Integer.parseInt(request.getParameter("Jskillvalue3")); final
		 * String Jskillname4 = request.getParameter("Jskillname4"); final int
		 * Jskillvalue4 = Integer.parseInt(request.getParameter("Jskillvalue4"));
		 * 
		 * final String Pskillname1 = request.getParameter("Pskillname1"); final int
		 * Pskillvalue1 = Integer.parseInt(request.getParameter("Pskillvalue1")); final
		 * String Pskillname2 = request.getParameter("Pskillname2"); final int
		 * Pskillvalue2 = Integer.parseInt(request.getParameter("Pskillvalue2")); final
		 * String Pskillname3 = request.getParameter("Pskillname3"); final int
		 * Pskillvalue3 = Integer.parseInt(request.getParameter("Pskillvalue3"));
		 * 
		 * final ArrayList<Skills> jobSkills = new ArrayList<Skills>();
		 * jobSkills.add(new Skills(Jskillname1, Jskillvalue1)); jobSkills.add(new
		 * Skills(Jskillname2, Jskillvalue2)); jobSkills.add(new Skills(Jskillname3,
		 * Jskillvalue3)); jobSkills.add(new Skills(Jskillname4, Jskillvalue4));
		 * 
		 * final ArrayList<Skills> personalSkills = new ArrayList<Skills>();
		 * personalSkills.add(new Skills(Pskillname1, Pskillvalue1));
		 * personalSkills.add(new Skills(Pskillname2, Pskillvalue2));
		 * personalSkills.add(new Skills(Pskillname3, Pskillvalue3));
		 * 
		 * String action = request.getParameter("action");
		 * 
		 * User newUser = new User() { { setName(name); setJob(job); setInfo(info);
		 * setPhone(phone); setEmail(email); setAddress(new Address(addressName,
		 * addressStreet)); setJobSkills(jobSkills); setPersonalSkills(personalSkills);
		 * 
		 * } };
		 */

		// User user = repository.getById(id).update(newUser);

		/*
		 * request.setAttribute("user", user);
		 * 
		 * String page = (action != null && !action.isEmpty() && action.equals("edit"))
		 * ? "/EditProfilePage.jsp" : "/ProfilePage.jsp";
		 * 
		 * RequestDispatcher requestDispacher = request.getRequestDispatcher(page);
		 * requestDispacher.forward(request, response);
		 */
	}

}
