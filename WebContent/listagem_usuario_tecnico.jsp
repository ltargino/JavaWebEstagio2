 <%@ page import="
 			br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioTecnico,
 			br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioTecnicoService,
 			java.util.List" %>
 
 <a href="adicionar_usuario_tecnico.jsp" class="waves-effect waves-light btn"><i class="material-icons left">add</i>Novo</a>
 
 <table style="padding-top: 10px">
 
   <thead>
 
     <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>E-mail</th>
     	<th>Ações</th>
     </tr>
 
   </thead>

   <tbody>

	<% 
		for(UsuarioTecnico usuario : (List<UsuarioTecnico>)request.getAttribute("usuarios_tecnicos")) {
	%>

     <tr>
       	<td><%= usuario.getId() %></td>
       	<td><%= usuario.getNome() %></td>
       	<td><%= usuario.getEmail() %></td>
     	<td>
     		<a href="#"><i class="material-icons">edit</i></a>
     		<a href='delete_usuario_tecnico?id=<%=usuario.getId()%>' onclick="return confirm('Deseja realmente excluir?');"><i class="material-icons" style="color: #e53935">delete</i></a>
     	</td>
     </tr>

	<%
		}
	%>	

   </tbody>
   
</table>