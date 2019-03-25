package testduotai;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		p.say();
		//问题：子类是否可以重载从父类重写的方法。
		//语法上没有问题 ,但是只暴露了父类的接口，在向上转型的情况下只能调用重写父类的那个方法。如果要调用子类中重写父类的那个方法，应该具体的new一个子类出来，然后调用重载方法。这样就打破了六大原则。
		Child c=new Child();
		c.say("hello");
	}

}
