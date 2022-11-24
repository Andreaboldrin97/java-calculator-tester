package org.calculator;

public class Calculator {

	
	//metodi di una calcolatrice
	public float addition(float num1, float num2) {
		
		return num1 + num2;
	}
	
	public float subtraction(float num1, float num2) {
		
		return num1 - num2;
	}
	
	public float division(float num1, float num2) throws Exception  {
		//verifico se uno dei due numeri e' uno 0
		if(num1 == 0 || num2 ==0 ) {
			throw new Exception("uno dei due parametri è uno zero non è possibile eseguire l'operazione");
		}
		return num1 / num2;
	}
	
	public float multiplication(float num1, float num2) {
		
		return num1 * num2;
	}
}
