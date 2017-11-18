<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Alterar Usuario</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="indexAlterar.jsp">Alterar Usuario</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="index.html"></a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div id="main" class="container">
		<h3 class="page-header">Dados do usuario</h3>



		<form action="AlterarUsuario.jsp" method="post">






			<div class="form-group col-md-0">
				<label for="nome">Nome:</label> <input type="text"
					class="form-control" name="nome" id="nome"
					placeholder="Digite seu nome">
			</div>



			<div class="form-group col-md-0">
				<label for="fone">Rg:</label> <input type="text"
					class="form-control" name="rg" id="rg" placeholder="Digite seu RG">
			</div>


			<div class="form-group col-md-0">
				<label for="email">Sexo:</label> <input type="text"
					class="form-control" name="sexo" id="sexo"
					placeholder="Digite o seu E-Mail">
			</div>


			<div class="form-group col-md-0">
				<label for="fone">Conta:</label> <input type="text"
					class="form-control" name="conta" id="conta"
					placeholder="Digite sua Conta">
			</div>


			<div class="form-group col-md-0">
				<label for="fone">Senha:</label> <input type="text"
					class="form-control" name="senha" id="senha"
					placeholder="Digite seu Password">
			</div>


			<div class="form-group col-md-0">
				<label for="fone">Horario Entrada:</label> <input type="text"
					class="form-control" name="horarioEntrada" id="horarioEntrada"
					placeholder="Digite o seu horario de entrada">
			</div>


			<div class="form-group col-md-0">
				<label for="fone">Horario Saida:</label> <input type="text"
					class="form-control" name="horarioSaida" id="horarioSaida"
					placeholder="Digite seu horario de saida">
			</div>







			<hr />
			<div id="actions" class="row">
				<div class="col-md-0">
					<button type="submit" class="btn btn-primary" name="acao"
						value="Criar">Alterar</button>
					<a href="index.jsp" class="btn btn-default">Cancelar</a>
		</form>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>