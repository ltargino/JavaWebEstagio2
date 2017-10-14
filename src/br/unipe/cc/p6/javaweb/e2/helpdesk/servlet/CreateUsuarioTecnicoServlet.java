package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioTecnico;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioTecnicoService;

@SuppressWarnings("serial")
public class CreateUsuarioTecnicoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UsuarioTecnico tecnico = new UsuarioTecnico();
		UsuarioTecnicoService service = new UsuarioTecnicoService();

		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		tecnico.setNome(nome);
		tecnico.setEmail(email);
		tecnico.setSenha(senha);
		tecnico.setNivel(0);
		
		service.inserir(tecnico);
		
		resp.sendRedirect("");
		
	}
	
}
