package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.UsuarioService;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UsuarioService service = new UsuarioService();

		String id_string = req.getParameter("id");
		
		if (id_string == "") {
			resp.sendRedirect("/");
			return;
		}
		
		int id = Integer.parseInt(id_string);
		
		String senha = req.getParameter("senha");
		
		if(id == 0 || senha.equals("")){
			resp.sendRedirect("/");
			return;
		}
		
		Usuario usuario = service.buscar(new Long(id));
		
		if(usuario == null){
			resp.sendRedirect("/");
			return;
		}
		
		if (usuario.getSenha().equals(senha)) {
			req.getSession().setAttribute("usuario", usuario);
			resp.sendRedirect("home");
		} else {
			resp.sendRedirect("/");
		}
	}
	
}
