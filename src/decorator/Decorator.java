package decorator;

/**
 * Created by LS on 2018-5-6.
 */
public class Decorator implements Person {
	
	private Person person;
	
	public Decorator (Person person){
		this.person = person;
	}
	
	
	@Override
	public void eat() {
		person.eat();
	}

	@Override
	public void drink() {
		person.drink();
	}

}
