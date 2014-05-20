package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTracking
 */
@WebServlet("/session-tracking")
public class SessionTracking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*/private String getValue(String param, HttpServletRequest req, HttpSession ses){
		String result = req.getParameter(param);
		if(result==null){
			result= (String) ses.getAttribute(param);
			if(result==null){
				result="unknown";
			}
		}
		ses.setAttribute(param , result);
		return(result);
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String result= request.getHeader("referer");
		List<String> indirizzi = new ArrayList<String>() ; 
		indirizzi.add(result);
		PrintWriter out = response.getWriter();
		out.print(indirizzi);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
