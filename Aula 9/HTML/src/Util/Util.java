package Util;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Entidades.Usuario;

public class Util {

	public static String clientes2json(ArrayList<Usuario> usuarios) throws JSONException {
		JSONArray vetor = new JSONArray();
		for(Usuario usuario:usuarios)
		{
			JSONObject objeto = new JSONObject();
			objeto.put("nome", usuario.getNome());
			objeto.put("rg" , usuario.getRg());
			objeto.put("cpf", usuario.getCpf());
			objeto.put("sexo", usuario.getSexo());
         objeto.put("conta", usuario.getConta());
         objeto.put("senha", usuario.getSenha());
         objeto.put("horarioEntrada", usuario.getHorarioEntrada());
         objeto.put("horarioSaida", usuario.getHorarioSaida());
         objeto.put("tipo", usuario.getTipo());
			vetor.put(objeto);
		}
		return vetor.toString();
	}

	public static Usuario json2Cliente(String usuarioJSon) throws JSONException {
		
		//String para JSON
		Usuario usuario = new Usuario();
		JSONObject objeto = new JSONObject(usuarioJSon);
		usuario.setNome(objeto.getString("nome"));
		usuario.setRg(objeto.getString("rg"));
		usuario.setCpf(objeto.getString("cpf"));
		usuario.setSexo(objeto.getString("sexo"));
		usuario.setConta(objeto.getString("conta"));
		usuario.setSenha(objeto.getString("senha"));
		usuario.setHorarioEntrada(objeto.getString("horarioEntrada"));
		usuario.setHorarioSaida(objeto.getString("horarioSaida"));
		usuario.setTipo(objeto.getString("tipo"));
		
		
		
		return usuario;
		
	}

}
