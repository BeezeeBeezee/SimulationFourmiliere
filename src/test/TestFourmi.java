package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fourmiliere.Fourmi;

class TestFourmi {

	@Test
	void test() {
		Fourmi f = new Fourmi();
		System.out.println(f.toString());
		assert(f.getAge()==0);
		assert(f.getVivant()==true);
		assert(f.getResteAManger()==0);
		assert(f.getEtape().getClass().getName() == "fourmiliere.Oeuf");
	}
	
	@Test
	void testIncrementation() {
		Fourmi f = new Fourmi();
		System.out.println(f.toString());
		assert(f.getAge()==0);
		f.incrementAge();
		System.out.println(f.toString());
		assert(f.getAge()==1);
	}
	
	@Test
	void testAjoutAge() {
		Fourmi f = new Fourmi();
		System.out.println(f.toString());
		assert(f.getAge()==0);
		f.ajoutAge(5);
		System.out.println(f.toString());
		assert(f.getAge()==5);
	}
	
	@Test
	void testEvolution() {
		Fourmi f = new Fourmi();
		f.incrementAge();
		f.incrementAge();
		assert(f.getEtape().getClass().getName() == "fourmiliere.Oeuf");
		f.incrementAge();
		f.incrementAge();
		assert(f.getEtape().getClass().getName() == "fourmiliere.Larve");
	}
	
	@Test
	void testIsGonnaDie() {
		Fourmi f = new Fourmi();
		f.incrementAge();
		f.isGonnaDie();
		assert(f.getVivant()==true);
		f.ajoutAge(5);
		f.isGonnaDie();
		assert(f.getVivant()==false);
		//blabla
	}

}
