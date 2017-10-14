package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioClienteService;

@SuppressWarnings("serial")
public class ReadUsuarioClienteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UsuarioClienteService service = new UsuarioClienteService();
		
		int id = Integer.parseInt(req.getParameter("id"));

		UsuarioCliente cliente = service.buscar(new Long(id));
		
		req.setAttribute("cliente", cliente);
		
		RequestDispatcher rd = req.getRequestDispatcher("");
		
		rd.forward(req, resp);
				

	}
	
}
