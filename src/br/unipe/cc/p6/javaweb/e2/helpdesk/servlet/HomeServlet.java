package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioAdm;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioTecnico;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioAdmService;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioClienteService;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioTecnicoService;

@SuppressWarnings("serial")
public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UsuarioAdmService service_adm = new UsuarioAdmService();
		List<UsuarioAdm> usuarios_adm = service_adm.listar();
		
		req.setAttribute("usuarios_adm", usuarios_adm);		
		
		UsuarioClienteService service_clientes = new UsuarioClienteService();
		List<UsuarioCliente> usuarios_clientes = service_clientes.listar();
		
		req.setAttribute("usuarios_clientes", usuarios_clientes);
		
		UsuarioTecnicoService service_tecnicos = new UsuarioTecnicoService();
		List<UsuarioTecnico> usuarios_tecnicos = service_tecnicos.listar();
		
		req.setAttribute("usuarios_tecnicos", usuarios_tecnicos);		
		
		RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
		
		rd.forward(req, resp);
	}
	
}
