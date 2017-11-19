package ConexaoBanco;

import java.io.IOException;
import java.util.ArrayList;
 
import Entidades.Usuario;


public class VendedorService {
	UsuarioDAO dao; 
	
	public VendedorService(){
		dao = new UsuarioDAO();
	}
	public ArrayList<Usuario> listarUsuarios() throws IOException {
		return dao.listarUsuario();
	}
	public ArrayList<Usuario> listarUsuario(String chave) throws IOException {
		return dao.listarUsuario(chave);
	}

}
