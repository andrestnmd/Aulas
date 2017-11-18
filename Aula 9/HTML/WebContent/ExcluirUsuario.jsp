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
        
            <h3 class="page-header">Usuario: ${usuario.nome} foi excluido com sucesso !!!! </h3>
            <div class="row">
       
            
            
            
                <div class="col-md-0">
                    <p><strong>Nome</strong>
                    </p>
                    <p>
                        ${usuario.nome}
                    </p>
                </div>
            </div>
            


                

                
            <hr />
            <div id="actions" class="row">
                <div class="col-md-12">
                    <a href="indexExcluir.jsp" class="btn btn-default">Voltar</a>
                </div>

        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>




	
	
	
</body>
</html>