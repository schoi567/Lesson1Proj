import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//destory cookie
		String MainPage =request.getParameter("MainPage");
		Cookie ck=new Cookie("mainpage",MainPage);
	
	
		response.addCookie(ck);
		
		
		PrintWriter out=response.getWriter();
		out.println("Thank you for using website. <br> "
				+ "To go back to the main please press the button below.");
	
		
		out.println("<form action='/CookiesExmaple' method='post'>"); 
		out.println("<button name ='submit' type = 'submit'  value='MainPage'>Main Page</button> </form>");
		

		
	}

}