

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/principal")
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Principal() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("msg", "ESTOU AQUI!!");
		RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		


//		response.sendRedirect("index.jsp?msg=Martin Mor�es");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
