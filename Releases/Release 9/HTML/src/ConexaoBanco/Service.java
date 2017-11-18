package ConexaoBanco;

import java.io.IOException;
import java.sql.SQLException;

import Entidades.Usuario;



public class Service {
	UsuarioDAO dao = new UsuarioDAO();
	
	public int criar(Usuario usuario) {
		return dao.criar(usuario);
	}
	

	public Usuario carregar(String nome ,String rg ,String cpf ,String sexo ,String conta ,String senha ,String horarioEntrada ,String horarioSaida ,String tipo){
		return dao.carregar2(nome, rg , cpf , sexo , conta , senha , horarioEntrada ,horarioSaida , tipo);
	}
	
	public void atualizar(Usuario usuario){
		dao.atualizar2(usuario);
	}
	
	public void excluir(Usuario usuario){
		dao.excluir2(usuario);
	}
	
		
		public boolean validar(Usuario usuario) throws IOException{
			UsuarioDAO dao = new UsuarioDAO();
			return dao.validar(usuario);
		}

}
