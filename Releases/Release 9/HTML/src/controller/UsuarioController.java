package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ConexaoBanco.Service;
import Entidades.Usuario;



@WebServlet("/ManterCliente.do")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pNome = request.getParameter("nome");
		String pRg = request.getParameter("rg");
		String pCpf = request.getParameter("cpf");
		String pSexo = request.getParameter("sexo");
		String pConta = request.getParameter("conta");
		String pSenha = request.getParameter("senha");
		String pHorarioEntrada = request.getParameter("horarioEntrada");
		String pHorarioSaida = request.getParameter("horarioSaida");
		String pTipo = request.getParameter("tipo");

		
		//instanciar o javabean
		Usuario usuario = new Usuario();
		usuario.setNome(pNome);
		usuario.setRg(pRg);
		usuario.setCpf(pCpf);
		usuario.setSexo(pSexo);
		usuario.setConta(pConta);
		usuario.setSenha(pSenha);
		usuario.setHorarioEntrada(pHorarioEntrada);
		usuario.setHorarioSaida(pHorarioSaida);
		usuario.setHorarioSaida(pTipo);
		
		//instanciar o service
		Service cs = new Service();
		cs.criar(usuario);
		usuario = cs.carregar(usuario.getNome(),usuario.getRg(),usuario.getSexo(),usuario.getCpf(),usuario.getConta(),usuario.getSenha(),usuario.getHorarioEntrada(),usuario.getHorarioSaida() , usuario.getTipo());
		
		request.setAttribute("usuario", usuario);
		
		RequestDispatcher view =
				request.getRequestDispatcher("usuario.jsp");
				view.forward(request, response);
		
		
	}

}
