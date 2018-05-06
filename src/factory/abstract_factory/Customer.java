package factory.abstract_factory;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
public class Customer {
	public static void main(String[] args) {
		BigFactory bigFactory = new BigFactory();
		SmallFactory smallFactory = new SmallFactory();
		
		BigCookie bigCookie = (BigCookie) bigFactory.getCookie();
		
		SmallRice smallRice = (SmallRice) smallFactory.getRice();
	}
}
