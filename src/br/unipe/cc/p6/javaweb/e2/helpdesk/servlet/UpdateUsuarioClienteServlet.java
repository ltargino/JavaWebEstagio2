package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Departamento;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioClienteService;

@SuppressWarnings("serial")
public class UpdateUsuarioClienteServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UsuarioClienteService service = new UsuarioClienteService();
		
		int id = Integer.parseInt(req.getParameter("id"));

		UsuarioCliente cliente = service.buscar(new Long(id));

		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setSenha(senha);
		//cliente.setDepartamento(new Departamento());
		
		service.atualizar(cliente);
		
		resp.sendRedirect("home");
		
	}
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UsuarioClienteService service = new UsuarioClienteService();
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		UsuarioCliente usuario_edit = service.buscar(new Long(id));		
		
		req.getSession().setAttribute("usuario_edit", usuario_edit);
		
		resp.sendRedirect("editar_usuario_cliente.jsp");
	}
	
}
