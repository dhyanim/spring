package com.designpatterns.strategySimple;

public class OperationAdd implements Strategy {

	@Override
	public int doOPeration(int num1, int num2) {
		
		return num1 + num2; 

	}

}
