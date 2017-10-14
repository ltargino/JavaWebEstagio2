package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioAdm;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioAdmService;

@SuppressWarnings("serial")
public class UpdateUsuarioAdmServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UsuarioAdmService service = new UsuarioAdmService();
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		UsuarioAdm adm = service.buscar(new Long(id));
		
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		adm.setNome(nome);
		adm.setEmail(email);
		adm.setSenha(senha);
		
		service.atualizar(adm);
		
		resp.sendRedirect("");
		
	}
	
}
