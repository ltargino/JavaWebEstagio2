function mostrarMenuOcorrencias(){

	var colunaContainer = document.getElementById("colunaContainer");
	colunaContainer.innerHTML = [
	  '<table>',
		'<thead>',
		'</thead>',
		'<tbody>',
			'<tr>',
				'<td><input class="buttonsColunaContainer" id="bocorrencias1" type="button" value="cadastrar Ticket" onclick="cadastrarTicket()"/></td>',
			'</tr>',
			'<tr>',
				'<td><input class="buttonsColunaContainer" id="bocorrencias2" type="button" value="Visualizar Ticket " onclick="visualizarTicket()"/></td>',
			'</tr>',
		'</tbody>',
	  '</table>'
	].join("\n");
		
}

function mostrarMenuUsuario(){
	
	var colunaContainer = document.getElementById("colunaContainer");
	colunaContainer.innerHTML = [
	  '<table>',
		'<thead>',
		'</thead>',
		'<tbody>',
			'<tr>',
				'<td><input class="buttonsColunaContainer" id="binventario1" type="button" value="Cadastrar Usuário " onclick="cadastrarUsuario()"/></td>',
			'</tr>',
			'<tr>',
				'<td><input class="buttonsColunaContainer" id="binventario2" type="button" value="Visualizar Usuário " onclick="visualizarUsuario()"/></td>',
			'</tr>',
		'</tbody>',
	  '</table>'
	].join("\n");
	
}

function cadastrarTicket(){
    var frame = document.getElementById("meuFrame");
    frame.src="cadastroticket.html";
	//var x = frame.contentWindow.document.getElementById("meuSectionTicket");
	//alert(x.innerHTML);	
}

function visualizarTicket(){
    var frame = document.getElementById("meuFrame");
    frame.src="visualizarTicket.html";
}

function cadastrarUsuario(){
    var frame = document.getElementById("meuFrame");
    frame.src="cadastrarUsuario.html";
}

function visualizarUsuario(){
    var frame = document.getElementById("meuFrame");
    frame.src="visualizarUsuario.html";
}