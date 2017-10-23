package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioService;

@SuppressWarnings("serial")
public class UpdateUsuarioServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UsuarioService service = new UsuarioService();
		
		int id = Integer.parseInt(req.getParameter("id"));

		Usuario usuario = service.buscar(new Long(id));

		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setSenha(senha);
		
		service.atualizar(usuario);
		
		resp.sendRedirect("");
		
		
	}
	
}
