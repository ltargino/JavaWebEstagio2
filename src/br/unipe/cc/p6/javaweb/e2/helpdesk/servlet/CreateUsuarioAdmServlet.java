package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioAdm;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioAdmService;

@SuppressWarnings("serial")
public class CreateUsuarioAdmServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UsuarioAdm adm = new UsuarioAdm();
		UsuarioAdmService service = new UsuarioAdmService();
		
		String nome = req.getParameter("add_nome");
		String email = req.getParameter("add_email");
		String senha = req.getParameter("add_senha");
		
		adm.setNome(nome);
		adm.setEmail(email);
		adm.setSenha(senha);
		
		service.inserir(adm);
		
		resp.sendRedirect("home");
	}
	
	
}
