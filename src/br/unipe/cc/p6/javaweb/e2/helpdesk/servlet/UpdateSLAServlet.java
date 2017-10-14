package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.SLA;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.SLAService;

@SuppressWarnings("serial")
public class UpdateSLAServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		SLAService service = new SLAService();
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		SLA sla = service.buscar(new Long(id));

		service.atualizar(sla);
		
		resp.sendRedirect("");
		
	}
	
}
