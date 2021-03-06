package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioAdm;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioAdmService;

@SuppressWarnings("serial")
public class DeleteUsuarioAdmServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UsuarioAdmService service = new UsuarioAdmService();
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		UsuarioAdm adm = service.buscar(new Long(id));
		
		service.excluir(adm);
		
		resp.sendRedirect("home");
		
	}
	
}
