package factory.simple_factory;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
public class Customer {
	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		Rice rice = (Rice) factory.getFood(1);
		Cookie cookie = (Cookie) factory.getFood(2);
		
	}
}
