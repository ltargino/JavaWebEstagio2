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

		<nav class="nav-extended teal darken-1">
		  <div class="nav-wrapper">
		    <a href="#" class="brand-logo">HelpDesk</a>
		    <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
		    <ul id="nav-mobile" class="right hide-on-med-and-down">
		      <li><a>Usuario</a></li>
		      <li><a>Logout</a></li>
		      <li><a>Ajuda</a></li>
		    </ul>
		    <ul class="side-nav" id="mobile-demo">
		      <li><a>Usuario</a></li>
		      <li><a>Logout</a></li>
		      <li><a>Ajuda</a></li>
		    </ul>
		  </div>
		  <div class="nav-content">
		    <ul class="tabs tabs-transparent">
		      <li class="tab"><a href="#ocorrencias">Ocorrências</a></li>
		      <li class="tab"><a href="#usuario">Usuário</a></li>
		    </ul>
		  </div>
		</nav>
		<div id="ocorrencias" class="col s12">Ocorrências</div>
		<div id="usuario" class="col s12">Usuário</div>

		<!--Import jQuery before materialize.js-->
		<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="materialize/js/materialize.min.js"></script>
		<script type="text/javascript">
			$(".button-collapse").sideNav();
		</script>
		
	</body>

</html>