package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Prioridade;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Status;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Ticket;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.TicketService;

@SuppressWarnings("serial")
public class UpdateTicketServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		TicketService service = new TicketService();

		int id = Integer.parseInt(req.getParameter("id"));

		Ticket ticket = service.buscar(new Long(id));

		String titulo = req.getParameter("titulo");
		String descricao = req.getParameter("descricao");
		Status status = Status.ABERTO;
		Prioridade prioridade = Prioridade.BAIXA;
		
		ticket.setTitulo(titulo);
		ticket.setDescricao(descricao);
		ticket.setStatus(status);
		ticket.setPrioridade(prioridade);
		ticket.setUsuario(new UsuarioCliente());
		
		service.atualizar(ticket);
		
		resp.sendRedirect("");

		
	}
	
}
