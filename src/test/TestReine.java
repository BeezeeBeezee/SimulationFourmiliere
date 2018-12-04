package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fourmiliere.Fourmiliere;
import fourmiliere.Reine;

class TestReine {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		Fourmiliere f= new Fourmiliere();
	//	Reine ponte=(Reine)f.getRoleReine();
		//ponte.pond(f);
		f.pond();
		
		assertTrue(f.listeFourmis.size()==1);
		
		
	}

}
