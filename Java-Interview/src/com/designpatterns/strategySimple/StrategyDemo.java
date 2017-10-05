package com.designpatterns.strategySimple;

public class StrategyDemo {
	
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = "+ context.executeStrategy(10, 5));
	}

}
