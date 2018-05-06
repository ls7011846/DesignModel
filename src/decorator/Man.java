package decorator;
/**
 * Created by LS on 2018-5-6.
 */
public class Man implements Person {

	@Override
	public void eat() {
		System.out.println("吃什么");
	}

	@Override
	public void drink() {
		System.out.println("喝什么");
	}

}
