

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addCoisas")
public class addCoisas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // pegando os parâmetros do request
		PrintWriter out = response.getWriter();
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String cidade = request.getParameter("cidade");
        String fone = request.getParameter("fone");
        
        System.out.println("Nome: "+nome+" endereco: "+endereco+" city: "+cidade+" fone: "+fone);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		//doGet(request, response);
		String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String cidade = request.getParameter("cidade");
        String fone = request.getParameter("fone");
        
        System.out.println("Name: "+nome+" address: "+endereco+" city: "+cidade+" fone: "+fone);
	}

}
