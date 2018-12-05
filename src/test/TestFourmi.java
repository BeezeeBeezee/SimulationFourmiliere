package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fourmiliere.Fourmi;

class TestFourmi {

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
	void testIncrementation() {
		Fourmi f = new Fourmi(null);
		System.out.println(f.toString());
		assert(f.getAge()==0);
		f.incrementAge();
		System.out.println(f.toString());
		assert(f.getAge()==1);
	}
	
	@Test
	void testAjoutAge() {
		Fourmi f = new Fourmi(null);
		System.out.println(f.toString());
		assert(f.getAge()==0);
		f.incrementAge();
		f.incrementAge();
		f.incrementAge();
		f.incrementAge();
		f.incrementAge();
		System.out.println(f.toString());
		assert(f.getAge()==5);
	}
	
	@Test
	void testEvolution() {
		Fourmi f = new Fourmi(null);
		f.incrementAge();
		f.incrementAge();
		assert(f.getEtape().getClass().getName() == "fourmiliere.Oeuf");
		f.incrementAge();
		f.incrementAge();
		assert(f.getEtape().getClass().getName() == "fourmiliere.Larve");
	}
	
	@Test
	void testIsGonnaDie() {
		Fourmi f = new Fourmi(null);
		f.incrementAge();
		boolean b = f.isGonnaDie();
		assert(b == false);
		assert(f.getVivant()==true);
		f.incrementAge();
		f.incrementAge();
		f.incrementAge();
		f.incrementAge();
		f.incrementAge();
		b = f.isGonnaDie();
		assert(b == true);
		assert(f.getVivant()==false);
	}

}
