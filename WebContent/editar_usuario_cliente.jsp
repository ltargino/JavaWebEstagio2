 <%@ page import="br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario,
 				  br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Home</title>

		<!--Import Google Icon Font-->
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<!--Import materialize.css-->
		<link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css" media="screen,projection"/>
		<!--Let browser know website is optimized for mobile-->
		<meta name="viewport" content="width=device-width, initial-scale=1.0"/>

	</head>

	<body>

		<% 
			Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
			UsuarioCliente usuario_edit = (UsuarioCliente)request.getSession().getAttribute("usuario_edit");
		%>

		<nav class="nav-extended teal darken-1">
		  <div class="nav-wrapper">
		    <a href="#" class="brand-logo">HelpDesk</a>
		    <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
		    <ul id="nav-mobile" class="right hide-on-med-and-down">
		      <li><a><%= usuario.getNome() %></a></li>
		      <li><a href="logout">Logout</a></li>
		    </ul>
		    <ul class="side-nav" id="mobile-demo">
		      <li><a><%= usuario.getNome() %></a></li>
		      <li><a href="logout">Logout</a></li>
		    </ul>
		  </div>
		</nav>

		<form action="update_usuario_cliente" method="post">
			
			<input type="hidden" id="id" name="id" value='<%= usuario_edit.getId() %>'/>
			
			<div class="row">
				<div class="input-field cal s12">
					<input type="text" id="nome" name="nome" value='<%= usuario_edit.getNome() %>'/>
					<label for="nome">Nome</label>
				</div>
			</div>
			
			<div class="row">
				<div class="input-field cal s12">
					<input type="text" id="email" name="email" value='<%= usuario_edit.getEmail() %>'/>
					<label for="email">E-mail</label>
				</div>
			</div>
			
			<div class="row">
				<div class="input-field cal s12">
					<input type="password" id="senha" name="senha" value='<%= usuario_edit.getSenha() %>'/>
					<label for="senha">Senha</label>
				</div>
			</div>
			
			<div class="row">
				<button type="submit" class="waves-effect waves-light btn col s12">Salvar</button>
			</div>
			
		</form>
		
		<!--Import jQuery before materialize.js-->
		<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="materialize/js/materialize.min.js"></script>
		<script type="text/javascript">
			$(".button-collapse").sideNav();
		</script>

	</body>

</html>