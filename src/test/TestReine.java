package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fourmiliere.Fourmiliere;
import fourmiliere.Reine;

class TestReine {

	@Test
	void test() {
		
		Fourmiliere f= new Fourmiliere();
		
		assertTrue(f.getSize()==1);
		
		
	}

}
