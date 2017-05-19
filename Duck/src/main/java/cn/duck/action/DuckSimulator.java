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
		//Ұ��Ѽ�ӵĸ������Լ����
		String M_display = mallard.display();
		mallard.setQuackBehavior(new MuteQuack());
		String a = mallard.performQuack();
		mallard.setFlyBehavior(new FlyWithWings());
		String b = mallard.performFly();
		System.out.println("��һֻѼ����һֻ" + a + "����" + b + "��Ѽ�ӣ�"+"������"+mallard.swim() + "������һֻ" + M_display);
		//��Ѽ�ӵĸ������Լ����
		String R_display = rubber.display();
		rubber.setQuackBehavior(new Squack());
		String c = rubber.performQuack();
		rubber.setFlyBehavior(new FlyWithRocket());
		String d = rubber.performFly();
		System.out.println("�ڶ�ֻѼ����һֻ" + c + "����" + d + "��Ѽ�ӣ�"+"������"+mallard.swim()+ "������һֻ" + R_display);
	}
}
