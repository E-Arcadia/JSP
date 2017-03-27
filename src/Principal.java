

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
		String Nome = request.getParameter("nome");
		String Idade = request.getParameter("idade");
		
		request.setAttribute("Nome", Nome);
		request.setAttribute("Idade", Idade);
		RequestDispatcher rd= request.getRequestDispatcher("resposta.jsp");
		rd.forward(request, response);
		


//		response.sendRedirect("index.jsp?msg=Martin Morães");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
