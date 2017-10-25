 <%@ page import="br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario,
                  br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente,
 				  br.unipe.cc.p6.javaweb.e2.helpdesk.model.Ticket,
 				  java.util.List" %>

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
			Ticket ticket = (Ticket)request.getSession().getAttribute("ticket");
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

		<form action="create_ticket" method="post">
			
			<div class="row">
				<div class="input-field cal s12">
					<input type="text" id="titulo" name="titulo" value='<%= ticket.getTitulo() %>'/>
					<label for="titulo">Titulo</label>
				</div>
			</div>
			
			<div class="row">
				<div class="input-field cal s12">
					<input type="text" id="descricao" name="descricao" value='<%= ticket.getDescricao() %>'/>
					<label for="descricao">Descri��o</label>
				</div>
			</div>
			
			<div class="row">
			  <div class="input-field col s12">
			    <select id="status" name="status">
			      <option value="0" <%= ticket.getStatus() == Status.values()[0] ? "selecetd" : "" %> >Aberto</option>
			      <option value="1" <%= ticket.getStatus() == Status.values()[1] ? "selecetd" : "" %> >Resolvido</option>
			      <option value="2" <%= ticket.getStatus() == Status.values()[2] ? "selecetd" : "" %> >Fechado</option>
			      <option value="3" <%= ticket.getStatus() == Status.values()[3] ? "selecetd" : "" %> >Pendente</option>
			    </select>
			    <label>Status</label>
			  </div>
		    </div>

			<div class="row">
			  <div class="input-field col s12">
			    <select id="prioridade" name="prioridade">
			      <option value="0" <%= ticket.getPrioridade() == Prioridade.values()[0] ? "selecetd" : "" %> >Alta</option>
			      <option value="1" <%= ticket.getPrioridade() == Prioridade.values()[1] ? "selecetd" : "" %> >Media</option>
			      <option value="2" <%= ticket.getPrioridade() == Prioridade.values()[2] ? "selecetd" : "" %> >Baixa</option>
			      <option value="3" <%= ticket.getPrioridade() == Prioridade.values()[3] ? "selecetd" : "" %> >Urgente</option>
			    </select>
			    <label>Prioridade</label>
			  </div>
		    </div>

			<div class="row">
			  <div class="input-field col s12">
			    <select id="usuario_id" name="usuario_id">
			    
			      <% for( UsuarioCliente usuario_cliente : (List<UsuarioCliente>)request.getAttribute("usuarios_clientes") ) { %>
				      <option value='<%= usuario_cliente.getId() %>' <%= usuario_cliente.getId() == ticket.getUsuario().getId() ? "selecetd" : "" %> ><%= usuario_cliente.getNome() %></option>
			      <% } %>
			    
			    </select>
			    <label>Usu�rio</label>
			  </div>			
		    </div>
			
			<div class="row">
				<button type="submit" class="waves-effect waves-light btn col s12">Abrir</button>
			</div>
		</form>
		
		<!--Import jQuery before materialize.js-->
		<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="materialize/js/materialize.min.js"></script>
		<script type="text/javascript">
			$(".button-collapse").sideNav();
		    $(document).ready(function() {
			    $('select').material_select();
			});
		</script>

	</body>

</html>