<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="Entidades.Usuario" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usuario</title>
</head>
<body>

	<%Usuario usuario = (Usuario)request.getAttribute("usuario"); %>
	<h1>Usuario: <%=usuario.getNome() %> cadastrado com sucesso</h1>
	Nome: <%=usuario.getNome() %><br>
	Rg: <%=usuario.getRg()%><br>
	Cpf: <%=usuario.getCpf() %><br>
	Sexo: <%=usuario.getSexo() %><br>
	Conta: <%=usuario.getConta() %><br>
	Senha: <%=usuario.getSenha() %><br>
	HorarioEntrada: <%=usuario.getHorarioEntrada() %><br>
	HorarioSaida: <%=usuario.getHorarioSaida() %><br>
	
	
	 <div id="actions" class="row">
                <div class="col-md-12">
                    <a href="index.html" class="btn btn-default">Voltar</a>
                </div>
	
	
	
	
</body>
</html>