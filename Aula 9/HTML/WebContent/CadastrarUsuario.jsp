<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link href="css/bootstrap.min.css" rel="stylesheet">
<title>Usuario</title>
</head>
<body>

        <!-- Barra superior com os menus de navegação -->

        <!-- Container Principal -->
        <div id="main" class="container">
        
            <h3 class="page-header">Usuario cadastrado: ${usuario.nome} </h3>
            <div class="row">
       
            
            
            
                <div class="col-md-0">
                    <p><strong>Nome</strong>
                    </p>
                    <p>
                        ${usuario.nome}
                    </p>
                </div>
            </div>
            
            
                <div class="col-md-0">
                    <p><strong>Rg</strong>
                    </p>
                    <p>
                        ${usuario.rg}
                    </p>
                </div>
                
                <div class="col-md-0">
                    <p><strong>Cpf</strong>
                    </p>
                    <p>
                        ${usuario.cpf}
                    </p>
                </div>
                
                
                <div class="col-md-0">
                   <p><strong>Sexo</strong>
                    </p>
                    <p>
                        ${usuario.sexo}
                    </p>
                </div>
                
                <div class="col-md-0">
                   <p><strong>Conta</strong>
                    </p>
                    <p>
                        ${usuario.conta}
                    </p>
                </div>
                
                <div class="col-md-0">
                   <p><strong>Senha</strong>
                    </p>
                    <p>
                        ${usuario.senha}
                    </p>
                </div>
                
                <div class="col-md-0">
                   <p><strong>Horario Entrada</strong>
                    </p>
                    <p>
                       ${usuario.horarioEntrada}
                    </p>
                </div>
                
                <div class="col-md-0">
                   <p><strong>Horario Saida</strong>
                    </p>
                    <p>
                        ${usuario.horarioSaida}
                    </p>
                </div>
                
                <div class="col-md-0">
                   <p><strong>Tipo</strong>
                    </p>
                    <p>
                        ${usuario.tipo}
                    </p>
                </div>
                

                
            <hr />
            <div id="actions" class="row">
                <div class="col-md-12">
                    <a href="index.jsp" class="btn btn-default">Voltar</a>
                </div>

        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>




	
	
	
</body>
</html>