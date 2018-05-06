package factory.factory_method;

import factory.simple_factory.Cookie;

public class CookieFactory {
	public Cookie getCookie() {
		return new Cookie();
	}
}
