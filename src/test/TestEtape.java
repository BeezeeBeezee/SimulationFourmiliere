package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fourmiliere.Adulte;
import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import fourmiliere.Larve;
import fourmiliere.Nymphe;
import fourmiliere.Oeuf;
import fourmiliere.Ouvriere;

class TestEtape {

	@Test
	void test() {
		Fourmi f = new Fourmi(null);
		System.out.println(f.toString());
		assert(f.getAge()==0);
		assert(f.getVivant()==true);
		assert(f.getResteAManger()==0);
		assert(f.getEtape().getClass().getName() == "fourmiliere.Oeuf");
	}

	@Test
	void testAdulte() {	
		Adulte unAd = new Adulte(null);
		System.out.println("\n" + unAd.getRole());
		System.out.println(unAd.toString());		
	}
	
	@Test
	void testOeuf() {	
		Oeuf unOeuf = new Oeuf(null);
		System.out.println(unOeuf.toString());		
	}
	
	@Test
	void testLarve() {	
		Larve uneLarve = new Larve(null);
		System.out.println(uneLarve.toString());		
	}
	
	@Test
	void testNymphe() {	
		Nymphe uneNymphe = new Nymphe(null);
		System.out.println(uneNymphe.toString());		
	}
	
	@Test
	void testMange() {	
		Adulte unAd = new Adulte(null);
		System.out.println("\nAvant d'avoir mangé : " + unAd.toString());
		double valeurMangerAvant = unAd.getResteAManger();
		assertTrue(unAd.mange(0.5));
		System.out.println("Après avoir mangé :" + unAd.toString());
		assertTrue((unAd.getResteAManger() + 0.5) == valeurMangerAvant);
	}
	
	@Test
	void testVaManger() {	
		Adulte unAd = new Adulte(null);
		double valeurMangerAvant = unAd.getResteAManger();
		assertTrue(unAd.mange(0.5));
		assertTrue((unAd.getResteAManger() + 0.5) == valeurMangerAvant);
		unAd.vaManger();
		assertTrue(unAd.getResteAManger() == valeurMangerAvant);
	}
	
}
