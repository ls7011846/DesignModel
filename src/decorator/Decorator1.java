package decorator;
/**
 * Created by LS on 2018-5-6.
 */
public class Decorator1 extends Decorator {

	public Decorator1(Person person) {
		super(person);
	}
	
	public void before_eat() {
		System.out.println("吃饭前喝水");
	}
	
	public void after_drink() {
		System.out.println("喝水后运动");
	}
	
	public void eat() {
		super.eat();
		before_eat();
	}
	
	public void drink() {
		super.drink();
		after_drink();
	}
}
