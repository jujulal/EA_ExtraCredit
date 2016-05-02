package edu.mum.ExtraCredit.control;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.mum.ExtraCredit.domain.Person;
import edu.mum.ExtraCredit.domain.Movie;


public class Application {

	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("jpa");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {

		addMovies();
		printMoviesReport();
		emf.close();
	}

	private static void printMoviesReport() {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		List<Movie> movies = em.createQuery("from Movie").getResultList();
		for(Movie m:movies){
			System.out.println("Movie Name: " + m.getName() );
			System.out.println("Movie Comment: " + m.getComment() );
			for(Person a:m.getActors()){
				System.out.println("Actor Name: "+a.getName());
			}
		}
	}

	private static void addMovies() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
		

		// TODO your code
			Movie movie = new Movie();

			movie.setName("Putimaya");
			
		//	movie.setRating(5);
			movie.setComment("Best movie");
			movie.setCategory(Genre.Drama);
			
			movie.getActors().add(new Person("Bimal","Hero", 9));
			movie.getActors().add(new Person("Lina Kebede","Heroien",5));
			movie.getActors().add(new Person("Kamun Gumle","Gunda",4));
			
			//adding cover
			Path p = FileSystems.getDefault().getPath("C:\\Users\\Bibek\\Pictures","picture.jpg");
			byte[] fileData = Files.readAllBytes(p);
			movie.setCover(fileData);
			
			em.persist(movie);
			
			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive())) tx.rollback();
			
		} finally {
			if ((em != null) && (em.isOpen())) em.close();
		}
	}

}
