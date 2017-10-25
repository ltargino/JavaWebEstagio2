 <%@ page import="
 			br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente,
 			br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioClienteService,
 			java.util.List" %>
 
 <a href="adicionar_usuario_cliente.jsp" class="waves-effect waves-light btn"><i class="material-icons left">add</i>Novo</a>
 
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
		for(UsuarioCliente usuario : (List<UsuarioCliente>)request.getAttribute("usuarios_clientes")) {
	%>

     <tr>
       	<td><%= usuario.getId() %></td>
       	<td><%= usuario.getNome() %></td>
       	<td><%= usuario.getEmail() %></td>
     	<td>
     		<a href='update_usuario_cliente?id=<%=usuario.getId()%>'><i class="material-icons">edit</i></a>
     		<a href='delete_usuario_cliente?id=<%=usuario.getId()%>' onclick="return confirm('Deseja realmente excluir?');"><i class="material-icons" style="color: #e53935">delete</i></a>
     	</td>
     </tr>

	<%
		}
	%>	

   </tbody>
   
</table>