package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;

import ConexaoBanco.Service;
import ConexaoBanco.VendedorService;
import Entidades.Usuario;
import Util.Util;



@WebServlet("/clientes")
public class ManterClientesRest extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Trazer os clientes
		VendedorService service = new VendedorService();
		//Criar a lista
		ArrayList<Usuario> usuarios = service.listarUsuarios();
		//Imprimir a lista
		PrintWriter out = response.getWriter();
		//
		response.setContentType("application/json");
		//
		try {
			out.println(Util.clientes2json(usuarios));
		} catch (JSONException e) {

			e.printStackTrace();
			throw new IOException(e);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Leitor de arquivos textos que ira ler o arquivo de linha a linha
		BufferedReader reader = request.getReader();
		String linha;
		StringBuilder sb = new StringBuilder();
		//Entregar o arquivo que trouxe da requisição
		while((linha = reader.readLine()) != null)
		{
			//
			sb.append(linha + "\n");
		}
		Service service = new Service();
		try {
			service.criar(Util.json2Cliente(sb.toString()));
		} catch (JSONException e) {
			
			e.printStackTrace();
			throw new IOException(e);
		}
		
		
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}


	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
