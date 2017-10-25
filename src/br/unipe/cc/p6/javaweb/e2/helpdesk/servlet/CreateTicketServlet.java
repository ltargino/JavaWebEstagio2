package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Prioridade;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Status;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Ticket;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.TicketService;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioClienteService;

@SuppressWarnings("serial")
public class CreateTicketServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Ticket ticket = new Ticket();
		TicketService service = new TicketService();
		UsuarioClienteService service_usuario_cliente = new UsuarioClienteService();
		
		String titulo = req.getParameter("titulo");
		String descricao = req.getParameter("descricao");
		Status status = Status.values()[Integer.parseInt(req.getParameter("status"))];
		Prioridade prioridade = Prioridade.values()[Integer.parseInt(req.getParameter("prioridade"))];
		
		UsuarioCliente usuario_cliente = service_usuario_cliente.buscar(new Long(Integer.parseInt(req.getParameter("usuario_id"))));
		
		ticket.setTitulo(titulo);
		ticket.setDescricao(descricao);
		ticket.setStatus(status);
		ticket.setPrioridade(prioridade);
		
		ticket.setUsuario(usuario_cliente);
		
		service.inserir(ticket);
		
		resp.sendRedirect("home");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UsuarioClienteService service_clientes = new UsuarioClienteService();
		List<UsuarioCliente> usuarios_clientes = service_clientes.listar();
		
		req.setAttribute("usuarios_clientes", usuarios_clientes);
		
		RequestDispatcher rd = req.getRequestDispatcher("adicionar_ticket.jsp");
		
		rd.forward(req, resp);

	}
	
}
