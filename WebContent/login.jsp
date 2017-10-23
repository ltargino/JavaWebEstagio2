<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
		
		<!--Import Google Icon Font-->
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<!--Import materialize.css-->
		<link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css" media="screen,projection"/>
		<!--Let browser know website is optimized for mobile-->
		<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
		
	</head>
	
	<body style="background-color:rgba(1, 14, 14, 0.1);">
	
		<div class="row" style="position:absolute; top: 20%; left: 29%;">
		  <h2>Autenticação Necessária</h2>
		  <form method="post" id="login-form" action="logar" class="col s12">
		    <div class="row">
		      <div class="input-field col s12">
		        <input id="id" name="id" type="text">
		        <label for="id">ID</label>
		      </div>
		    </div>
			<div class="row">
			  <div class="input-field col s12">
			    <input id="password" name="senha" type="password">
			    <label for="password">Senha</label>
			  </div>
			</div>	    
			<div class="row">
				<a onclick='document.forms["login-form"].submit(); return false;' class="waves-effect waves-light btn col s12">
					<i class="material-icons left">near_me</i>
					Iniciar Sessão
				</a>
	      	</div>
	      </form>
    	</div>
	
		<!--Import jQuery before materialize.js-->
		<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="materialize/js/materialize.min.js"></script>
	
	</body>
	
</html>