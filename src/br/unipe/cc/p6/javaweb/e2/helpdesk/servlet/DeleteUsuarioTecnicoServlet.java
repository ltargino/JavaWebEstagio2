package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioTecnico;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioTecnicoService;

@SuppressWarnings("serial")
public class DeleteUsuarioTecnicoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UsuarioTecnicoService service = new UsuarioTecnicoService();
		
		int id = Integer.parseInt(req.getParameter("id"));

		UsuarioTecnico tecnico = service.buscar(new Long(id));
		
		service.excluir(tecnico);
		
		resp.sendRedirect("home");

	}
	
}
