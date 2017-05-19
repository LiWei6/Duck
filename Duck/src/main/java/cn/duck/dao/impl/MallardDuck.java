package cn.duck.dao.impl;

public class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public String swim(){
		return super.swim();
	}
	public String display(){
		String a = "Ұ����";
		String b = super.display();
		return a+b;
	}
}
