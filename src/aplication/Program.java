package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario(null, "Artur Antunes", "zico@mengo.com");
		Funcionario f2 = new Funcionario (null, "Leovegildo Junior", "junior@mengo.com");
		Funcionario f3 = new Funcionario (null, "José Carlos", "mozer@mengo.com");
//		System.out.println(f1);
//		System.out.println(f2);
//		System.out.println(f3);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//ADICIONANDO
		
//		em.getTransaction().begin();
//		em.persist(f1);
//		em.persist(f2);
//		em.persist(f3);
//		em.getTransaction().commit();
		
		//BUSCANDO
		
//		Funcionario func = em.find(Funcionario.class, 1);
//		System.out.println(func);
		
		//DELETANDO
		
		Funcionario func = em.find(Funcionario.class, 1);
		em.getTransaction().begin();
		em.remove(func);
		em.getTransaction().commit();
		
		//SEMPRE LEMBRAR DE FECHAR OS ENTITY
		em.close(); 
		emf.close();
		
		
		}

}
