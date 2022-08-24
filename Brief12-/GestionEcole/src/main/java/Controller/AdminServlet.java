package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.AdminImpl;
import Model.Admin;


/**
 * Servlet implementation class EtudiantServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   Admin admin=new Admin();
 AdminImpl adminImpl=new AdminImpl();
   
   
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("admin.htlm").forward(request, response);
		
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		login(request, response);
	}
		protected void login(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
			String nom=request.getParameter("nom");
			String mail=request.getParameter("mail");
			String password=request.getParameter("password");
		
			
		
			
			
}
}


//
//
//String nom = request.getParameter("nom");
//String mail=request.getParameter("mail");
//   String password = request.getParameter("password");
//  List result = AdminImpl.find_ALL();
//   PrintWriter out = response.getWriter();
//   try {
//   	   if(result != null ) {
//              
//              RequestDispatcher rd = request.getRequestDispatcher("connection.jsp");
//              rd.forward(request,response);
//          }
//   	   else {
//   		   out.print("erreur verifier votre nom utilisateur ou motpass");
//               RequestDispatcher rd=request.getRequestDispatcher("registe.jsp");
//               rd.include(request,response);
//		}
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
//
//
//
//	
//}
