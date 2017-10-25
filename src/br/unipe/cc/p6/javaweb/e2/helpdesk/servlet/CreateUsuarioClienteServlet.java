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
public class CreateUsuarioClienteServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UsuarioCliente cliente = new UsuarioCliente();
		UsuarioClienteService service = new UsuarioClienteService();
		
		String nome = req.getParameter("add_nome");
		String email = req.getParameter("add_email");
		String senha = req.getParameter("add_senha");
		
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setSenha(senha);
		//cliente.setDepartamento(new Departamento());
		
		service.inserir(cliente);
		
		resp.sendRedirect("home");
		
	}
	
}
