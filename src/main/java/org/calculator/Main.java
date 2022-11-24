package org.calculator;

public class Main {
	public static void main(String[] args) {
		
		// creo un'istanza della classe calcolatrice
		Calculator c = new Calculator();
		
		System.out.println(c.addition(5, 5));
		System.out.println(c.subtraction(5, 5));
		System.out.println(c.division(5, 5));
		System.out.println(c.multiplication(5, 5));
	}
}
