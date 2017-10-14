package br.unipe.cc.p6.javaweb.e2.helpdesk.model;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

//import java.io.File;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ticket extends AbstractEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String descricao;
	//private List<File> arquivo;
	private Prioridade prioridade;
	private Status status;

	@ManyToOne
	private Usuario usuario;
	
	//constructor
	public Ticket(Long id, String titulo, String descricao, /*List<File> arquivo,*/ Prioridade prioridade, Usuario usuario, Status status) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		//this.arquivo = arquivo;
		this.prioridade = prioridade;
		this.usuario = usuario;
		this.status = status;
		
		this.enviarEmail();
	}
	
	public Ticket() {
		
	}
	
	//gets e sets
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}/*
	public List<File> getArquivo() {
		return arquivo;
	}
	public void setArquivo(List<File> arquivo) {
		this.arquivo = arquivo;
	}*/
	public Prioridade getPrioridade() {
		return prioridade;
	}
	@SuppressWarnings("unused")
	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
		
		SLA sla = new SLA(1L);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	//metodo enviar email criado em ticket
	public boolean enviarEmail () {
		try {
			
			Properties mailServerProperties = new Properties();
			Session getMailSession;
			MimeMessage generateMailMessage;			
			
			// Step1
			System.out.println("\n 1st ===> setup Mail Server Properties..");
			mailServerProperties = System.getProperties();
			mailServerProperties.put("mail.smtp.port", "587");
			mailServerProperties.put("mail.smtp.auth", "true");
			mailServerProperties.put("mail.smtp.starttls.enable", "true");
			mailServerProperties.put("mail.smtp.ssl.trust", "*");
			System.out.println("Mail Server Properties have been setup successfully..");
	 
			// Step2
			System.out.println("\n\n 2nd ===> get Mail Session..");
			getMailSession = Session.getDefaultInstance(mailServerProperties, null);
			generateMailMessage = new MimeMessage(getMailSession);
			generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("targino.larissa@gmail.com"));
			generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("targino.larissa@gmail.com"));
			generateMailMessage.setSubject("Ticket aberto.");
			String emailBody = "Seu ticket foi aberto. <br> Detahes: <br> ID: "+ this.id.toString()+" <br> Titulo: "+this.titulo+"<br> Descrição: "+this.descricao+"<br> Prioridade: "+this.prioridade.toString()+"<br> Status:"+this.status;
			generateMailMessage.setContent(emailBody, "text/html");
			System.out.println("Mail Session has been created successfully..");
	 
			// Step3
			System.out.println("\n\n 3rd ===> Get Session and Send mail");
			Transport transport = getMailSession.getTransport("smtp");
	 
			// Enter your correct gmail UserID and Password
			// if you have 2FA enabled then provide App Specific Password
			transport.connect("smtp.gmail.com", "targino.larissa@gmail.com", "l88507206");
			transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
			transport.close();			
			
			return true; 
		} catch (Exception E){
			E.printStackTrace();
			return false;
		}
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", prioridade=" + prioridade
				+ ", status=" + status + ", usuario=" + usuario + "]";
	}
	
}
