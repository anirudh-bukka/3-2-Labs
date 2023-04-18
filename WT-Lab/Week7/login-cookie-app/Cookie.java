import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Cookie extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("uname");
		String pswd = req.getParameter("pwd");

		Cookie c1 = new Cookie("user1", "u1");
		Cookie c2 = new Cookie("pswd1", "p1");
		Cookie c3 = new Cookie("user2", "u2");
		Cookie c4 = new Cookie("pswd2", "p2");
		Cookie c5 = new Cookie("user3", "u3");
		Cookie c6 = new Cookie("pswd3", "p3");
		Cookie c7 = new Cookie("user4", "u4");
		Cookie c8 = new Cookie("pswd4", "p4");

		if((name.equals(c1.getValue())&&pswd.equals(c2.getValue())) || (name.equals(c3.getValue())&&pswd.equals(c4.getValue())) || (name.equals(c5.getValue())&&pswd.equals(c6.getValue())) || (name.equals(c7.getValue())&&pswd.equals(c8.getValue()))) {
   			out.println("You are a valid user\n");
   		} else {
			out.println("Invalid user");
		}
	}
}