package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fourmiliere.Proie;

class TestProie {

	@Test
	void test() {
		Proie proie = new Proie();
		System.out.println(proie.toString());
	}

}
