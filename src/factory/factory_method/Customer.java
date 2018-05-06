package factory.factory_method;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
import factory.simple_factory.Cookie;
import factory.simple_factory.Rice;

public class Customer {
	public static void main(String[] args) {
		CookieFactory cookieFactory = new CookieFactory();
		Cookie cookie = cookieFactory.getCookie();
		
		RiceFactory riceFactory = new RiceFactory();
		Rice rice = riceFactory.getRice();
	}
}
