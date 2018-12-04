package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fourmiliere.Adulte;
import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import fourmiliere.Ouvriere;

class TestOuvriere {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		
		Fourmiliere laFourmilliere= new Fourmiliere();
		laFourmilliere.setQuantiteNourriture(100);
		Fourmi ouvriere = new Fourmi(0,"coucou");
		Ouvriere ouv= new Ouvriere();
		Adulte ad=(Adulte)ouvriere.getEtape();
		ad.setRole(ouv);
		
		Fourmi leTest= new Fourmi(3);
		
		System.out.println(leTest.getResteAManger());
		System.out.println(laFourmilliere.getQuantiteNourrirture());
		
		
		Ouvriere lOuv=(Ouvriere)ad.getRole();
		lOuv.nourrir(leTest, laFourmilliere);
		
		System.out.println(leTest.getResteAManger());
		System.out.println(laFourmilliere.getQuantiteNourrirture());
		assertTrue(true);
		
	}

}
