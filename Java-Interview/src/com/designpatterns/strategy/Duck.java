package com.designpatterns.strategy;

abstract class Duck {
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public void swim(){
		System.out.println("All Ducks Swim");
	}
	abstract void display();
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	public void performFly(){
		flyBehaviour.fly();
	}
	
}
