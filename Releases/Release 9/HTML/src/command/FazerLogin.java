package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entidades.Usuario;
import ConexaoBanco.Service;

public class FazerLogin implements Command 
{

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("username");
		String senha = request.getParameter("passwd");
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setSenha(senha);
		
		Service service = new Service();
		
		if(service.validar(usuario))
		{
			HttpSession session = request.getSession();
			session.setAttribute(usuario.LOGADO, usuario);
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("Login.jsp");
			
		}
		
		
	}

	
	
	
}
