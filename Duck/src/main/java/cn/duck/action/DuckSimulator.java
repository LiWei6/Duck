package cn.duck.action;

import cn.duck.dao.impl.Duck;
import cn.duck.dao.impl.FlyWithRocket;
import cn.duck.dao.impl.FlyWithWings;
import cn.duck.dao.impl.MallardDuck;
import cn.duck.dao.impl.MuteQuack;
import cn.duck.dao.impl.Quack;
import cn.duck.dao.impl.RubberDuck;
import cn.duck.dao.impl.Squack;

public class DuckSimulator {
	
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		Duck rubber = new RubberDuck();
		//野生鸭子的各个属性及输出
		String M_display = mallard.display();
		mallard.setQuackBehavior(new MuteQuack());
		String a = mallard.performQuack();
		mallard.setFlyBehavior(new FlyWithWings());
		String b = mallard.performFly();
		System.out.println("第一只鸭子是一只" + a + "并且" + b + "的鸭子，"+"它可以"+mallard.swim() + "，这是一只" + M_display);
		//橡胶鸭子的各个属性及输出
		String R_display = rubber.display();
		rubber.setQuackBehavior(new Squack());
		String c = rubber.performQuack();
		rubber.setFlyBehavior(new FlyWithRocket());
		String d = rubber.performFly();
		System.out.println("第二只鸭子是一只" + c + "并且" + d + "的鸭子，"+"它可以"+mallard.swim()+ "，这是一只" + R_display);
	}
}
