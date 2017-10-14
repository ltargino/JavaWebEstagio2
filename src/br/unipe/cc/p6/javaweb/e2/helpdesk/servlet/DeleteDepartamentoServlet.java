package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Departamento;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.DepartamentoService;

@SuppressWarnings("serial")
public class DeleteDepartamentoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DepartamentoService service = new DepartamentoService();
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		Departamento departamento = service.buscar(new Long(id));
		
		service.excluir(departamento);
		
		resp.sendRedirect("");
		
	}
	
}
