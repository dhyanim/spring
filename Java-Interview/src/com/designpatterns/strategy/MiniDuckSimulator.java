package com.designpatterns.strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.setFlyBehaviour(new FlyWithWings());
		mallard.setQuackBehaviour(new MuteQuack());
		mallard.performFly();
		mallard.performQuack();
		
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.setFlyBehaviour(new FlyNoWay());
		rubberDuck.performFly();
	}

}
