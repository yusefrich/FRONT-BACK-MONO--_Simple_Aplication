package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//SEMPRE LEMBRAR QUE A CLASSE PRECISA IMPLEMENTAR SERIALIZABLE
//LEMBRAR QUE A CLASSE PRECISA SER ENTITY
@Entity
public class Funcionario implements Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//LEMBRAR DA ANOTAÇÃO DE ID E GENERATED VALUE
	//POREM PARA USAR ID E GENERATED VALUE PRECISO DO PERSISTENCE.XML E DA LIB
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String nome;
	private String email;
	
	public Funcionario(){
		
	}
	public Funcionario(Integer myId, String myNome, String myEmail) {
		id = myId;
		nome = myNome;
		email = myEmail;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString () {
		return "Funcionario [id="+id+", nome="+nome+", email+"+email+"]";
	}
	
	
	
}
