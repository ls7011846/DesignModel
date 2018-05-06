package factory.abstract_factory;

public class Customer {
	public static void main(String[] args) {
		BigFactory bigFactory = new BigFactory();
		SmallFactory smallFactory = new SmallFactory();
		
		BigCookie bigCookie = (BigCookie) bigFactory.getCookie();
		
		SmallRice smallRice = (SmallRice) smallFactory.getRice();
	}
}
