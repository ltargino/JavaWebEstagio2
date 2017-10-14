package br.unipe.cc.p6.javaweb.e2.helpdesk.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Departamento;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.DepartamentoService;

@SuppressWarnings("serial")
public class CreateDepartamentoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Departamento departamento = new Departamento();
		DepartamentoService service = new DepartamentoService();

		String nome = req.getParameter("nome");
		String descricao = req.getParameter("descricao");
		
		departamento.setNome(nome);
		departamento.setDescricao(descricao);
		departamento.setUsuariosTecnicos(new ArrayList<UsuarioCliente>());
		
		service.inserir(departamento);
		
		resp.sendRedirect("");
	}
	
}
