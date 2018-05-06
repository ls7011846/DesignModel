package factory.factory_method;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
import factory.simple_factory.Cookie;

public class CookieFactory {
	public Cookie getCookie() {
		return new Cookie();
	}
}
