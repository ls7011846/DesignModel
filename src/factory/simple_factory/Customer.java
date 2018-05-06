package factory.simple_factory;

public class Customer {
	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		Rice rice = (Rice) factory.getFood(1);
		Cookie cookie = (Cookie) factory.getFood(2);
		
	}
}
