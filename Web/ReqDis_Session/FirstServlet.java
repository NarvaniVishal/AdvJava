package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h3>hi from first servlet</h3>");
		HttpSession session = request.getSession();
		session.setAttribute("username", request.getParameter("unm"));
		session.invalidate();
		session.removeAttribute("username");
		out.print("<a href='SecondServlet'>SecondServlet</a>");
		
//
//		PrintWriter out = response.getWriter();
//		String strUnm = request.getParameter("unm");
//		String strPwd = request.getParameter("pwd");
////		out.print("<h1>"+strUnm + " : " + strPwd+ " </h1>");
//		out.print("<h3>hi from first servlet</h3>");
//		
//		RequestDispatcher rd = request.getRequestDispatcher("index.html");
//		request.setAttribute("ExtraParam", "narvani");
//		rd.include(request, response);
//		response.sendRedirect("SecondServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
