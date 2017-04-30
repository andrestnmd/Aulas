<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Consultar Usuario</title>
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
				<a class="navbar-brand" href="indexExcluir.jsp">Consultar Usuario</a>
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



		<form action="ExcluirUsuario.do" method="post">






			<div class="form-group col-md-0">
				<label for="nome">Nome:</label> <input type="text"
					class="form-control" name="nome" id="nome"
					placeholder="Digite seu nome">
			</div>



			







			<hr />
			<div id="actions" class="row">
				<div class="col-md-0">
					<button type="submit" class="btn btn-primary" name="acao"
						value="Criar">Excluir</button>
					<a href="Menu.jsp" class="btn btn-default">Cancelar</a>
		</form>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>