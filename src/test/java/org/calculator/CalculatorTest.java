package org.calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	//creo un istanza della classe Calculator per fare i test
	Calculator c = null;
	
	@Test
	@DisplayName("test addizzione")
	public void additionTest() {
		
		//instanziamo la classe Calculator
		c = new Calculator();
		//verifico il metodo
		float result = c.addition(5, 5);
		//verifo se il valore ottenuto e' uguale a quello aspettato
		assertEquals(result,10);
		
	}
	@Test
	@DisplayName("test sottrazione")
	public void subtractionTest() {
		
		//instanziamo la classe Calculator
		c = new Calculator();
		//verifico il metodo
		float result = c.subtraction(5, 5);
		//verifo se il valore ottenuto e' uguale a quello aspettato
		assertEquals(result,0);
		
	}
	@Test
	@DisplayName("test divisione")
	public void divisionTest() {
		
		//instanziamo la classe Calculator
		c = new Calculator();
		//verifico il metodo
		float result = c.division(5, 5);
		//verifo se il valore ottenuto e' uguale a quello aspettato
		assertEquals(result,1);
	}
	@Test
	@DisplayName("test moltiplicazione")
	public void multiplicationTest() {
		
		//instanziamo la classe Calculator
		c = new Calculator();
		//verifico il metodo
		float result = c.multiplication(5, 5);
		//verifo se il valore ottenuto e' uguale a quello aspettato
		assertEquals(result,25);
		
	}
	
//	// Test verifica eccezzioni
//	@Test
//	@DisplayName("test divisione eccezzione")
//	public void illegalDivisionTest() {
//		
//		//instanziamo la classe Calculator
//		c = new Calculator();
//		//verifico il metodo
//		c.division(5, 5);
//		
//	}

}
