 <%@ page import="
 			br.unipe.cc.p6.javaweb.e2.helpdesk.model.Ticket,
 			br.unipe.cc.p6.javaweb.e2.helpdesk.service.TicketService,
 			java.util.List" %>
 
 <a href='create_ticket' class="waves-effect waves-light btn"><i class="material-icons left">add</i>Abrir Ticket</a>
 
 <table style="padding-top: 10px">
 
   <thead>
 
     <tr>
        <th>ID</th>
        <th>Titulo</th>
        <th>Descrição</th>
     	<th>Prioridade</th>
     	<th>Status</th>
     	<th>Usuario</th>
     	<th>Ações</th>
     </tr>
 
   </thead>

   <tbody>

	<% 
		for(Ticket ticket : (List<Ticket>)request.getAttribute("tickets")) {
	%>

     <tr>
       	<td><%= ticket.getId() %></td>
       	<td><%= ticket.getTitulo() %></td>
       	<td><%= ticket.getDescricao() %></td>
       	<td><%= ticket.getPrioridade().toString() %></td>
       	<td><%= ticket.getStatus() %></td>
       	<td><%= ticket.getUsuario().getNome() %></td>
     	<td>
     		<a href='update_ticket?id=<%=ticket.getId()%>'><i class="material-icons">edit</i></a>
     		<a href='delete_ticket?id=<%=ticket.getId()%>' onclick="return confirm('Deseja realmente excluir?');"><i class="material-icons" style="color: #e53935">delete</i></a>
     	</td>
     </tr>

	<%
		}
	%>	

   </tbody>
   
</table>