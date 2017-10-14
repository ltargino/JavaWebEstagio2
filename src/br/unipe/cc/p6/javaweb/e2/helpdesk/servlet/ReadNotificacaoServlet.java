package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Notificacao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.NotificacaoService;

@SuppressWarnings("serial")
public class ReadNotificacaoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		NotificacaoService service = new NotificacaoService();
		
		int id = Integer.parseInt(req.getParameter("id"));

		Notificacao notificacao = service.buscar(new Long(id));
		
		req.setAttribute("notificacao", notificacao);
		
		RequestDispatcher rd = req.getRequestDispatcher("");
		
		rd.forward(req, resp);
				

	}
	
}
