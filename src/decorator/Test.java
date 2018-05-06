package decorator;
/**
 * Created by LS on 2018-5-6.
 */
public class Test {
	public static void main(String[] args) {
		Man man = new Man();
		Decorator1 decorator1 = new Decorator1(man);
		decorator1.eat();
		decorator1.drink();
	}
}
